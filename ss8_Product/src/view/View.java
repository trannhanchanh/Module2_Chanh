package view;

import controller.ProductController;
import model.Product;

import java.util.Scanner;

public class View {
    private static ProductController productController = new ProductController();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("--||Chương trình quản lý sản phẩm||--");
            System.out.println("Chọn chức năng quản lý: ");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Chỉnh sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm");
            System.out.println("6. Kết thúc");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    add();
                    break;
                }
                case 2: {

                    display();
                    break;
                }
                case 3: {
//                    serviceProduct.edit();
//                    break;
                }
                case 4: {
                    delete();
                    break;
                }
                case 5: {
//                    serviceProduct.sort();
                }
                default: {
                    System.out.println("Chương trình kêt thúc. Hẹn gặp lại!!!");
                    flag = false;
                }
            }
        } while (flag);
    }

    public static void display() {
        Product[] products = productController.getList();
        for (int i = 0; i < products.length; i++) {
            if(products[i] != null) {
                System.out.println(products[i]);
            }
        }
    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả sản phẩm:");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, price, describe);
        productController.add(product);
        System.out.println("Đã thêm thành công.");

    }

    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần xóa:");
        int delId = Integer.parseInt(scanner.nextLine());
        productController.delete(delId);
        System.out.println("Đã xóa thành công ");
    }
}
