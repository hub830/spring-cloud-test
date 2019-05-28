
package top.lemna.product.service;
 
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import top.lemna.product.model.dto.ProductReduceStockDto;
import top.lemna.product.model.vo.ProductVo;



@FeignClient(value = "spring-clooud-test-provider-product")
public interface ProductProductFeignApi {

	@PostMapping(value = "/api/product/reducestock")
	ProductVo updateCartList(@RequestBody ProductReduceStockDto productReduceStockDto);
}

