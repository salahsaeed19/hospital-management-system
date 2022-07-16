package com.company;

public class Doctor extends Person{
    LinkedList Reservation = new LinkedList();
    Queue ReservtTodeay = new Queue();
    String Departemtn ;

    public Doctor(int id,String name,String dataBirth,String phone,String Email,String Depart){
        super(id,name,dataBirth,phone,Email);
        this.Departemtn = Depart;
    }

}
