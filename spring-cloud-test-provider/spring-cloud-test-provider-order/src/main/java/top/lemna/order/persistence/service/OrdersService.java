package top.lemna.order.persistence.service;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.lemna.order.base.service.BaseService;
import top.lemna.order.model.dto.OrdersSaleDto;
import top.lemna.order.persistence.domain.Orders;
import top.lemna.order.persistence.repository.OrdersRepository;
import top.lemna.product.model.dto.ProductReduceStockDto;
import top.lemna.product.service.ProductProductFeignApi;

@Service
@Transactional
public class OrdersService extends BaseService<Orders> {

  @Autowired
  private OrdersRepository repository;

  @Resource
  private ProductProductFeignApi productProductFeignApi;


  public Orders sale(OrdersSaleDto dto) {
    ProductReduceStockDto productReduceStockDto =
        new ProductReduceStockDto(dto.getProductNo(), dto.getQty());
    productProductFeignApi.reduceStock(productReduceStockDto);
    return create(dto.getOrderNo(), dto.getProductNo(), dto.getQty());
  }

  public Orders create(String orderNO, String productNo, Long qty) {
    Orders order = new Orders(orderNO, productNo, qty);
    return save(order);
  }

}
