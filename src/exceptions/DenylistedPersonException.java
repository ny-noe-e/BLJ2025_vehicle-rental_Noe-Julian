package exceptions;

public class DenylistedPersonException extends RuntimeException {
    public DenylistedPersonException(String message) {
        super(message);
    }
}
