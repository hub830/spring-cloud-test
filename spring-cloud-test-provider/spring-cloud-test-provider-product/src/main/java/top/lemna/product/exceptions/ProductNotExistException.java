package top.lemna.product.exceptions;

public class ProductNotExistException extends ProductBizException {
  private static final long serialVersionUID = 1L;
  
  private String productNo;

  public ProductNotExistException(String productNo) {
    super(format("{} 产品不存在", productNo));
    this.productNo = productNo;
  }

  public String getProductNo() {
    return productNo;
  }

  public void setProductNo(String productNo) {
    this.productNo = productNo;
  }

  
}
