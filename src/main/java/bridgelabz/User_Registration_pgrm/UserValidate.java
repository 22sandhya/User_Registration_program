package bridgelabz.User_Registration_pgrm;

@FunctionalInterface
public interface UserValidate<T> {
	boolean validate(T param);
}
