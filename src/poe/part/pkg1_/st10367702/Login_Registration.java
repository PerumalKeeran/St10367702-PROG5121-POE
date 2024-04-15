package poe.part.pkg1_.st10367702;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;
import java.util.*;//statement that will be used to load the contents
import javax.swing.JOptionPane;

public class Login_Registration {

public static void main(String[] args) {
    Login_Account lg1 = new Login_Account();
    Scanner input = new Scanner(System.in);
    
    //validation of strings
    String name;
    String surname;
    String Rusername;
    String Rpassword;
    String Lusername;
    String Lpassword;
    Boolean correctUsername = false; //True and false being used to make sure the critiera is correctlly formatted.
    Boolean correctPassword = false;
    String registerUserString;
    Boolean loginStatus = false;

    name = JOptionPane.showInputDialog(null, "Please enter your first name:");
    lg1.setFirstname(name);

    surname = JOptionPane.showInputDialog(null, "Please enter your surname:");
    lg1.setSurname(surname);

    do {
        Rusername = JOptionPane.showInputDialog(null, "Please enter your username:");
        correctUsername = lg1.checkUserName(Rusername); //

    } while (correctUsername == false);

    do {
        Rpassword = JOptionPane.showInputDialog(null, "Please enter your password for this account:");
        correctPassword = lg1.checkPasswordComplexity(Rpassword);

    } while (correctPassword == false);

    if (correctUsername == true && correctPassword == true) {
        JOptionPane.showMessageDialog(null, lg1.registerUser());
    } else {
        JOptionPane.showMessageDialog(null, "An error occurred. Please restart and create new account.");
    }

    do {
        Lusername = JOptionPane.showInputDialog(null, "Enter username:");
        Lpassword = JOptionPane.showInputDialog(null, "Enter password:");

        loginStatus = lg1.loginUser(Lusername, Lpassword);
        JOptionPane.showMessageDialog(null, lg1.returnLoginStatus(loginStatus));
    } while (loginStatus == false);

    Login_Account LA1 = new Login_Account(); 
    
        System.out.println("Enter your first name:"); //prints out line
        name = input.nextLine(); //allows users to enter their firstname, surname, username and password.
        
        System.out.println("Enter your surname:");
        surname = input.nextLine();
        
        System.out.println("Enter your username:");
        Lusername = input.nextLine();
        
        System.out.println("Enter your password:");
        Lpassword = input.nextLine();


}

    static boolean checkRegistration(String kyl_1, String chseC) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}