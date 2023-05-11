package de.tekup.ProductRestWS.enpoint;



import de.tekup.ProductRestWS.model.Product;
import de.tekup.ProductRestWS.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")// specifier un path pour le web service
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping(produces = {"application/json", "application/xml"})
    public List<Product>  produitList(){
            return productService.productList();
    }

    @GetMapping(path = "/{id}")
   public Product getOne(@PathVariable Long id) {
          return productService.getOne(id);
    }

    @PostMapping
    public Product save(@RequestBody Product product) {

        return productService.save(product);
    }
    @PutMapping(path = "/{id}")
    public Product update(@RequestBody Product product, @PathVariable Long id) {
       return productService.update(product,id);
    }


    @DeleteMapping(path = "/{id}")
     public void delete(@PathVariable Long id) {
          productService.delete(id);
     }


    }

