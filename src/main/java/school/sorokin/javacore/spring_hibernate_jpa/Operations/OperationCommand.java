package school.sorokin.javacore.spring_hibernate_jpa.Operations;

public interface OperationCommand {
    void execute();
    ConsoleOperationType getOperationType();
}
