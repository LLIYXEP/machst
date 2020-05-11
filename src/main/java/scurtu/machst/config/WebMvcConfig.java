package scurtu.machst.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
  //	Необходимо для Vue router
  @Bean
  public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerCustomizer() {
    return container -> {
      container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/")); // Для всех 404 ошибок - возвращаем главную страницу
    };
  }
}
