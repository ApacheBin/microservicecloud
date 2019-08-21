package cn.edu.ecust.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: xubin
 * @Date: 2018/11/30 22:12
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"cn.edu.ecust.springcloud"})
@ComponentScan("cn.edu.ecust")
public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
