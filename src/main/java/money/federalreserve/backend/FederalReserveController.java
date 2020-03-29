package money.federalreserve.backend;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class FederalReserveController {

    @GetMapping(value = "/{test}")
    public String helloWorld(@PathVariable String test) {
        return test;
    }

}
