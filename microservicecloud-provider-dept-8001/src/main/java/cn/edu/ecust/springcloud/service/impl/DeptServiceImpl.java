package cn.edu.ecust.springcloud.service.impl;

import cn.edu.ecust.springcloud.dao.DeptDao;
import cn.edu.ecust.springcloud.entities.Dept;
import cn.edu.ecust.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xubin
 * @Date: 2018/11/30 19:48
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;
    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}
