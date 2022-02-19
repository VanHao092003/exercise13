package exception;

public class EmailException extends Exception{
    private String error;

    public EmailException(String error) {
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
