package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public String createProduct(Product product) {
        try {
            if(!productRepository.existsByName(product.getName())) {
                product.setId(null == productRepository.findMaxId()? 0 : productRepository.findMaxId() + 1);
                productRepository.save(product);
                return "Product record created successfully!";
            } else {
                return "Product already exists in the database!";
            }
        } catch(Exception p) {
            throw p;
        }
    }

    public List<Product> readProducts() {
        return productRepository.findAll();
    }

    @Transactional
    public String updateProduct(Product product) {
        if(productRepository.existsByName(product.getName())) {
            try {
                List<Product> products = productRepository.findByName(product.getName());
                products.stream().forEach(p -> {
                    Product productToBeUpdate = productRepository.findById(p.getId()).get();
                    productToBeUpdate.setName(product.getName());
                    productToBeUpdate.setPrice(product.getPrice());
                    productRepository.save(productToBeUpdate);
                });
                return "Product record updated!";
            } catch(Exception e) {
                throw e;
            }
        } else {
            return "Product does not exists in the database!";
        }
    }

    @Transactional
    public String deleteProduct(Product product){
        if(productRepository.existsByName(product.getName())) {
            try {
                List<Product> products = productRepository.findByName(product.getName());
                products.stream().forEach(p -> {
                    productRepository.delete(p);
                });
                return "Product record deleted successfully!";
            } catch(Exception p) {
                throw p;
            }

        } else {
            return "Product does not exist!";
        }
    }
}
