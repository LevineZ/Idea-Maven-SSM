package com.zh.controller;

import com.zh.pojo.Account;
import com.zh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询账户
     * @param model
     * @return
     */
    @RequestMapping("/account/findAll")
    public String findAll(Model model){
        System.out.println("Controller表现层：查询所有账户...");
        List<Account> list = accountService.findAll();  //调用service中的方法
        model.addAttribute("list", list);
        return "list";  //在视图解析器中配置了前缀后缀
    }

    /**
     * 保存
     * @param account
     * @param request
     * @param response
     * @throws IOException
     * @throws IOException
     */
    @RequestMapping("/account/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }

}

