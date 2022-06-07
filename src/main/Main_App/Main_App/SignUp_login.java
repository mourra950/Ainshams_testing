package Main_App;

import java.sql.SQLException;

public class SignUp_login {
    LoginPage L = new LoginPage();
    SignUpPage S = new SignUpPage();

    String arr[][] = {{"rana", "1234", "0100399", "rana.com"}, {"shaimaa", "1234", "0100399", "Shaimaa.com"}};

    public String login_signup(String name, String Password, String Phone, String Email) throws SQLException {
        String array_signUp[] = {name, Password, Phone, Email};
        //S.SignUp(name,Password,Phone,Email);
        String c = S.SignUp(name, Password, Phone, Email);
        //System.out.println("mama helwa");
        if (c.equals("registered successfully")) {
            String login_data[][] = addX(arr.length, arr, array_signUp);
            Display();
            String return_stmt = L.IsValid(Email, Password, login_data);
            System.out.println("teta helw");
            if (return_stmt.equals("Valid")) {
                System.out.println("mama helwa");
                return "your account is opened successfully";
            } else {
                return "error either your email or password is incorrect";
            }
        } else {
            return "error , either you miss to fill blanks or your email already exists";
        }
    }

    public static String[][] addX(int n, String[][] arr, String[] x) {
        int i;
        String newarr[][] = new String[n + 1][4];
        for (i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                newarr[i][j] = arr[i][j];
            }
        }
        for (int k = 0; k < 4; k++) {
            newarr[newarr.length - 1][k] = x[k];
        }
        return newarr;
    }

    public void Display() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]);
                System.out.println("");
            }
        }
    }
}

