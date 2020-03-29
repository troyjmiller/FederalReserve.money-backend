package money.federalreserve.backend.infrastructure.web.interestrate;


import money.federalreserve.backend.api.interestrate.InterestRateApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/interest-rate")
public class InterestRateController {

    private final InterestRateApplicationService interestRateApplicationService;

    public InterestRateController(InterestRateApplicationService interestRateApplicationService) {
        this.interestRateApplicationService = interestRateApplicationService;
    }

    @GetMapping
    public String helloWorld(@PathVariable String test) {
        return test;
    }

}
