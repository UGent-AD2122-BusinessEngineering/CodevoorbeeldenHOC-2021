public class UnknownOpException extends Exception {
    public UnknownOpException() {
        super("Operator niet gekend");
    }

    public UnknownOpException(String message) {
        super("Operator niet gekend:" + message);
    }
}
