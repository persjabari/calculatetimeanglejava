package com.samanjabari;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

    @GetMapping("/CalculateTimeAngle")
    public ResponseEntity<String> CalculateTimeAngle(@RequestParam int hour, @RequestParam int minute) {
        if (hour < 0 || hour > 12) {
            return new ResponseEntity<>("hour must be between 0 and 12", HttpStatus.BAD_REQUEST);
        }

        if (minute < 0 || minute > 59) {
            return new ResponseEntity<>("minute must be between 0 and 59", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>("Calculated angle is " + Processor.hourMinuteAngleSum(hour, minute), HttpStatus.OK);
    }
}
