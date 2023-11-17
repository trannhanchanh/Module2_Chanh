package repository;

import model.Product;

public interface IProductRepository {
    Product[] getList();

    void add(Product product);

    void edit();
    void delete(int delId);
    void find();

}
