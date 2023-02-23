package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    
    @Id
    private int id;
    private String name;
    private Double price;

    public Product() {}

    public int getId() {return id;}
    public String getName() {return name;}
    public Double getPrice() {return price;}

    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setPrice(Double price) {this.price = price;}

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

}