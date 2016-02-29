package Lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sugan_000 on 2/28/2016.
 */
public class InternalIterationTest {



    public static void main(String[] args) {
        List<Employee> employees = new InternalIterationTest().getEmployee();
        employees.forEach(e -> System.out.println(e.getName()));
    }

    public List<Employee> getEmployee() {
        return Arrays.asList (
                new Employee("Suganth", 25, "Ind"),
                new Employee("Gokul", 10, "Aus"),
                new Employee("Gautam", 05, "US"),
                new Employee("Sandeep", 05, "Canada"),
                new Employee("Sanjay", 05, "Canada"),
                new Employee("Chellam", 03, "New Zealand")
                );
    }

    class Employee {
        String name;
        int age;
        String country;

        public Employee(String cName, int cAge, String cCountry) {
            this.name = cName;
            this.age = cAge;
            this.country = cCountry;
        }

        public String getName() { return  this.name; }
        public int getAge() { return  this.age; }
        public String getCountry() { return  this.country; }
    }
}
