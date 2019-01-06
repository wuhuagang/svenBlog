package com.steve.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @author wuhuagang
 * @date 2019/1/6
 * @desc
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {
    private static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
    public static Object getBean(String beanName){
        return context.getBean(beanName);
    }

    public static <T> T getBean(Class<T> beanClass){
        return context.getBean(beanClass);
    }

    public static void publish(ApplicationEvent applicationEvent){
        context.publishEvent(applicationEvent);
    }
}
