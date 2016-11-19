/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest.h_datetime;

/**
 *
 * @author chanuka
 */
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Java8TesterZone {

    public static void main(String args[]) {
        Java8TesterZone Java8TesterZone = new Java8TesterZone();
        Java8TesterZone.testZonedDateTime();
    }

    public void testZonedDateTime() {

        // Get the current date and time
        ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);
    }
}
