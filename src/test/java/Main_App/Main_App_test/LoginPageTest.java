package Main_App.Main_App_test;

import Main_App.LoginPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginPageTest {
    String login[][]={{"rana","1234","0100399","rana@gmail.com"},{"shaimaa","1234554","0100399","Shaimaa@gmail.com"},
            {"ahmed","aa21546","012648597","ahmed@gmail.com"}};
    @Test
    public void Valid_Email_Password()
    {
        LoginPage ll = new LoginPage();
        assertEquals("Valid",ll.IsValid("rana@gmail.com","1234",login));

    }
    @Test
    public void Invalid_email_password1()
    {
        LoginPage ll = new LoginPage();
        assertEquals("Valid",ll.IsValid("rana","1234",login));
    }
    @Test
    public void Valid_email_wrong_password1()
    {
        LoginPage ll = new LoginPage();
        assertEquals("INVALID",ll.IsValid("ahmed@gmail.com","1234",login));
    }
    @Test
    public void Invalid_email_password2()
    {
        LoginPage ll = new LoginPage();
        assertEquals("INVALID",ll.IsValid("yara.com","@125rre",login));
    }
    @Test
    public void Valid_email_wrong_password2()
    {
        LoginPage ll = new LoginPage();
        assertEquals("in_correct password",ll.IsValid("Shaimaa@gmail.com","1234",login));
    }

}