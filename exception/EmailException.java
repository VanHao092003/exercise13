package exception;

public class EmailException extends Exception{
    private String error;

    public EmailException() {
        getError();
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        error = "Wrong syntax. Enter again please.";
        this.error = error;
    }
    
}
