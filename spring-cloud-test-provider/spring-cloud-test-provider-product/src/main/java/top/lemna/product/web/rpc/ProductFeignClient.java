package top.lemna.product.web.rpc;

import org.springframework.web.bind.annotation.RestController;
import top.lemna.product.model.dto.ProductReduceStockDto;
import top.lemna.product.model.vo.ProductVo;
import top.lemna.product.service.ProductProductFeignApi;

@RestController
public class ProductFeignClient implements ProductProductFeignApi{

  @Override
  public ProductVo updateCartList(ProductReduceStockDto productReduceStockDto) {
    // TODO Auto-generated method stub
    return null;
  }

}
