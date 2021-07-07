package ders.day5;

import ders.day5.business.abstracts.ProductService;
import ders.day5.business.concretes.ProductManager;
import ders.day5.core.JLoggerManagerAdapter;
import ders.day5.dataAccess.concretes.AbcProductDao;
import ders.day5.dataAccess.concretes.HibernateProductDao;
import ders.day5.entities.concretes.Product;

public class Day5Test {
    public static void main(String[] args) {

        ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        Product product = new Product(1, 1, "iPhone X", 7500, 100);

        productService.add(product);

    }
}
