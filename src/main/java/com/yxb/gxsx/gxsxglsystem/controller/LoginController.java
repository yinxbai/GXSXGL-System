package com.yxb.gxsx.gxsxglsystem.controller;

import com.yxb.gxsx.gxsxglsystem.domain.User;
import com.yxb.gxsx.gxsxglsystem.service.UserService;
import com.yxb.gxsx.gxsxglsystem.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author InRoota
 * @date 2022-02-04 18:15.
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

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
    public String login(@RequestParam(name = "username")String username, @RequestParam(name = "password")String password,
                        Model model, HttpServletRequest request) {
        User user = userService.getPwdByUsername(username);
        String pwd = user.getPassWord();
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
