import exception.WrongLoginException;
import exception.WrongPasswordException;

public class CheckLoginAndPassword {
    public static void checkLoginAndPassword(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException("Слишком длинный логин");
        }
        if (!login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Недопустимые символы");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Слишком длинный пароль");
        }
        if (!password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Недопустимые символы");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
