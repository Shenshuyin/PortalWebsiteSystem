package com.wuhao.wuhaozn_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.SessionTrackingMode;
import java.util.Collections;

@SpringBootApplication
@MapperScan({"com.wuhao.wuhaozn_springboot.mapper","com.wuhao.wuhaozn_springboot.protal_mapper"})
public class WuhaoznSpringbootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WuhaoznSpringbootApplication.class, args);
    }

//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        super.onStartup(servletContext);
//        servletContext.setSessionTrackingModes(Collections.singleton(SessionTrackingMode.COOKIE));
//        SessionCookieConfig sessionCookieConfig=servletContext.getSessionCookieConfig();
//        sessionCookieConfig.setHttpOnly(true);
//    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(WuhaoznSpringbootApplication.class);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        servletContext.setSessionTrackingModes(Collections.singleton(SessionTrackingMode.COOKIE));
        SessionCookieConfig sessionCookieConfig=servletContext.getSessionCookieConfig();
        sessionCookieConfig.setHttpOnly(true);
    }
}


