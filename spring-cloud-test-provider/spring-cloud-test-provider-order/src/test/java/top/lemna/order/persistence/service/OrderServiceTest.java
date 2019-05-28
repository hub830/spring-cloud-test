package top.lemna.order.persistence.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.lemna.order.persistence.domain.Orders;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OrderServiceTest {

  @Autowired
  OrdersService service;

  @BeforeEach
  void setup() throws Exception {
  }

  @Test
  void testCreate() {

    Orders order = service.create("TEST_ORDER_001","H001",1L);

    assertThat(order.getId(),greaterThan(0L));
  }

}
