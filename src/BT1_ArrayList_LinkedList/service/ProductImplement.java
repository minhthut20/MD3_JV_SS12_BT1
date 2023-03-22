package BT1_ArrayList_LinkedList.service;

import BT1_ArrayList_LinkedList.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductImplement implements IProductService<Product> {
    static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"Cơm",15));
        productList.add(new Product(2,"Cháo",10));
        productList.add(new Product(3,"Phở",20));
        productList.add(new Product(4,"Bún",25));
    }
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product save(Product product) {
        Product currentProduct = findById(product.getId());
        if (currentProduct==null){
        productList.add(product);
        return product;
        }else {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId()== product.getId()){
                    productList.set(i,product);
                }
            }
        }
        return product;
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId()==id){
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public Product delete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId()==id){
                return productList.remove(i);
            }
        }
        return null;
    }

    @Override
    public void  findByName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getName().equals(name)){
                System.out.println(product);
            }
        }

    }
}
