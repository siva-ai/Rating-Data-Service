package com.example.ratingsdataservice.resources;

import com.example.ratingsdataservice.model.MovieDetails;
import com.example.ratingsdataservice.model.Rating;
import com.example.ratingsdataservice.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @Autowired
    public MovieDetails movieDetails;



    @RequestMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId){
        return new Rating("123",4);

            }

            @RequestMapping("/user/{userId}")
            public UserRating getUserRatings(@PathVariable("userId") String userId)
            {
                UserRating userRating = new UserRating();
                userRating.initData(userId);
                return userRating;

            }

            @RequestMapping("/moviedetails/{movieId}")
            public MovieDetails getMovieDetails(@PathVariable("movieId") String movieId){


        return movieDetails;

            }




}
