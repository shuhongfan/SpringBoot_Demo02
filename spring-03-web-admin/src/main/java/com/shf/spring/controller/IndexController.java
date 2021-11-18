package com.shf.spring.controller;

import com.shf.spring.bean.Account;
import com.shf.spring.bean.City;
import com.shf.spring.bean.User;
import com.shf.spring.service.AccountService;
import com.shf.spring.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountService accountService;

    @Autowired
    CityService cityService;

    @ResponseBody
    @PostMapping("/city")
    public City saveCity(City city){
        cityService.saveCity(city);
        return city;
    }

    @ResponseBody
    @GetMapping("/city")
    public City getCity(@RequestParam("id") Long id){
        return cityService.getCityById(id);
    }

    @ResponseBody
    @GetMapping("/acct")
    public Account getByName(@RequestParam("name") String name) {
        return accountService.getAcctByName(name);
    }

    @ResponseBody
    @GetMapping("/sql")
    public String queryFormDB1(){
        Long count = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        return count.toString();
    }

    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        System.out.println(user);
        if (StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassword())){
            session.setAttribute("loginUser",user);
//        登陆成功 重定向到main.html 防止表单重复提交
            return "redirect:/index.html";
        } else {
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
    }

    /**
     * 去main页面
     * @return
     */
    @GetMapping("/index.html")
    public String mainPage(HttpSession session,Model model){
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser!=null){
//            return "main";
//        } else {
//            model.addAttribute("msg", "未登录");
//            return "login";
//        }
        return "main";
    }
}
