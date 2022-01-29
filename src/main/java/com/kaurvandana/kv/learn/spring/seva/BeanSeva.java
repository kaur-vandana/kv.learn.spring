package com.kaurvandana.kv.learn.spring.seva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
if @Component is missing , you get
org.springframework.beans.factory.NoSuchBeanDefinitionException :
                                    No qualifying bean of type 'com.kaurvandana.kv.learn.spring.seva.BeanSeva' available
*/
@Component
public class BeanSeva {

//  if we don't add the @Autowired, we get java.lang.NullPointerException :
//  Cannot invoke "com.kaurvandana.kv.learn.spring.seva.AutowireSeva.iamAutowireSeva()" because "this.autowireSeva" is null
    @Autowired
    private AutowireSeva autowireSeva;

    public void code() {
        System.out.println(" i am BeanSeva");
    }

    public void callAutowireSeva() {
        autowireSeva.iamAutowireSeva();
    }
}
