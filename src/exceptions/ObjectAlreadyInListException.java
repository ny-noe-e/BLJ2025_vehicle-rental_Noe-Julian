package exceptions;

public class ObjectAlreadyInListException extends RuntimeException {
    public ObjectAlreadyInListException(String message) {
        super(message);
    }
}
