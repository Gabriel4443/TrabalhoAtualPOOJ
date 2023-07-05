package models;

public class ExceptionCPF extends Exception{
	public ExceptionCPF() {
        super();
    }

    public ExceptionCPF(String message) {
        super(message);
    }

    public ExceptionCPF(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionCPF(Throwable cause) {
        super(cause);
    }
}
