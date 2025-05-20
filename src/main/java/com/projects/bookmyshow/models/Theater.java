package com.projects.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Theater extends BaseClass {

    private String name;
    private String address;
    @ManyToOne
    private Region region;
    @OneToMany(mappedBy="Theater")
    private List<Screen> screens;
}
