package com.projects.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Booking extends BaseClass {
    private int totalAmount;
    //    Booking M:1 User
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "booking")
    private List<ShowSeat> showSeats;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    @OneToMany(mappedBy = "booking")
//    There might be retry payments can be done
    private List<Payment> payments;
}
