package com.shf.spring.mapper;

import com.shf.spring.bean.Account;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface AccountMapper {
    public Account getAcctByName(String name);
}
