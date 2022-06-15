import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //a1.forEach(e -> System.out.println(e + "bar"));
        String result = a1.stream().filter(e -> e.equals("foo1")).findAny().orElse("Not found");

        SELECT first_name, last_name FROM CUSTOMERS

    }


}
