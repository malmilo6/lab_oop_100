package edu.faf.oop.LogIn;

import edu.faf.oop.Staff.Waiter;

public class CustomerAccount extends LogIn{

    public boolean isServed = false;

    public CustomerAccount(String itemId) {
        super(itemId);
        customerId = "Customer";
        customerPassword = "CPassword";
    }

    public boolean checkLogIn()
    {
        if(inputId.equals(customerId) && inputPassword.equals(customerPassword)) {
            logInStatus = "Staff";
            System.out.println("Welcome, Dear Customer");
            return true;
        }
        else {
            System.out.println("Unrecognized user");
            return false;
        }
    }

    public void rateService(Waiter waiter) {
        if(waiter.servingTime() < 10) {
            System.out.println("Good service\n");
        }
        else
            System.out.println("Satisfactorily service \n");
    }
}
