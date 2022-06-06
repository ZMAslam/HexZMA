package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Started 14:00 EST | Completed 14:40 EST

@RestController
public class java1Controller {

    @GetMapping("/api/testExceptionHandling/{code}")

    public String testErrors(@RequestParam int code) {
        if (code == 401) return "{errorMessage: You are not authorized}";
        else if (code == 404) return "{errorMessage: resource not found}";
        return null;
    }

}
