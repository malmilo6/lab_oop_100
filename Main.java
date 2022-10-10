package edu.faf.oop;

import edu.faf.oop.LogIn.ManagerAccount;
import edu.faf.oop.Menu.Menu;
import edu.faf.oop.Order.Billing;
import edu.faf.oop.Person.Customer;
import edu.faf.oop.Staff.Cook;
import edu.faf.oop.Staff.Manager;
import edu.faf.oop.Staff.Waiter;

public class Main {
    public static void main(String[] args) {
        ManagerAccount managerAcc = new ManagerAccount("I1231");
        managerAcc.setInputId("Password");
        managerAcc.setInputPassword("Manager");
        Waiter waiter = new Waiter("Andrew","Kurek",1500,12,
                "12/11/2019",15,"234AFS");
        Manager manager = new Manager("Steve","China",2500,24,"09/12/2015","23r3rdA");
        Cook cook = new Cook("Tisha","Brown",2200,19,"09/01/2018","*797DFAd");

        manager.manageEmployeeAdd(cook);
        manager.manageEmployeeAdd(waiter);

        Customer customer = new Customer("Max",14,25,"male","2342AFD");

        Menu menu = new Menu("D","32234");
        Billing bill = new Billing(1010101,"CC","234AFA24");

        bill.createOrder(menu);
        bill.releaseBill(customer);

    }
}