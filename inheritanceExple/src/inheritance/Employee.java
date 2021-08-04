package inheritance;

import java.math.BigDecimal;

public class Employee extends Person{
    private String email;
    private String phoneNumber;
    private BigDecimal salary;

    public Employee() {
        super();
    }

    public Employee(String fName, String lName, String address, String email, String phoneNumber, BigDecimal salary) {
        super(fName, lName, address);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return BigDecimal return the salary
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
            "Email : " + getEmail() + "\n" +
            "Phone Number : " + getPhoneNumber() + "\n" +
            "Salary : " + getSalary();
    }

}