package BT1_ArrayList_LinkedList.controller;

import BT1_ArrayList_LinkedList.model.Product;
import BT1_ArrayList_LinkedList.service.ProductImplement;

import java.util.List;

public class ProductController {
    ProductImplement productImplement = new ProductImplement();
    public List<Product> findAll(){
        return productImplement.findAll();
    }
    public void addNewProduct(Product product){
        productImplement.save(product);
    }

    public void editProduct(Product product){
        productImplement.save(product);
    }
    public void deleteProduct(int id){
        productImplement.delete(id);
    }
    public void searchByName(String name){
        productImplement.findByName(name);
    }
}
