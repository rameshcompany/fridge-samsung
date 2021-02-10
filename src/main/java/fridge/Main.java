package fridge;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application launch class.
 */
public class Main {

    /**
     * Application launch method.
     *
     * @param args never use in this application.
     */
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext(
                "META-INF/spring/spring-integration.xml")
                .registerShutdownHook();
    }
}
