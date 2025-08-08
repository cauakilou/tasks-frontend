package br.ce.wcaquino.tasksfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean; // Importe esta classe
import org.springframework.boot.web.servlet.support.ErrorPageFilter; // Importe esta classe
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean; // Importe esta classe

@SpringBootApplication
public class TasksFrontendApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TasksFrontendApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TasksFrontendApplication.class, args);
    }

    // APAGUE ESTE MÉTODO INTEIRO
    @Bean
    public FilterRegistrationBean<ErrorPageFilter> errorPageFilterRegistration() {
        FilterRegistrationBean<ErrorPageFilter> registration = new FilterRegistrationBean<>(new ErrorPageFilter());
        registration.setEnabled(false);
        return registration;
    }
}