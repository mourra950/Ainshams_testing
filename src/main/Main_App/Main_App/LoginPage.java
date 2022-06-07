package Main_App;

public class LoginPage {

    public String IsValid(String email, String pass, String[][] login) {
        for (int i = 0; i < login.length; i++) {
            if (email.equals(login[i][3]) && pass.equals(login[i][1]))
                return "Valid";
            else if (email.equals(login[i][3]) && !pass.equals(login[i][1]))
                return "in_correct password";
        }
        return "INVALID";

    }

}
