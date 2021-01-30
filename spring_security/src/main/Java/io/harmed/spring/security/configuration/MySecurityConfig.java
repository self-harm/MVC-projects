package io.harmed.spring.security.configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MySecurityConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*для создания user/password in memory(without using a DB)*/
        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("Kseniia").password("1234").roles("EMPLOYEE"))
                .withUser(userBuilder.username("Alena").password("1234").roles("HR"))
                .withUser(userBuilder.username("Kate").password("1234").roles("MANAGER", "SALES"));
    }
}
