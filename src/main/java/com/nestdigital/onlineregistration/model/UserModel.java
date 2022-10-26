package com.nestdigital.onlineregistration.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usertable")
public class UserModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)


    @Column(length = 11)
    private int id;
    @Column(length = 25)
    private String firstname;
    @Column(length = 25)
    private String lastname;
    @Column(length = 10)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dob;
    @Column(length = 10)
    private String gender;
    @Column(length = 25)
    private String mobilenum;
    @Column(length = 30)
    private String email;
    @Column(length = 25)
    private String password;

    public UserModel() {
    }

    public UserModel(int id, String firstname, String lastname, Date dob, String gender, String mobilenum, String email, String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.gender = gender;
        this.mobilenum = mobilenum;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(String mobilenum) {
        this.mobilenum = mobilenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
