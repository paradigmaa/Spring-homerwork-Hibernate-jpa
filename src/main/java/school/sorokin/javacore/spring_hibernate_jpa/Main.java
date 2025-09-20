package school.sorokin.javacore.spring_hibernate_jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import school.sorokin.javacore.spring_hibernate_jpa.Controller.OperationsConsoleListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("school.sorokin.javacore.spring_hibernate_jpa");
        OperationsConsoleListener operationsConsoleListener = context.getBean(OperationsConsoleListener.class);
        operationsConsoleListener.run();
    }
}