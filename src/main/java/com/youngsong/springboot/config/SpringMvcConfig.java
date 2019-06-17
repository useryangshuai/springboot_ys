package com.youngsong.springboot.config;

import com.youngsong.springboot.interceptor.TestHandlerInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//WebMvcConfiguration === WebMvcConfigurationSupport
@SpringBootConfiguration
public class SpringMvcConfig extends WebMvcConfigurationSupport {
//    @Override
//    public void configurePathMatch(PathMatchConfigurer configurer) {
//        configurer.setUseRegisteredSuffixPatternMatch(true);
//    }
//
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet) {
//        ServletRegistrationBean<DispatcherServlet> servletServletRegistrationBean = new ServletRegistrationBean<>(dispatcherServlet);
//        servletServletRegistrationBean.addUrlMappings("*.html");
//        return servletServletRegistrationBean;
//    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        TestHandlerInterceptor testHandlerInterceptor = new TestHandlerInterceptor();
        registry.addInterceptor(testHandlerInterceptor).addPathPatterns("/**");
    }
}
