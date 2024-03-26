package com.example.KentuckyTrip.Burbons;


import jakarta.persistence.*;

@Entity
@Table
public class Burbon {

    @Id
    @SequenceGenerator(
            name = "burbon_sequence",
            sequenceName = "burbon_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "burbon_sequence"
    )

    private Long id;
    private String name;
    private String distillery;
    private Double price;
    private
}
