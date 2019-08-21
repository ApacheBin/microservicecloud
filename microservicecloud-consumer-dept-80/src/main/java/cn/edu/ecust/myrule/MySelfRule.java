package cn.edu.ecust.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: xubin
 * @Date: 2018/12/2 15:00
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RoundRobinRule_XB();
    }
}
