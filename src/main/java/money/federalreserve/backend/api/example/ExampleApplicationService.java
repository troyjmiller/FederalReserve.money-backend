package money.federalreserve.backend.api.example;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExampleApplicationService {

    public String google() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://www.google.com/", String.class);
    }

}
