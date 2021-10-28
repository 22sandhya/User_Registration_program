package bridgelabz.User_Registration_pgrm;

public class UserValidationException extends Exception {
    String message;

    public UserValidationException(String message) {
        this.message = message;
    }
}
