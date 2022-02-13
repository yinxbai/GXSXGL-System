package com.yxb.gxsx.controller;


import com.yxb.gxsx.entity.User;
import com.yxb.gxsx.service.CheckService;
import com.yxb.gxsx.service.UserService;
import com.yxb.gxsx.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author YinXuBai
 * @date 2022-02-04 18:15.
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private CheckService checkService;

    @RequestMapping(value = {"", "/", "/index"}, method = RequestMethod.GET)
    public String index(Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "users/index";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String loginIndex() {
        return "users/login";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(@RequestParam(name = "username")String account, @RequestParam(name = "password")String password,
                        Model model, HttpServletRequest request) {
        User user = userService.getPwdByAccount(account,password);
        String pwd = user.getPassword();
        String password1 = MD5Utils.convertMD5(password).toUpperCase();
        String password2 = MD5Utils.convertMD5(password1).toUpperCase();
        if (pwd.equals(password2)) {
            model.addAttribute("user", user);
            request.getSession().setAttribute("user", user);
            return "redirect:/index";
        } else {
            return "users/failed";
        }
    }

}
