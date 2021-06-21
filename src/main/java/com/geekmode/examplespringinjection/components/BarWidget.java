package com.geekmode.examplespringinjection.components;

import org.springframework.stereotype.Component;

@Component("barWidget")
public class BarWidget implements Widget {

    @Override
    public String getMessage() {
        return "bar-from-component-qualifier";
    }
}
