package com.cloudberry.com.my;

public class VarArgsDemo {

    public String foo(String... args){
        String result = "";
        for (String arg : args) {
            result = result  + arg;
        }
        return result;
    }
}
