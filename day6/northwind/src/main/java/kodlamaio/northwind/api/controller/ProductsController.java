package kodlamaio.northwind.api.controller;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concrete.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {

    ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public DataResult<List<Product>> getAll() {
        return productService.getAll();
    }

    @GetMapping("/getAllByPage")
    public DataResult<List<Product>> getAll(@RequestParam int pageNo,@RequestParam int pageSize){
        return productService.getAll(pageNo, pageSize);
    }

    @GetMapping("/getAllByPages")
    public DataResult<Page> getAllPage(@RequestParam int pageNo, @RequestParam int pageSize){
        return productService.getAllPage(pageNo, pageSize);
    }

    @GetMapping("getAllSortByProductNameAsc")
    public DataResult<List<Product>> getAllSortByProductNameAsc() {
        return productService.getAllSortByProductNameAsc();
    }

    @PostMapping()
    public Result add(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName) {
        return productService.getByProductName(productName);
    }

    @GetMapping("/getByProductAndCategory")
    public DataResult<Product> getByProductNameAndCategory(String name, int categoryId) {
        return productService.getByProductNameAndCategory(name,categoryId);
    }



}
