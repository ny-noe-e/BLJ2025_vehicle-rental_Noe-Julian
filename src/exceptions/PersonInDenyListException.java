package exceptions;

public class PersonInDenyListException extends RuntimeException {
    public PersonInDenyListException(String message) {
        super(message);
    }
}
