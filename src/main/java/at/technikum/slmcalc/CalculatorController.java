package at.technikum.slmcalc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    /**
     * add two integers
     */
    @RequestMapping("/calc/sum")
    public int sum(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return a + b;
    }

    /**
     * subtract two integers
     */
    @RequestMapping("/calc/minus")
    public int minus(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return a - b;
    }
}
