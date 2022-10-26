package com.nestdigital.onlineregistration.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customerregistration")
public class CustomerRegistrationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10)
    private int id;
    @Column(length = 25)
    private String fname;
    @Column(length = 25)
    private String lname;
    @Column(length = 25)
    private String address;

    //    NEW COLOUMN
    @Column(length = 25)
    private String address2;
    @Column(length = 25)
    private String city;
    @Column(length = 30)
    private String district;
    @Column(length = 30)
    private String state;
    @Column(length = 10)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dob;
    @Column(length = 25)
    private String idproof;
    @Column(length = 25)
    private String idproofnumber;
    @Column(length = 10)
    private String annualincome;
    @Column(length = 25)
    private String mobilenum;

    public CustomerRegistrationModel() {
    }

    public CustomerRegistrationModel(int id, String fname, String lname, String address, String address2, String city, String district, String state, Date dob, String idproof, String idproofnumber, String annualincome, String mobilenum) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.district = district;
        this.state = state;
        this.dob = dob;
        this.idproof = idproof;
        this.idproofnumber = idproofnumber;
        this.annualincome = annualincome;
        this.mobilenum = mobilenum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getIdproof() {
        return idproof;
    }

    public void setIdproof(String idproof) {
        this.idproof = idproof;
    }

    public String getIdproofnumber() {
        return idproofnumber;
    }

    public void setIdproofnumber(String idproofnumber) {
        this.idproofnumber = idproofnumber;
    }

    public String getAnnualincome() {
        return annualincome;
    }

    public void setAnnualincome(String annualincome) {
        this.annualincome = annualincome;
    }

    public String getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(String mobilenum) {
        this.mobilenum = mobilenum;
    }
}
