package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entity.concrete.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface ProductDao extends JpaRepository<Product,Integer> {

    Product getByProductName(String productName);

    Product getByProductNameAndCategory_Id(String name, int categoryId);

    Set<Product> getByCategoryIdIn(Set<Integer> categories);

    Set<Product> getByProductNameContains(String productName);

    Set<Product> getByProductNameStartingWith(String productName);

    @Query("From Product where productName=:name and category=:category")
    Set<Product> getByNameAndCategory(String name, String category);


}
