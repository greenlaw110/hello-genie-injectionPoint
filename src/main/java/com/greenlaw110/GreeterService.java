package com.greenlaw110;

public class GreeterService {

    @Greeting(language = Language.DA)
    private String greeting;

    public String sayHello(String caller) {
        return String.format("%s, %s", greeting, caller);
    }

}
