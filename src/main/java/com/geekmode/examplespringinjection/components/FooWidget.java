package com.geekmode.examplespringinjection.components;

import org.springframework.stereotype.Component;

@Component("fooWidget")
public class FooWidget implements Widget {
    public String getMessage() {
        return "foo-from-component-qualifier";
    }
}
