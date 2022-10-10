package edu.faf.oop.Staff;

import java.util.Random;

public class Cook extends Staff{

    private String cookType;
    public Cook(String firstName, String lastName, double salary, long experience, String employmentDate,String itemId) {
        super(firstName, lastName, salary, experience, employmentDate,itemId);
    }

    public boolean preparingFood(){
        Random status = new Random();
        return status.nextBoolean();
    }
    public void workingStatus(){
        if(preparingFood()){
            System.out.println("Cook is preparing your order");
        } else {
            System.out.println("Cook is waiting for clients' orders");
        }
    }


    @Override
    public double getSalary() {return salary + experience*0.05*salary;}
}
