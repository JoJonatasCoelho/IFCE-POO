public class DataException extends Exception {
    private int value;

    public DataException(String message, int value) {
        super(message + value);
        this.value = value;
    }

}