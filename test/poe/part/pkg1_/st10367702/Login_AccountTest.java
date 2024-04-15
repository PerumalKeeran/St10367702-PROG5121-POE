package poe.part.pkg1_.st10367702;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class Login_AccountTest {
    
    @Test
    public void testCheckUserName() {
        Login_Account account = new Login_Account();
        
        // Test correct username format
        assertTrue(account.checkUserName("kyl_1"));
        
        // Test incorrect username format (less than 5 characters)
        assertFalse(account.checkUserName("kyl"));
        
        // Test incorrect username format (no underscore)
        assertFalse(account.checkUserName("kyle1"));
    }

    @Test
    public void testCheckPasswordComplexity() {
        Login_Account account = new Login_Account();
        
        // Test correct password format
        assertTrue(account.checkPasswordComplexity("CH&&sec@"));
        
        // Test incorrect password format (less than 8 characters)
        assertFalse(account.checkPasswordComplexity("Ch&&sec"));
        
        // Test incorrect password format (no special character)
        assertFalse(account.checkPasswordComplexity("Chosec123"));
    }

    @Test
    public void testLoginUser() {
        Login_Account account = new Login_Account();
        
        // Setting up username and password
        account.setUsername("kyl_1");
        account.setPassword("CH&&sec@");
        
        // Test login with correct username and password
        assertTrue(account.loginUser("kyl_1", "CH&&sec@"));
        
        // Test login with incorrect username
        assertFalse(account.loginUser("Kyle!!!!", "CH&&sec@"));
        
        // Test login with incorrect password
        assertFalse(account.loginUser("kyl_1", "password"));
    }

    @Test
    public void testReturnLoginStatus() {
        Login_Account account = new Login_Account();
        
        // Test return login status for successful login
        assertEquals("Welcome back kyl_1! It's nice to see you again!", account.returnLoginStatus(true));
        
        // Test return login status for failed login
        assertEquals("Your username or password is incorrect. Please try again.", account.returnLoginStatus(false));
    }
}
