package service.impl;

import model.Product;
import repository.impl.ProductRepository;
import service.IProductService;

public class ProductService implements IProductService {
    private static ProductRepository productRepository = new ProductRepository();
    @Override
    public Product[] getList() {
        return productRepository.getList();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete(int delId) {
        productRepository.delete(delId);
    }

    @Override
    public void find() {

    }
}
