package com.company;

public class Reservation {
    public static int ID = 0 ;
    int id_doctor;
    String name_patient;
    String date;
    String prices;

    public Reservation(String name_patient , int id_doctor , String date , String prices){
        ID++;
        this.name_patient = name_patient;
        this.id_doctor = id_doctor;
        this.date = date;
        this.prices = prices;
    }
}
