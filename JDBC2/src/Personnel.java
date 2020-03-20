/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;

/**
 *
 * @author omerhamidkamisli
 */
public class Personnel {
    String name;
    String surname;
    int TC;
    int phone;
    String address;
    int type;
    float salary;
    boolean isWorking;
    int salarySystem;
    String startDate;
    String terminateDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isIsWorking() {
        return isWorking;
    }

    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public int getSalarySystem() {
        return salarySystem;
    }

    public void setSalarySystem(int salarySystem) {
        this.salarySystem = salarySystem;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTerminateDate() {
        //Bitis tarihi
        return terminateDate;
    }

    public void setTerminateDate(String terminateDate) {
        this.terminateDate = terminateDate;
    }

    public Personnel(String name, String surname, int TC, int phone, String address, int type, float salary, int salarySystem) {
        this.name = name;
        this.surname = surname;
        this.TC = TC;
        this.phone = phone;
        this.address = address;
        this.type = type;
        this.salary = salary;
        this.salarySystem = salarySystem;
        //this.startDate = new Date();
    }
}