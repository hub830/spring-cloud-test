package top.lemna.order.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
  
  @GetMapping("/demo/admin")
  @PreAuthorize("hasAuthority('query-admin')")
  public String getDemo1() {
    return "admin";
  }

  @GetMapping("/demo/user")
  @PreAuthorize("hasAuthority('query-user')")
  public String getDemo2() {
    return "user";
  }
}
