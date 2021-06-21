package com.geekmode.examplespringinjection.beans;

import org.springframework.stereotype.Component;

@Component
class FunctionNameMatchingUser {

    private final String foo;
    private final String bar;

    public FunctionNameMatchingUser(String fooByFunctionName,
                                    String barByFunctionName) {
        this.foo = fooByFunctionName;
        this.bar = barByFunctionName;
    }

    public String getFoo() {
        return foo;
    }

    public String getBar() {
        return bar;
    }
}
