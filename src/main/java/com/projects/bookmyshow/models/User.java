package com.projects.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import java.util.List;
@Getter
@Setter
@Entity(name = "bms_user")
public class User extends BaseClass{

    private String username;
    private String email;
    @OneToMany(mappedBy = "User")
    private List<Booking> bookings;
}
