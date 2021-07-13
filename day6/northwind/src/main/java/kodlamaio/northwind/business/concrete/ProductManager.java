package kodlamaio.northwind.business.concrete;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entity.concrete.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


@Service
public class ProductManager implements ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>>  getAll() {
        return new SuccessDataResult<>(productDao.findAll(), "success");
    }

    @Override
    public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);
        return new SuccessDataResult<>(productDao.findAll(pageable).getContent());
    }

    @Override
    public DataResult<List<Product>> getAllSortByProductNameAsc() {
        Sort sort = Sort.by(Sort.Direction.ASC,"productName");
        return new SuccessDataResult<>(productDao.findAll(sort));
    }

    public DataResult<Page> getAllPage(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);
        return new SuccessDataResult<>(productDao.findAll(pageable));
    }

    @Override
    public Result save(Product product) {
        productDao.save(product);
        return new SuccessResult(product.getProductName() + " saved successfully");
    }

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccessDataResult<>(productDao.getByProductName(productName),"Data listelendi");
    }

    @Override
    public DataResult<Product> getByProductNameAndCategory(String name, int categoryId) {
        return new SuccessDataResult<>(productDao.getByProductNameAndCategory_Id(name,categoryId));
    }


    @Override
    public DataResult<Set<Product>> getByCategoryIdIn(Set<Integer> categories) {
        return new SuccessDataResult<>(productDao.getByCategoryIdIn(categories),"Data listelendi");
    }

    @Override
    public DataResult<Set<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<>(productDao.getByProductNameContains(productName),"Data listelendi");
    }

    @Override
    public DataResult<Set<Product>> getByProductNameStartingWith(String productName) {
        return new SuccessDataResult<>(productDao.getByProductNameStartingWith(productName),"Data listelendi");
    }

    @Override
    public DataResult<Set<Product>> getByNameAndCategory(String name, String category) {
        return new SuccessDataResult<>(productDao.getByNameAndCategory(name,category),"Data listelendi");
    }
}
