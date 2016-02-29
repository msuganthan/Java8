package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by sugan_000 on 3/1/2016.
 */
public class Optional02 {

    public static  void main(String[] args) {
        Company company = getCompanyData1();
        for(Department department : company.getDepartment()) {
            if(department.getManager().isPresent()) {
                System.out.println(department.getName() + " "+department.getManager().get().getName());
            }
        }
    }

    public static Company getCompanyData1() {
        Optional<Manager> manager = Optional.of(new Manager("Sugathan"));
        Department department = new Department("department1");
        department.setManager(manager);

        Department department1 = new Department("department2");

        Company company = new Company((Arrays.asList(department, department1)));
        return company;
    }
}
