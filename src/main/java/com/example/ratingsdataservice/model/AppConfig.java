package com.example.ratingsdataservice.model;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean
    public MovieDetails getMovieDetails()
    {
      MovieDetails moviedetails = new MovieDetails();
      moviedetails.setActors(Arrays.asList("krishna","mia", "jason","mythily"));
      moviedetails.setMovieId("123412");
      moviedetails.setChoreographer("baba master");
      moviedetails.setDialogue("chepestha");
      moviedetails.setSingers(Arrays.asList("jayshankar","bhargavi","geethaMadhuri"));
      return moviedetails;
    }

}
