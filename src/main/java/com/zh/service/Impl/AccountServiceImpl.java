package com.zh.service.Impl;

import com.zh.dao.IAccountdao;
import com.zh.pojo.Account;
import com.zh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private IAccountdao iAccountdao;

    @Override
    public List<Account> findAll() {
        System.out.println("Service业务层：查询所有用户...");
        return iAccountdao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("Service业务层：保存用户...");
        iAccountdao.saveAccount(account);
    }

}