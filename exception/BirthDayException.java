package exception;
public class BirthDayException extends Exception{
    private String error;
    public BirthDayException(String error) {
        this.error = error;
        System.out.println(getError());
    }

    public BirthDayException() {
    }

    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    
}
