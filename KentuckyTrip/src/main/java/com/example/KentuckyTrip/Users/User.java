package com.example.KentuckyTrip.Users;

import jakarta.persistence.*;

@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(
            name="user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )

    private Long id;
    private String name;
    private String userName;

    public User(String name,
                String userName){
        this.userName = userName;
        this.name = name;
    }

    public Long getId(){ return id; }

    public void setId(Long id){ this.id = id; }

    public String getName(){ return name; }

    public void setName(String name) { this.name = name; }

    public String getUserName(){ return userName; }

    public void setUserName( String userName ){ this.userName = userName; }



}
