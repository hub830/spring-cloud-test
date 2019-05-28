package top.lemna.product.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductReduceStockDto {

  /**
   * 产品编号
   */
  private String productNo;

  /**
   * 数量
   */
  private Long qty;

  public ProductReduceStockDto(String productNo, Long qty) {
    super();
    this.productNo = productNo;
    this.qty = qty;
  }
  
  
}
