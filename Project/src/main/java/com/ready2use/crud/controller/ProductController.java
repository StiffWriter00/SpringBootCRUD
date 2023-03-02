package com.ready2use.crud.controller;

import java.util.List;

import com.ready2use.crud.entity.Product;
import com.ready2use.crud.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(){
        return "The application is running...";
    }

    @RequestMapping(value = "readproducts", method = RequestMethod.GET)
    public List<Product> readProducts(){
        return productService.readProducts();
    }

    @RequestMapping(value = "createproduct", method = RequestMethod.POST)
    public String createProduct(@RequestBody Product student){
        return productService.createProduct(student);
    }

    @RequestMapping(value = "updateproduct", method = RequestMethod.PUT)
    public String updateProduct(@RequestBody Product student){
        return productService.updateProduct(student);
    }

    @RequestMapping(value = "deleteproduct", method = RequestMethod.DELETE)
    public String deleteProduct(@RequestBody Product student){
        return productService.deleteProduct(student);
    }

}
