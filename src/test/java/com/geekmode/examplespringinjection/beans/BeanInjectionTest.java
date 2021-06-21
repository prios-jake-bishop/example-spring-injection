package com.geekmode.examplespringinjection.beans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BeanInjectionTest {

    @Autowired
    private NamedBeanUser namedBeanUser;
    @Autowired
    private FunctionNameMatchingUser functionNameMatchingUser;

    @Test
    public void beansWithQualifiers() {
        assertThat(namedBeanUser.getFoo()).isEqualTo("foo-from-named-bean");
        assertThat(namedBeanUser.getBar()).isEqualTo("bar-from-named-bean");
    }

    @Test
    public void functionNameMatching() {
        assertThat(functionNameMatchingUser.getFoo()).isEqualTo("foo-by-function-name");
        assertThat(functionNameMatchingUser.getBar()).isEqualTo("bar-by-function-name");
    }
}
