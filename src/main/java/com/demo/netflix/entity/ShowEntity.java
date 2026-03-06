package com.demo.netflix.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Entity
@Table(name="netflix")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ShowEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="show_id")
    private String showId;

    @Column(name="type")
    private String type;

    @Column(name="title")
    private String title;

    @Column(name="director")
    private String director;

    @Column(name="casting")
    private String casting;

    @Column(name="country")
    private String country;

    @Column(name="reg_date")
    private String regDate;

    @Column(name="release_year")
    private String releaseYear;

    @Column(name="rating")
    private String rating;

    @Column(name="duration")
    private String duration;

    @Column(name="genre")
    private String genre;

    @Column(name="description")
    private String description;

}
