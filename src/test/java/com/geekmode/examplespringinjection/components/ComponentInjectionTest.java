package com.geekmode.examplespringinjection.components;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ComponentInjectionTest {

    @Autowired
    @Qualifier("fooWidget")
    private Widget fooByQualifier;
    @Autowired
    @Qualifier("barWidget")
    private Widget barByQualifier;

    // injected by matching field name to component qualifier
    @Autowired
    private Widget fooWidget;
    @Autowired
    private Widget barWidget;

    @Test
    public void componentQualifiers() {
        assertThat(fooByQualifier.getMessage()).isEqualTo("foo-from-component-qualifier");
        assertThat(barByQualifier.getMessage()).isEqualTo("bar-from-component-qualifier");
    }

    @Test
    public void nameMatching() {
        assertThat(fooWidget.getMessage()).isEqualTo("foo-from-component-qualifier");
        assertThat(barWidget.getMessage()).isEqualTo("bar-from-component-qualifier");
    }
}
