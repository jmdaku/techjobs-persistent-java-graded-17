package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message ="Name is required.")
    @Size(min = 1, max = 100, message = "Name must be less than 100 characters.")
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer() { }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
