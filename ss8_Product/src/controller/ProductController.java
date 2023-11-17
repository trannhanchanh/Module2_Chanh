package controller;

import model.Product;
import service.impl.ProductService;

public class ProductController {
    private static ProductService productService = new ProductService();
    public static Product[] getList() {
        return productService.getList();
    }

     public static void add(Product product) {
        productService.add(product);
    }

    public static void delete(int delId) {
        productService.delete(delId);
    }
}
