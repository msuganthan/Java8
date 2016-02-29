package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by sugan_000 on 3/1/2016.
 */
public class Optional01 {

    public static  void main(String[] args) {
        Company company = getCompanyData();
        for(Department department : company.getDepartment()) {
   //         System.out.println(department.getName() + " "+department.getManager().getName());
        }
    }

    public static Company getCompanyData() {
        Manager manager = new Manager("Sugathan");
        Department department = new Department("department1");
 //       department.setManager(manager);

        Department department1 = new Department("department2");

        Company company = new Company((Arrays.asList(department, department1)));
        return company;
    }
}

class Company {
    List<Department> departments;

    public Company(List<Department> departments) {
        this.departments = departments;
    }
    public List<Department> getDepartment() {
        return departments;
    }

}

class Department {
    String name;
    //Manager manager;
    Optional<Manager> manager;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*public void setManager(Manager manager) {
        this.manager = manager;
    }*/

    /*public Manager getManager() {
        return manager;
    }*/

    public void setManager(Optional<Manager> manager) {
        this.manager = manager;
    }

    public Optional<Manager> getManager() {
        return manager;
    }

}
class Manager {
    String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}