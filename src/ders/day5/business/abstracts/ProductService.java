package ders.day5.business.abstracts;

import ders.day5.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
