import java.util.*;
import java.util.stream.Collectors;

// Started 15:45 | 16:30

public class Main {
    public static void main(String[] args) {
        // Question 1
        List<Integer> inputList1 = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        System.out.println(inputList1.stream().filter(e -> Collections.frequency(inputList1, e) > 1).collect(Collectors.toSet()));

        // Question 2
        List<Integer> inputList2 = Arrays.asList(4,5,7,8,99,100,101,33,32,4,4);
        System.out.println(inputList2.stream().distinct().collect(Collectors.toList()));

        // Question 3
        List<Integer> inputList3 = Arrays.asList(3,90,350,5);
        System.out.println(inputList3.stream().max(Comparator.comparing(Integer::valueOf)).orElse(0));

        // Question 4
        List<Integer> inputList4 = Arrays.asList(6, 8, 3, 5, 1, 9);
        System.out.println(inputList4.stream().max(Comparator.comparing(Integer::valueOf)).orElse(0));
        System.out.println(inputList4.stream().min(Comparator.comparing(Integer::valueOf)).orElse(0));

        // Question 5
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
