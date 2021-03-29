package com.knoldus.SpringBootBasics;



import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class SpringBootControllerTest {
    @Test
    public void CheckRunningTime(){
        SpringBootController controller = new SpringBootController();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime current = LocalDateTime.now();
        String result = current.format(formatter);
        assertEquals(controller.getRunningTime(),"Running Time= "+result);
    }


}