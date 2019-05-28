package top.lemna.product.persistence.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.lemna.product.persistence.domain.Product;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ProductServiceTest {

  @Autowired
  private ProductService service;

  Product product;

  @BeforeEach
  void setUp() throws Exception {
  }
  
  @Test
  void testCreate() {
    product = service.create("H001","测试产品",100L);

    assertThat(product.getId(),greaterThan(0L));
  }

}
