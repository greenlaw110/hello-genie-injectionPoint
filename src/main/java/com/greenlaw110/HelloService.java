package com.greenlaw110;

public class HelloService {

    @Greeting(language = Language.EN)
    private String greeting;

    public String sayHello(String caller) {
        return String.format("%s, %s", greeting, caller);
    }

}
