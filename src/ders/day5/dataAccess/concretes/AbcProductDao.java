package ders.day5.dataAccess.concretes;

import ders.day5.dataAccess.abstracts.IProductDao;
import ders.day5.entities.concretes.Product;

import java.util.List;

public class AbcProductDao implements IProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Abc ile eklendi");
    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
