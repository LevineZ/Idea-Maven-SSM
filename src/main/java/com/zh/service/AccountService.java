package com.zh.service;

import com.zh.pojo.Account;

import java.util.List;

public interface AccountService {
    // 查询所有用户
    public List<Account> findAll();

    // 保存用户信息
    public void saveAccount(Account account);
}
