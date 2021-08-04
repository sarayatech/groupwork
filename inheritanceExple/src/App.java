import java.math.BigDecimal;

import inheritance.College;
import inheritance.Employee;
import inheritance.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Marshall", "Dieme", "Dakar", 2021, new College("SarayaTech", "Dakar"));

        Employee employee = new Employee("Marshall", "Dieme", "Dakar", "mail@mail.com", "770000000", new BigDecimal("875000"));

        System.out.println(student + "\n");
        
        System.out.println(employee);
    }
}
