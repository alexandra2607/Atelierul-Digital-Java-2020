package Lab4.exception;

public class CheckedException extends Exception{
    public CheckedException (String desciption) {
        super("Checked " + desciption);
    }
}
