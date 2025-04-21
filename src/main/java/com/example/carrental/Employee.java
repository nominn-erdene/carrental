package com.example.carrental;

public class Employee {
    int empNo;
    String fName;
    String lName;
    String title;

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getTitle() {
        return title;
    }

    public Employee(){
        this.empNo = empNo;
    }
}
