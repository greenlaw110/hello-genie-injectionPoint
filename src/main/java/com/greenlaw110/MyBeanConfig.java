package com.greenlaw110;

import org.osgl.inject.BeanSpec;
import org.osgl.inject.annotation.Provides;

public class MyBeanConfig {

    @Provides
    @Farewell
    public String farewell(BeanSpec spec) {
        Farewell farewell = spec.getAnnotation(Farewell.class);
        return (Language.DA == farewell.language()) ? "Bye Verden" : "Bye World";
    }

    @Provides
    @Greeting
    public String greeting(BeanSpec spec) {
        Greeting greeting = spec.getAnnotation(Greeting.class);
        return (Language.DA == greeting.language()) ? "Hej Verden" : "Hello World";
    }

}
