package top.lemna.product.web.rpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.lemna.product.model.dto.ProductReduceStockDto;
import top.lemna.product.model.vo.ProductVo;
import top.lemna.product.persistence.domain.Product;
import top.lemna.product.persistence.service.ProductService;
import top.lemna.product.service.ProductProductFeignApi;

@RefreshScope
@RestController
public class ProductFeignClient implements ProductProductFeignApi {

  @Autowired
  private ProductService service;

  @Override
  public ProductVo reduceStock(@RequestBody ProductReduceStockDto dto) {

    Product product = service.reduceStock(dto);
    ProductVo vo = new ProductVo(product.getProductNo(), product.getName(), product.getStock());
    return vo;
  }

}
