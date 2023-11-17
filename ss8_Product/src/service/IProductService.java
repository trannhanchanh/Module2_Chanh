package service;

import model.Product;

public interface IProductService {
    Product[] getList();

    void add(Product product);

    void edit();
    void delete(int delId);
    void find();
}
