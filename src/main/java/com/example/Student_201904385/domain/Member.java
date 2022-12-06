package com.example.Student_201904385.domain;


import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
public class Member {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id", unique = true)        // unique: 중복이면 안됨!
    private String userId;

    @Column(name ="name")
    private String name;

    @Column(name ="email")
    private String email;

    @Column(name ="address")
    private String address;

    @Column(name ="password")
    private String password;

    //@JsonProperty("phone_number")
    @Column(name ="phone_number")
    private String phoneNumber;}
