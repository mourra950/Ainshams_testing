package Main_App.Main_App_test;

import Main_App.SignUp_login;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class SignUp_loginTest {
    @Test
    public void check_integration1() throws SQLException {
        SignUp_login s_intg =new SignUp_login();
        assertEquals("your account is opened successfully",s_intg.login_signup("omar","1234","019800","omar@yahoo.com"));
    }
    @Test
    public void check_integration2() throws SQLException {
        SignUp_login s_intg =new SignUp_login();
        assertEquals("error , either you miss to fill blanks or your email already exists",s_intg.login_signup("rana","1234","0100399","rana.com"));
    }
    @Test
    public void check_integration3() throws SQLException {
        SignUp_login s_intg =new SignUp_login();
        assertEquals("error , either you miss to fill blanks or your email already exists",s_intg.login_signup("rana","1234","0100399","rana.com"));
    }
}