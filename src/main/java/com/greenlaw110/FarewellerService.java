package com.greenlaw110;


public class FarewellerService {

    @Farewell(language = Language.EN)
    private String farewell;

    public String sayBye(String caller) {
        return String.format("%s, %s", farewell, caller);
    }

}
