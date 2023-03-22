package BT1_ArrayList_LinkedList.service;

import BT1_ArrayList_LinkedList.model.Product;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        float result = o1.getPrice()-o2.getPrice();
        if (result > 0 ){
            return 1;
        }else if (result<0){
            return -1;
        }else {
            return 0;
        }
    }
}
