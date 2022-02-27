package com.league.football.service.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clubs")
@Data
public class Clubs {

    @Id
    @Column(name = "id")
    private Long Id;

    @Column(name = "club_name")
    private String clubName;

    @Column(name = "stadium_name")
    private String stadiumName;
}
