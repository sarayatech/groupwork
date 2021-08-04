package inheritance;

public class Student extends Person{
    private int year;
    private College college;

    public Student() {
        super();
    }

    public Student(String fName, String lName, String address, int year, College college) {
        super(fName, lName, address);
        this.year = year;
        this.college = college;
    }

    /**
     * @return int return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return College return the college
     */
    public College getCollege() {
        return college;
    }

    /**
     * @param college the college to set
     */
    public void setCollege(College college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return super.toString() + 
            "College name : " + getCollege().toString() + "\n" +
            "Year : " + getYear();
    }

}