package top.lemna.order.persistence.repository;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import top.lemna.order.base.repository.BaseRepository;
import top.lemna.order.persistence.domain.Orders;

@Repository
public interface OrdersRepository extends BaseRepository<Orders,Long> {
  Optional<Orders> findByOrderNo(String orderNo);
}
