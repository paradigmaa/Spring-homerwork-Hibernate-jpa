package school.sorokin.javacore.spring_hibernate_jpa.Exception;

public class FindUserByIdException extends RuntimeException{
    public FindUserByIdException(String message) {
        super(message);
    }
}
