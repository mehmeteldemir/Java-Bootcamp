package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.entity.concrete.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
