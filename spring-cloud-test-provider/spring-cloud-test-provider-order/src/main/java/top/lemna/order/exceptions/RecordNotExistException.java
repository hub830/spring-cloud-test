package top.lemna.order.exceptions;

import java.math.BigInteger;
import java.text.MessageFormat;
import top.lemna.product.exceptions.ProductBizException;

public class RecordNotExistException extends ProductBizException {
  private static final long serialVersionUID = 1L;
  
  private String recordId;

  public RecordNotExistException(Long id) {
    super(MessageFormat.format("数据库中不存在ID为[{0}]的记录", id));
    recordId = id.toString();
  }

  public RecordNotExistException(BigInteger id) {
    super(MessageFormat.format("数据库中不存在ID为[{0}]的记录", id));
    recordId = id.toString();
  }

  public String getRecordId() {
    return recordId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }
  
}
