package exception;
public class BirthDayException extends Exception{
    private String error;
    public BirthDayException(String error) {
        this.error = error;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    
}
