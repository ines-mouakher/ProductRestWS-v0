package de.tekup.ProductRestWS.service;

import de.tekup.ProductRestWS.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> productList();
    public Product getOne(Long id);
    public Product save(Product produit);
    public Product update(Product produit, Long id);
    public void delete(Long id);

}
