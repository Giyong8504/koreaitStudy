package exam05.main;

import exam05.Message2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import exam05.config.AppCtx;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        Message2 m1 = ctx.getBean(Message2.class);
        Message2 m2 = ctx.getBean(Message2.class);

        System.out.println(m1 == m2);
        ctx.close();
    }
}
