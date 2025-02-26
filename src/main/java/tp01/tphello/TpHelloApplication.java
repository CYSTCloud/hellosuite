package tp01.tphello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tp01.tphello.service.BavardService;

@SpringBootApplication
@RestController
public class TpHelloApplication {

    @Autowired
    private BavardService bavardService;

    public static void main(String[] args) {
        SpringApplication.run(TpHelloApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        bavardService.parler();
        return String.format("Hello, %s!", name);
    }
    
    @GetMapping("/blabla")
    public String blabla() {
        return bavardService.parlerString();
    }
}
