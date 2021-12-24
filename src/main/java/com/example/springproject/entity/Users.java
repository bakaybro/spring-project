package com.example.springproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users_table")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

}
