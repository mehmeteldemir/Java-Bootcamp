package ders.day5.business.concretes;

import ders.day5.business.abstracts.ProductService;
import ders.day5.core.LoggerService;
import ders.day5.dataAccess.abstracts.IProductDao;
import ders.day5.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private IProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(IProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId()==1){
            System.out.println("Bu kategoride ürün kabul edilmiyor");
            loggerService.logToSystem("Ürün kaydedilemedi");
            return;
        }
        productDao.add(product);
        System.out.printf("");
        loggerService.logToSystem("ürün eklendi");
        System.out.printf("%s adlı ürün %d numaralı kategoriye eklendi" , product.getName(),product.getCategoryId());
    }

    @Override
    public List<Product> getAll() {

        return null;
    }
}
