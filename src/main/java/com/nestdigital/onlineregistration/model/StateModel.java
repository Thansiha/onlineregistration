package com.nestdigital.onlineregistration.model;

import javax.persistence.*;

@Entity
@Table(name="state")
public class StateModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100)
    private String state;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "state_id", referencedColumnName = "id")
//    private DistrictModel districtModel;


    public StateModel() {
    }

    public StateModel(int id, String state) {
        this.id = id;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
