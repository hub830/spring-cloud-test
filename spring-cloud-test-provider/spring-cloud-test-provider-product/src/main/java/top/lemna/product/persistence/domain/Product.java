package top.lemna.product.persistence.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import top.lemna.product.base.entity.AutoIdEntity;

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
public class Product extends AutoIdEntity {

  private static final long serialVersionUID = 299101453982987455L;

  /** 产品编号 */
  @Column(length = 32, nullable = false, unique = true)
  private String productNo;

  /** 产品名称 */
  @Column(length = 64, nullable = false)
  private String name;

  /** 库存 */
  @Column(length = 16, nullable = false)
  private Long stock;

  public Product(String productNo, String name, Long stock) {
    super();
    this.productNo = productNo;
    this.name = name;
    this.stock = stock;
  }
  
}
