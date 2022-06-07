package Main_App.Main_App_test;

import Main_App.LoginPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginPageTest {
    String[][] login = {{"rana.com","1234"},{"ahmed.com","26541"},{"yara.com","@125rre"}};
    @Test
    public void test1()
    {
        LoginPage ll = new LoginPage();
        assertEquals("Valid",ll.IsValid("rana.com","1234",login));

    }
    @Test
    public void test2()
    {
        LoginPage ll = new LoginPage();
        assertEquals("Valid",ll.IsValid("rana","1234",login));
    }
    @Test
    public void test3()
    {
        LoginPage ll = new LoginPage();
        assertEquals("INVALID",ll.IsValid("ahmed.com","1234",login));
    }
    @Test
    public void test4()
    {
        LoginPage ll = new LoginPage();
        assertEquals("Valid",ll.IsValid("yara.com","@125rre",login));
    }

}