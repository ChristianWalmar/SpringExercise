package controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class myEndPoints {
  public static void main(String[] args) {
    SpringApplication.run(myEndPoints.class, args);
  }

  @GetMapping("friendlyMessage")
  public String friendlyMessage() {
    return "Velkommen til dette site!";
  }

  @GetMapping("/returnMyEcho")
  public String echo(@RequestParam String echo) {
    return echo;
  }

  @GetMapping("erDetFredag")
  public String echo() {
    String s = "Er det fredag?";
    return s;
  }

  @GetMapping("erDetEgentligFredag")
  public String erDetEgentligFredag() {

    /*
    **************************************************************************************************
    SPØRGSMÅL TIL NICKLAS: Hvordan ville man kunne unit teste det her? Uden at vente til fredag...
    **************************************************************************************************
    */
    LocalDateTime localDateTime = LocalDateTime.now();

    int d = localDateTime.getDayOfMonth(); //day
    int m = localDateTime.getMonthValue(); //month
    int k = localDateTime.getYear()%100;   //last 2 digits of the given year
    int j = localDateTime.getYear()/100;   //century

    int h = d + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;

    if (h == 5) {
      return "ja";
    } else{
      return "nej";
    }
  }
}
