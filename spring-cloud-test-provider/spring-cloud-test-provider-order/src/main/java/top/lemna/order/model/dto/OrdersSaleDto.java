package top.lemna.order.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrdersSaleDto {

  /** 订单编号 */
  private String orderNo;

  /** 产品编号 */
  private String productNo;

  /** 数量 */
  private Long qty;

  public OrdersSaleDto(String orderNo, String productNo, Long qty) {
    super();
    this.orderNo = orderNo;
    this.productNo = productNo;
    this.qty = qty;
  }
}
