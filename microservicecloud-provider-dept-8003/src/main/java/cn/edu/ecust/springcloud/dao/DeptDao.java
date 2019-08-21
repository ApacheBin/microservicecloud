package cn.edu.ecust.springcloud.dao;

import cn.edu.ecust.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: xubin
 * @Date: 2018/11/30 19:33
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
