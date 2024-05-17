package org.cristi.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "film")
@Data
public class Film {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "film_id")
    private Long filmId;

    @Column(name = "description")
    private String description;

    @Column(name = "language_id")
    private int languageId;

    @Column(name = "last_update")
    private Date lastUpdate;

    @Column(name = "length")
    private int length;

    @Column(name = "original_language_id")
    private int originalLanguageId;

    @Column(name = "rating")
    private String rating;

    @Column(name = "release_year")
    private int releaseYear;

    @Column(name = "rental_duration")
    private int rentalDuration;

    @Column(name = "rental_rate")
    private double rentalRate;

    @Column(name = "replacement_cost")
    private double replacementCost;

    @Column(name = "special_features")
    private String specialFeatures;

    @Column(name = "title")
    private String title;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "film_actor",
            joinColumns = {@JoinColumn(name="film_id")},
            inverseJoinColumns = {@JoinColumn(name = "actor_id")}
    )
    private List<Actor> actors = new ArrayList<>();
}