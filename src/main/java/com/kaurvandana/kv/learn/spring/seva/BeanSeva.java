package com.kaurvandana.kv.learn.spring.seva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanSeva {

    @Autowired
    private AutowireSeva autowireSeva;

    public void code() {
        System.out.println(" i am BeanSeva");
    }

    public void callAutowireSeva() {
        autowireSeva.iamAutowireSeva();
    }
}
