package bridgelabz.User_Registration_pgrm;
/*
 * Custom Exception Class
 */
public class UserValidationException extends Exception {
    String message;

    public UserValidationException(String message) {
        this.message = message;
    }
}
