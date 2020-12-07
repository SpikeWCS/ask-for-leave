package com.shan.askforleave.pojo;

public class Employee {

    private int id;
    private int uid;
    private int hid;

    private boolean isLeave;
    private String lastSignInDate;
    private String hiredate;
    private String signInDates;

    private int salaryDeducted;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", isLeave=" + isLeave +
                ", lastSignInDate='" + lastSignInDate + '\'' +
                ", hiredate='" + hiredate + '\'' +
                ", salaryDeducted=" + salaryDeducted +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public boolean isLeave() {
        return isLeave;
    }

    public void setLeave(boolean leave) {
        isLeave = leave;
    }

    public String getLastSignInDate() {
        return lastSignInDate;
    }

    public void setLastSignInDate(String lastSignInDate) {
        this.lastSignInDate = lastSignInDate;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getSignInDates() {
        return signInDates;
    }

    public void setSignInDates(String signInDates) {
        this.signInDates = signInDates;
    }

    public int getSalaryDeducted() {
        return salaryDeducted;
    }

    public void setSalaryDeducted(int salaryDeducted) {
        this.salaryDeducted = salaryDeducted;
    }


}
