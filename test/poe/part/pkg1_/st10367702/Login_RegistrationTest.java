package poe.part.pkg1_.st10367702;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class Login_RegistrationTest {
    
    public Login_RegistrationTest() {
    }

    @Test
    public void testMain() {
        Login_Registration.main(null); // Call the main method to execute the registration process
        
        // Asserting for the username "Kyl_1" and the password "Ch&&seC@"
        assertTrue(Login_Registration.checkRegistration("Kyl_1", "Ch&&seC@"));
        
        // Asserting for the username "kyle!!!!!!" and the password "Password"
        assertFalse(Login_Registration.checkRegistration("kyle!!!!!!", "Password"));
    }
}

