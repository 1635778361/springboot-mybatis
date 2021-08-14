package com.yyzq.springbootmybatis.mapper;

import com.yyzq.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserXmlMapper {
    public List<User> getAll();
}
