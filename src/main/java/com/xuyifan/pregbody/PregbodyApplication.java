package com.xuyifan.pregbody;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xuyifan.pregbody.*"
})
@MapperScan("com.xuyifan.pregbody.mapper")
public class PregbodyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PregbodyApplication.class, args);
    }

}
