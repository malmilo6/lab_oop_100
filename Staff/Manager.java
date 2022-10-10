package edu.faf.oop.Staff;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends Staff {

    private final ArrayList<Staff> employeeList = new ArrayList<>();

    public Manager(String firstName, String lastName, double salary, long experience, String employmentDate,String itemId) {
        super(firstName, lastName, salary, experience, employmentDate,itemId);

    }

    public void manageEmployeeAdd(Staff staff){
        employeeList.add(staff);
    }
    public void manageEmployeeRemove(Staff staff){
        employeeList.remove(staff);
    }

    public void workingStatus() {
        boolean status;
        Random bool = new Random();
        status = bool.nextBoolean();

        if(status){
            System.out.println("Manager is hiring new staff");
        }
        else {
            System.out.println("Manager fired somebody");
        }
    }

    @Override
    public double getSalary() {
        return salary + experience*0.1*salary;
    }
}
