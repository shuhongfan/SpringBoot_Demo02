package com.shf.spring.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shf.spring.bean.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<User> {
}
