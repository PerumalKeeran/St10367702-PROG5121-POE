package poe.part.pkg1_.st10367702;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Login_Account {
    private String name;
    private String surname;
    private String username;
    private String password;
    private Boolean usernameValid = false;
    private Boolean passwordValid = true;

    public Login_Account() {
        this.name = " ";
        this.surname = " ";
        this.username = " ";
        this.password = " ";
    }

    public void setFirstname(String firstname) {
        this.name = firstname;
    }

    public String getname() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public Boolean checkUserName(String username) {
        String temp = username;
        Boolean found = false;
        int stringLength;

        found = temp.contains("_");
        stringLength = username.length();

        Boolean UsernameValid = false;
        if (found && stringLength <= 5) {
            UsernameValid = true;
            setUsername(temp);
            JOptionPane.showMessageDialog(null, "Username has been successfully captured");
        } else {
            UsernameValid = false;
            JOptionPane.showMessageDialog(null, "Your username has not been correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
        }

        this.usernameValid = UsernameValid;
        if (found) {
            System.out.println("Username has been successfully captured");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
        }
        return UsernameValid;
    }

    public Boolean checkPasswordComplexity(String password) {
        this.password = password;
        List<String> errorList = Arrays.asList(this.password);
        Pattern specialCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern upperCasePatten = Pattern.compile("[A-Z ]");
        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");

        boolean flag = true;

        if (password.length() < 8 || !specialCharPatten.matcher(password).find() ||
                !upperCasePatten.matcher(password).find() || !lowerCasePatten.matcher(password).find() ||
                !digitCasePatten.matcher(password).find()) {
            JOptionPane.showMessageDialog(null, "Your password has not been correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");
            flag = false;
        }

        this.passwordValid = flag;
        return flag;
    }

    public String registerUser() {
        return "Your user has been successfully registered!";
    }

    public Boolean loginUser(String username, String password) {
        Boolean usernameCorrect = this.username.equals(username);
        Boolean passwordCorrect = this.password.equals(password);

        return usernameCorrect && passwordCorrect;
    }

    public String returnLoginStatus(Boolean loginValid) {
        if (loginValid) {
            JOptionPane.showMessageDialog(null, "Welcome back " + name + " " + surname + "! It's nice to see you again!");
        } else {
            JOptionPane.showMessageDialog(null, "Your username or password is incorrect. Please try again");
        }
        return " ";
    }
}
