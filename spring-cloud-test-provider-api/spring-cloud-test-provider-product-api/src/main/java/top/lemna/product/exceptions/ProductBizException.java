package top.lemna.product.exceptions;


public class ProductBizException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public ProductBizException(String message) {
    super(message);
  }

  public ProductBizException(String message, Throwable cause) {
    super(message, cause);
  }

  public static String format(String str, Object... args) {
    for (int i = 0; i < args.length; i++) {
      str = str.replaceFirst("\\{\\}", String.valueOf(args[i]));
    }
    return str;
  }
}
