package edu.faf.oop.Staff;

import edu.faf.oop.RootClass.Root;

public interface StaffInterface {
    public void setFirstName(String firstName);
    public String getFirstName();
    public void setLastName(String LastName);
    public String getLastName();
    public void setExperience(long experience);
    public long getExperience();
    public void setEmploymentDate(String employmentDate);
    public String getEmploymentDate();
    public double getSalary();
    public void setSalary(double salary);
}
