package BT1_ArrayList_LinkedList.view;

import BT1_ArrayList_LinkedList.config.Config;

public class Main {
    public Main() {
        while (true) {
            System.out.println("-------------------Product Manager-------------------");
            System.out.println("1.Hiển thị danh sách sản phẩm : ");
            System.out.println("2.Thêm sản phẩm mới : ");
            System.out.println("3.Sửa, cập nhập sản phẩm : ");
            System.out.println("4.Xoá sản phẩm : ");
            System.out.println("5.Tìm kiểm sản phẩm theo tên : ");
            System.out.println("6.Sắp xếp giá sản phẩm tăng dần :  ");
            System.out.println("7.Sắp xếp giá sản phẩm giảm dần : ");
            System.out.println("8.Thoát !!!! ");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            byte choice = Byte.parseByte(Config.Scanner().nextLine());
            switch (choice){
                case 1:
                    new ProductView().productShowList();
                    break;
                case 2:
                    new ProductView().addProduct();
                    break;
                case 3:
                    new ProductView().editProduct();
                    break;
                case 4:
                    new ProductView().deleteProduct();
                    break;
                case 5:
                    new ProductView().searchByName();
                    break;
                case 6:
                    new ProductView().sortPriceIncrease();
                    break;
                case 7:
                    new ProductView().sortPriceReduced();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ : ");
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
