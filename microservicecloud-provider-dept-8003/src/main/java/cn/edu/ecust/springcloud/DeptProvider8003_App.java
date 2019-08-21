package cn.edu.ecust.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: xubin
 * @Date: 2018/11/30 19:54
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8003_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003_App.class, args);
    }
}
