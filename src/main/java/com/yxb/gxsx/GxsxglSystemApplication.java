package com.yxb.gxsx;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/**
 * @author YinXuBai
 * @date 2022-01-29
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.yxb.gxsx.*mapper"})
public class GxsxglSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(GxsxglSystemApplication.class, args);
    }

//    /**
//     * mybatis-plus 分页插件  根据需要添加
//     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        return new PaginationInterceptor();
//    }
}
