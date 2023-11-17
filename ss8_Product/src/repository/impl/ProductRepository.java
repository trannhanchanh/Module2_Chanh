package repository.impl;

import model.Product;
import repository.IProductRepository;

public class ProductRepository implements IProductRepository {
    private static Product[] products = new Product[10];

    static {
        products[0] = new Product(1, "kẹo", 5000, "Ok");
        products[1] = new Product(2, "bánh", 10000, "Ok");
        products[2] = new Product(3, " nước ngọt", 15000, "Ok");
    }

    @Override
    public Product[] getList() {
        return products;
    }

    @Override
    public void add(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete(int delId) {
        for (int i = 0; i < products.length; i++) {
            if (delId == products[i].getId()) {
                products[i] = null;
                break;
            }
        }
    }

    @Override
    public void find() {

    }
}
