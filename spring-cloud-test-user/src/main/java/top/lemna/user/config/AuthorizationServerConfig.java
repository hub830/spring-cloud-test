package top.lemna.user.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private RedisConnectionFactory redisConnectionFactory;

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Bean
  public RedisTokenStore tokenStore() {
    return new RedisTokenStore(redisConnectionFactory);
  }

  @Override
  public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
    security//
        .tokenKeyAccess("permitAll()")//
        .checkTokenAccess("isAuthenticated()");
  }

  @Override
  public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
    clients//
        .inMemory()//
        .withClient("ios")//
        .scopes("all")//
        .secret(passwordEncoder.encode("ios"))//
        .authorizedGrantTypes("password");
  }

  @Override
  public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
    endpoints//
        .authenticationManager(authenticationManager)//
        .tokenStore(tokenStore());

  }


}
