package money.federalreserve.backend.infrastructure.web.example;

import money.federalreserve.backend.api.example.ExampleApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private final ExampleApplicationService exampleApplicationService;

    public ExampleController(ExampleApplicationService exampleApplicationService) {
        this.exampleApplicationService = exampleApplicationService;
    }

    @GetMapping("/google")
    public String google() {
        return exampleApplicationService.google();
    }

}
