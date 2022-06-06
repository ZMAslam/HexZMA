import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

// Started 14:45 EST | Completed 15:40 EST

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        empList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        empList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        empList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        empList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        empList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        empList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        empList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        empList.add(new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0));

        Map<String, List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(empMap);
        Map<String, Long> countMap = empList.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.counting()
        ));
        System.out.println(countMap);
    }

}
