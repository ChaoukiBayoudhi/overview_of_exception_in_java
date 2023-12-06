import lombok.ToString;

@ToString
public class StudentException extends Exception{
    private String message;
    private long errorCode;
    public StudentException(String message){
        super(message);
    }
    public StudentException(String message, long errorC){
        super(message);
        errorCode = errorC;
    }
}
