package com.projects.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Screen extends BaseClass{
//    Screen 1:m Seats
    @OneToMany(mappedBy = "screen")
    private List<Seat> seats;
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> features;

}
