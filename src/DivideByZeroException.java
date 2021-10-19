public class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("Delen door nul");
    }

    public DivideByZeroException(String message) {
        super("Delen door nul: " + message);
    }
}
