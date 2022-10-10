package edu.faf.oop.LogIn;

public class StaffAccount extends LogIn {

    public StaffAccount(String itemId) {
        super(itemId);
        staffId = "Staff";
        staffPassword = "SPassword";
    }
//delete redundant methods
    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
    }

    public boolean checkLogIn()
    {
        if(inputId.equals(staffId) && inputPassword.equals(staffPassword)) {
            logInStatus = "Staff";
            System.out.println("Welcome, Staff");
            return true;
        }
        else {
            System.out.println("Unrecognized user");
            return false;
        }

    }

    public boolean serveClient(CustomerAccount c) {
        return c.isServed;
    }
}

