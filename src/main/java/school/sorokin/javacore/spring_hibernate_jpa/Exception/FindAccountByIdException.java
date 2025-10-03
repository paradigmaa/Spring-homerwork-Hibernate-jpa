package school.sorokin.javacore.spring_hibernate_jpa.Exception;

public class FindAccountByIdException extends RuntimeException{
    public FindAccountByIdException(String message) {
        super(message);
    }
}
