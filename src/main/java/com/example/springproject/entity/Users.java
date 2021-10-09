package com.example.springproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users_table")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String login;

    @Column
    private String email;
}
