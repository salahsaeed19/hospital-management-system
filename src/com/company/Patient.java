package com.company;

public class Patient extends Person {
    String historyDisease;
    public Patient(int id,String name,String dataBirth,String phone,String Email,String histroy){
        super(id,name,dataBirth,phone,Email);
        this.historyDisease = histroy;
    }
}
