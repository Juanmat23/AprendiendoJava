package org.example;


import org.example.model.Doctor;
import org.example.model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // showMenu();
        Doctor mydoctor = new Doctor("Mateo Velasquez", "Mateo@email.com");
        mydoctor.addAvailableAppointment(new Date(), "4PM");
        mydoctor.addAvailableAppointment(new Date(), "3PM");
        mydoctor.addAvailableAppointment(new Date(), "10AM");
        mydoctor.addAvailableAppointment(new Date(), "2PM");

        System.out.println(mydoctor);
        /*
        for (Doctor.AvailableAppointment aA : mydoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
         */


        System.out.println();
        System.out.println();
        Patient patient = new Patient("Mateo", "Mateo@mail.com");
        System.out.println(patient);


    }
}



