package Question_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> staff = new ArrayList<>();
        staff.add(new Employee("IT", 25000));
        staff.add(new Employee("Len", 15000));
        staff.add(new Employee("TB", 100));
        staff.add(new Employee("Tran", 100000));
    
        Map<String, Double> departmentSalary = staff.stream()
            .collect(Collectors.groupingBy(
                e -> e.dept,
                Collectors.collectingAndThen(
                    Collectors.averagingDouble(e -> e.salary),
                    avg -> Math.round(avg * 100.0) / 100.0
                )
            ));

        System.out.println(departmentSalary);
    }
}
