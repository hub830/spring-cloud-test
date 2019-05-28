package top.lemna.product.persistence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.lemna.product.base.service.BaseService;
import top.lemna.product.persistence.domain.Product;
import top.lemna.product.persistence.repository.ProductRepository;

@Service
@Transactional
public class ProductService extends BaseService<Product> {

  @Autowired
  private ProductRepository repository;
 
  public Product create(String productNO, String name, Long stock)
  {
    Product product = new Product(productNO, name, stock);
    return save(product);
  }
}
