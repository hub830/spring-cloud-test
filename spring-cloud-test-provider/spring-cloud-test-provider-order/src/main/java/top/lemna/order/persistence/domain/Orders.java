package top.lemna.order.persistence.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import top.lemna.order.base.entity.AutoIdEntity;

/**
 * 产品表
 * 
 * @author toyota
 *
 */
@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Orders extends AutoIdEntity {

  private static final long serialVersionUID = 299101453982987455L;

  /** 订单编号 */
  @Column(length = 32, nullable = false, unique = true)
  private String orderNo;

  /** 产品编号 */
  @Column(length = 64, nullable = false)
  private String productNo;

  /** 数量 */
  @Column(length = 16, nullable = false)
  private Long qty;

  public Orders(String orderNo, String productNo, Long qty) {
    super();
    this.orderNo = orderNo;
    this.productNo = productNo;
    this.qty = qty;
  }
}
