package com.yxb.gxsx.Interceptor;

import com.yxb.gxsx.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author YinXuBai
 * @date 2022-02-04 18:01.
 */
@Slf4j
public class UserLoginInterceptor implements HandlerInterceptor{


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.debug("执行了拦截器的preHandle方法");

        HttpSession session = request.getSession();
        try {
            User user = (User)session.getAttribute("user");
            if (user!=null){
                return true;
            }
            response.sendRedirect(request.getContextPath()+"login");
        }catch (Exception e){
            e.printStackTrace();
        }
        //如果设置为false时，被请求时，拦截器执行到此处将不会继续操作
        //如果设置为true时，请求将会继续执行后面的操作
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.debug("执行了拦截器的postHandle方法");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.debug("执行了拦截器的afterCompletion方法");
    }
}
