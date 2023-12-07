package com.example.info.enity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Joueur {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private  int id;
    private String name;
    private int score;
}
