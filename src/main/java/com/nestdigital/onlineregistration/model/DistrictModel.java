package com.nestdigital.onlineregistration.model;

import javax.persistence.*;

@Entity
@Table(name = "district")

public class DistrictModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 40)
    private String district;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "state_id", referencedColumnName = "id")
//    private StateModel stateModel;


    public DistrictModel() {
    }

    public DistrictModel(int id, String district) {
        this.id = id;
        this.district = district;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
