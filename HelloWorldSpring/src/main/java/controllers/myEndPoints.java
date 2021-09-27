package controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class myEndPoints {
    public static void main(String[] args) {
        SpringApplication.run(myEndPoints.class, args);
    }

    @GetMapping("friendlyMessage")
    public String friendlyMessage(){
       return "Velkommen til dette site!";
    }

    @GetMapping("/returnMyEcho")
    public String echo(@RequestParam String echo){
        return echo;
    }

   @GetMapping("erDetFredag")
    public String echo(){
        String s = "Er det fredag?";
        return s;
    }
}
