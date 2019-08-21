package cn.edu.ecust.springcloud.service;

import cn.edu.ecust.springcloud.entities.Dept;

import java.util.List;

/**
 * @Author: xubin
 * @Date: 2018/11/30 19:47
 */

public interface DeptService {
    boolean add(Dept dept);
    Dept get(Long id);
    List<Dept> list();
}
