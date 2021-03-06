package cn.edu.ecust.springcloud.controller;

import cn.edu.ecust.springcloud.entities.Dept;
import cn.edu.ecust.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: xubin
 * @Date: 2018/11/30 22:08
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService service;
    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept){
        return this.service.add(dept);
    }
    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id) {
        return this.service.get(id);
    }
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list() {
        return this.service.list();
    }
}
