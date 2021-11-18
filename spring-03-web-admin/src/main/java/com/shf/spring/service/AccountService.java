package com.shf.spring.service;

import com.shf.spring.bean.Account;
import com.shf.spring.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public Account getAcctByName(String name){
        return accountMapper.getAcctByName(name);
    }
}
