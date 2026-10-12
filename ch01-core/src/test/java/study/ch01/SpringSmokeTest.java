package study.ch01;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.SpringVersion;

import static org.junit.jupiter.api.Assertions.assertTrue;

// 환경 점검용: 스프링 6.x가 제대로 내려받아지고 컨테이너가 뜨는지만 확인한다
class SpringSmokeTest {

    @Test
    void springContainerStarts() {
        System.out.println("Spring Framework " + SpringVersion.getVersion());
        assertTrue(SpringVersion.getVersion().startsWith("6."));
        try (var ctx = new AnnotationConfigApplicationContext()) {
            ctx.refresh();
            assertTrue(ctx.isActive());
        }
    }
}
