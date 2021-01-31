package io.harmed.spring.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.User;

import javax.sql.DataSource;

@EnableWebMvcSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /**using a DB*/
        auth.jdbcAuthentication().dataSource(dataSource);


      /*  *//**для создания user/password in memory(without using a DB)*//*
        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("Kseniia").password("1234").roles("EMPLOYEE"))
                .withUser(userBuilder.username("Alena").password("1234").roles("HR"))
                .withUser(userBuilder.username("Kate").password("1234").roles("MANAGER", "SALES"));*/
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("EMPLOYEE", "HR", "MANAGER")
                .antMatchers("/hr_info").hasRole("HR")
                .antMatchers("/managers_info").hasRole("MANAGER")
                .and().formLogin().permitAll();
    }
}
