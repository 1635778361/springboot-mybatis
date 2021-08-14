package com.yyzq.springbootmybatis.mapper;

import com.yyzq.springbootmybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    public List<Student> selectAll();
}
