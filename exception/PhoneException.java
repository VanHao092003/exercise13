package exception;

public class PhoneException extends Exception{
    private String error;

    public PhoneException() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        error = "Wrong syntax. Enter again please.";
        this.error = error;
    }
}
