package fun.jingo.technology;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("fun.jingo.technology.dao")
public class TechnologyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TechnologyApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TechnologyApplication.class);
    }

}
