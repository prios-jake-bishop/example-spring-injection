package com.geekmode.examplespringinjection.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class NamedBeanUser {

    private final String foo;
    private final String bar;

    public NamedBeanUser(@Qualifier("fooByName") String foo,
                         @Qualifier("barByName") String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public String getFoo() {
        return foo;
    }

    public String getBar() {
        return bar;
    }
}
