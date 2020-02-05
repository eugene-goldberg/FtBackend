package com.khoubyari.example.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

/*
 * a simple domain entity doubling as a DTO
 */
@Entity
@Table(name = "hotel")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Hotel {

    @Id
    @GeneratedValue()
    private long id;

    @Column(nullable = false)
    private String application;

    @Column()
    private String component;

    @Column()
    String feature;

    @Column()
    private boolean isOn;

    public Hotel() {
    }

    public Hotel(String application, String component, String feature, boolean isOn) {
        this.application = application;
        this.component = component;
        this.feature = feature;
        this.isOn = isOn;
    }

    public long getId() {
        return this.id;
    }

    // for tests ONLY
    public void setId(long id) {
        this.id = id;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public boolean getIsOn() {
        return isOn;
    }

    @Override
    public String toString() {
        return "Hotel {" +
                "id=" + id +
                ", application='" + application + '\'' +
                ", component='" + component + '\'' +
                ", feature='" + feature + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
