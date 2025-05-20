package com.projects.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity(name = "bms_show")
public class Show extends BaseClass {
    private Double duration;
    private Date startTime;
    private Date endTime;
//    show m:1 movie
    @ManyToOne
    private Movie movie;
//    show m:1 theater
    @ManyToOne
    private Theater theater;
//    show m:1 Screens
    @ManyToOne
    private Screen screen;
//    show 1:m showSeat
    @OneToMany
    private List<ShowSeat>showSeatList;
//    show 1:m showSeatType
    @OneToMany
    private List<ShowSeatType>showSeatTypes;
}
