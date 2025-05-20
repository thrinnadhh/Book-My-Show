package com.projects.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Region extends BaseClass{

    private String address;
    @OneToMany(mappedBy = "region")
    private List<Theater> theaters;


}
