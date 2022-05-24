package rifqimuhammadaziz.springactuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/first")
    public String myFirstEndpoint() {
        return "This is first endpoint";
    }

    @GetMapping("/second")
    public String mySecondEndpoint() {
        return "This is second endpoint";
    }
}
