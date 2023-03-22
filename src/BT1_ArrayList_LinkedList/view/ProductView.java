package BT1_ArrayList_LinkedList.view;

import BT1_ArrayList_LinkedList.config.Config;
import BT1_ArrayList_LinkedList.controller.ProductController;
import BT1_ArrayList_LinkedList.model.Product;
import BT1_ArrayList_LinkedList.service.ProductComparator;

import java.util.Collections;
import java.util.List;

public class ProductView {
    ProductController productController = new ProductController();
    public void productShowList(){
        List<Product> productList = productController.findAll();
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    public void addProduct(){
        List<Product> productList = productController.findAll();
        int id = productList.get(productList.size()-1).getId()+1;
        System.out.println("Nhập tên sản phẩm : ");
        String nameProduct = Config.Scanner().nextLine();
        System.out.println("Nhập giá sản phẩm : ");
        int priceProduct = Integer.parseInt(Config.Scanner().nextLine());
        Product product = new Product(id,nameProduct,priceProduct);
        productController.addNewProduct(product);
        System.out.println("Thêm vào thành công!");
    }

    public void editProduct(){
        System.out.println("Nhập Product ID muốn sửa : ");
        int id = Integer.parseInt(Config.Scanner().nextLine());
        System.out.println("Sửa tên : ");
        String nameProduct = Config.Scanner().nextLine();
        System.out.println("Sửa giá : ");
        int priceProduct = Integer.parseInt(Config.Scanner().nextLine());
        Product newProduct = new Product(id,nameProduct,priceProduct);
        productController.editProduct(newProduct);
        System.out.println("Cập nhật thành công!!!");
    }

    public void deleteProduct(){
        System.out.println("Nhập vào Product ID muốn xoá : ");
        int id = Integer.parseInt(Config.Scanner().nextLine());
        productController.deleteProduct(id);
    }
    public void sortPriceIncrease(){
        ProductComparator productComparator = new ProductComparator();
        Collections.sort(productController.findAll(),productComparator);
        this.productShowList();
    }

    public void sortPriceReduced(){
        ProductComparator productComparator = new ProductComparator();
        Collections.sort(productController.findAll(),productComparator);
        this.productShowList();
    }
    public void searchByName(){
        System.out.println("Nhập vào tên muốn tìm kiếm : ");
        String name = Config.Scanner().nextLine();
        productController.searchByName(name);
    }
}
