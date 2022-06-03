package com.hexaware.Validator4.Controller;

import com.hexaware.Validator4.Entities.Employee;
import com.hexaware.Validator4.Entities.Status;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Objects;

@Controller
public class JsonController {

    //public Employee emp = new Employee();

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "TEST";
    }

    @GetMapping("/validate")
    public Status validate(@RequestParam Employee input ) {
        Status exStatus = new Status();
        String emailIn = input.getEmail();
        if (input.getName().length() <  4) exStatus.errors.add("Name should be at least 4 characters");
        else if (!Objects.equals(emailIn.substring(emailIn.length() - 4), ".com")
        && (!emailIn.contains("@"))) exStatus.errors.add("Please enter valid email");
        else if (input.getSalary() <= 1000.0) exStatus.errors.add("Salary should be more than 1000");
        if (exStatus.errors.size() == 0) return exStatus;
        else {
            exStatus.status = "ERROR";
            return exStatus;
        }
    }
}
