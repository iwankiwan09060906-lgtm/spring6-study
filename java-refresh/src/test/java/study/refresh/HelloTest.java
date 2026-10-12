package study.refresh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HelloTest {

    @Test
    void greetContainsJava17() {
        assertTrue(Hello.greet("test").contains("Java 17"));
    }
}
