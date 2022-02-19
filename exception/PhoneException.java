package exception;

public class PhoneException extends Exception{
    private String error;

    public PhoneException(String error) {
        this.error = error;
        System.out.println(getError());
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
