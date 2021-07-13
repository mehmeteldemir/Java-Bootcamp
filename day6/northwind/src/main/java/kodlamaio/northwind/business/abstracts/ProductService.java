package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concrete.Product;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Set;

public interface ProductService {
    DataResult<List<Product>> getAll();

    DataResult<List<Product>> getAllSortByProductNameAsc();

    DataResult<List<Product>> getAll(int pageNo,int pageSize);

    public DataResult<Page> getAllPage(int pageNo,int pageSize);
    Result save(Product product);

    DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategory(String name, int categoryId);

    DataResult<Set<Product>>getByCategoryIdIn(Set<Integer> categories);

    DataResult<Set<Product>> getByProductNameContains(String productName);

    DataResult<Set<Product>> getByProductNameStartingWith(String productName);

    DataResult<Set<Product>> getByNameAndCategory(String name, String category);


}
