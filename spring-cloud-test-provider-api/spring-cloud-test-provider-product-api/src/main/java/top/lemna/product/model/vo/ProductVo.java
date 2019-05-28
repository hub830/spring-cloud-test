package top.lemna.product.model.vo;

import lombok.Data;

@Data
public class ProductVo {

  /** 产品编号 */
  private String productNo;

  /** 产品名称 */
  private String name;

  /** 库存 */
  private Long stock;

  public ProductVo(String productNo, String name, Long stock) {
    super();
    this.productNo = productNo;
    this.name = name;
    this.stock = stock;
  }  
}
