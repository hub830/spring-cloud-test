package top.lemna.product.persistence.repository;

import org.springframework.stereotype.Repository;
import top.lemna.product.base.repository.BaseRepository;
import top.lemna.product.persistence.domain.Product;

@Repository
public interface ProductRepository extends BaseRepository<Product,Long> {
 
}
