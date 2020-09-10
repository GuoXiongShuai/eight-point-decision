package com.hz.epd.config;

import com.hz.epd.interceptor.LoginInterceptor;
import com.hz.epd.interceptor.UrlInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: eight-point-decision
 * @description: 登录拦截器配置类
 * @author: 郭雄帅
 * @create: 2020-09-07 15:10
 */
@Configuration
public class LoginConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
        registry.addInterceptor(
                new LoginInterceptor())
        .addPathPatterns("/**")                     //所有路径都被拦截
        .excludePathPatterns(                         //添加不拦截
                "/emp/login"
        );
        registry.addInterceptor(new UrlInterceptor());
    }

}
