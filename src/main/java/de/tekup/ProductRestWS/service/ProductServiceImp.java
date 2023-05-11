package de.tekup.ProductRestWS.service;

import de.tekup.ProductRestWS.model.Product;
import de.tekup.ProductRestWS.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImp implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> productList(){

        return productRepository.findAll();
    }


    @Override
    public Product getOne(Long id){
        return productRepository.findById(id).get();}

    @Override
    public Product save(Product product){
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product, Long id){
        product.setId(id);
        return productRepository.save(product);
    }

    @Override
     public void delete(Long id){
        productRepository.deleteById(id);
    }


}

