package bridgelabz.User_Registration_pgrm;
/**
 * 
 * @author Sandhya
 *
 * @functional Interface <T>
 */
@FunctionalInterface
public interface UserValidate<T> {
	boolean validate(T param);
}
