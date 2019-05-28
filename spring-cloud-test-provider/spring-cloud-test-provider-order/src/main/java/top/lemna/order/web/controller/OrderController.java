package top.lemna.order.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lemna.order.model.dto.OrdersSaleDto;
import top.lemna.order.persistence.domain.Orders;
import top.lemna.order.persistence.service.OrdersService;

@RestController
@RequestMapping(value = "/order", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class OrderController {

  @Autowired
  private OrdersService ordersService;

  @PostMapping
  public Orders queryConsumerVoList(@RequestBody OrdersSaleDto ordersSaleDto) {

    return ordersService.sale(ordersSaleDto);
  }
}
