package com.guanpei.springcloud.dao;

import com.guanpei.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
