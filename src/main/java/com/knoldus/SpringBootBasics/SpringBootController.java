/**
 * Info about this package return the current time.
 * @Author Gaurav
 * @Version 1.0
 */
package com.knoldus.SpringBootBasics;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class SpringBootController {

    /**
     * getRunningTime().
     * @return Return  current time
     */
    @GetMapping(path = "/status")
    public String getRunningTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime current = LocalDateTime.now();
        String dateTime = current.format(formatter);
        return "Running Time= " + dateTime;
    }

}
