package com.projects.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseClass{

    private int row;
    private int col;
//    Seat m:1 SeatType
    @ManyToOne
    private SeatType seatType;
    @Enumerated
    private SeatStatus seatStatus;

}
