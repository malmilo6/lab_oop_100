package edu.faf.oop.LogIn;

import edu.faf.oop.RootClass.Root;

abstract public class LogIn extends Root implements LogInInterface {

    protected String inputId;
    protected String inputPassword;
    protected String managerId;
    protected String managerPassword;
    protected String staffId;
    protected String staffPassword;
    protected String customerId;
    protected String customerPassword;
    protected String logInStatus;

    public LogIn(String itemId) {
        super(itemId);
    }

    public abstract boolean checkLogIn();
    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
    }

}
