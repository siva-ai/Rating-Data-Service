package com.example.ratingsdataservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetails {
    private String movieId;
    private int rating;
    private String story;
    private List<String> actors;
    private String dialogue;
    private String music_director;
    private List<String> singers;
    private String choreographer;
}
