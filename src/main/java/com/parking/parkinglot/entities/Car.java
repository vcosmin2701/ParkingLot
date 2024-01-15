package com.parking.parkinglot.entities;

import jakarta.persistence.*;

@Entity
public class Car {
    private Long id;

    private String licensePlate;

    private String parkingSpot;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    private User Owner;

    private CarPhoto carPhoto;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public CarPhoto getPhoto() {
        return carPhoto;
    }

    public void setPhoto(CarPhoto carPhoto) {
        this.carPhoto = carPhoto;
    }

    @ManyToOne
    public User getOwner() {
        return Owner;
    }

    public void setOwner(User owner) {
        Owner = owner;
    }
}
