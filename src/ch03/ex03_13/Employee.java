/*
 * 3.13 (Class Employee) Create a class called Employee that includes three
 * instance variables - a first name (String type), a last name (String type)
 * and a monthly salary (double). Provide a constructor that initializes the
 * three instance variables. provide a set method and a get method for each
 * instance variable. If the monthly salary is not positive, do not set its
 * value. Write an application test called EmployeeTest that demonstrates the
 * capabilities of the Employee class. Create two Employee objects and display
 * the annual salary of each object. Then give each Employee a 10% raise and
 * redisplay each Employee's annual salary.
 */
package ch03.ex03_13;

public class Employee {

    private String name;
    private String last_name;
    private double salary;

    public Employee(String name, String last_name, double salary) {
        this.name = name;
        this.last_name = last_name;
        if (salary > 0.0)
            this.salary = salary;
    }

    public String getName() {
        return (name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return (last_name);
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public double getSalary() {
        return (salary);
    }

    public void setSalary(double salary) {
        if (salary > 0.0)
            this.salary = salary;
    }
}
