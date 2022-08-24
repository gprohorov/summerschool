package buem.pro.summerschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SummerschoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SummerschoolApplication.class, args);
    }

}
