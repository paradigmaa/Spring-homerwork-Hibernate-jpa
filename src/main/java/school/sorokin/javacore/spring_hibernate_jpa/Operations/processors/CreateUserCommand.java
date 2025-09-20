package school.sorokin.javacore.spring_hibernate_jpa.Operations.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import school.sorokin.javacore.spring_hibernate_jpa.Operations.ConsoleOperationType;
import school.sorokin.javacore.spring_hibernate_jpa.Operations.OperationCommand;
import school.sorokin.javacore.spring_hibernate_jpa.Services.UserAccountService;

import java.util.Scanner;

@Component
public class CreateUserCommand implements OperationCommand {

    private final Scanner scanner;

    private final UserAccountService userAccountService;


    @Autowired
    public CreateUserCommand(Scanner scanner, UserAccountService userAccountService) {
        this.scanner = scanner;
        this.userAccountService = userAccountService;
    }

    @Override
    public void execute() {
        System.out.println("Введите логин для создания пользователя");
        String login = scanner.nextLine();
        userAccountService.createUserAndAccount(login);
        System.out.println("Пользователь и базовый аккаунт созданы");
    }

    @Override
    public ConsoleOperationType getOperationType() {
        return ConsoleOperationType.USER_CREATE;
    }
}
