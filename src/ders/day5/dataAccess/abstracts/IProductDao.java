package ders.day5.dataAccess.abstracts;

import ders.day5.entities.concretes.Product;

import java.util.List;

public interface IProductDao {
    void add(Product product);
    void delete(Product product);
    void update(Product product);
    Product get(int id);
    List<Product> getAll();


}
