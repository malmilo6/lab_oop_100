package edu.faf.oop.Staff;
import edu.faf.oop.Person.Customer;

import java.util.Random;

public class Waiter extends Staff{
    private double tipsForToday;
    private int clientsServed;
    public Waiter(String firstName, String lastName, double salary,
                  long experience, String employmentDate, double tips, String itemId) {
        super(firstName,lastName,salary,experience,employmentDate,itemId);
        tipsForToday = tips;

    }
    @Override
    public double getSalary() {
        return salary + experience*0.03*salary;
    }

    public void workingStatus() {
        String[] actions = new String[4];
        actions[0] = "Busy";
        actions[1] = "Serving client";
        actions[2] = "Free";
        actions[3] = "Scrolling TikTok";
        Random randInt = new Random();
        int x = randInt.nextInt(1,4);
        System.out.println(actions[x-1]);
    }

    public void receiveTips(Customer customer) {
        Random randInt = new Random();
        tipsForToday += randInt.nextInt(20);
    }

    public double servingTime() {
        Random randTime = new Random();
        return 5.0 + randTime.nextDouble(15.0);

    }
}
