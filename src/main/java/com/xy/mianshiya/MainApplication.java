package com.xy.mianshiya;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;


// todo 如需开启 Redis，须移除 exclude 中的内容
<<<<<<< HEAD

//@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@SpringBootApplication

//@SpringBootApplication(exclude = {RedisAutoConfiguration.class})

=======
<<<<<<< HEAD
//@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@SpringBootApplication
=======
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
>>>>>>> 2247d795a3377690b2ff6ed69a85d11fc8d8d848
>>>>>>> 376fc09c2ae19f3aeddc1b5d8abe6077b0581562
@MapperScan("com.xy.mianshiya.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
