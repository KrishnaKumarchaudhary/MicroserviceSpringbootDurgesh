package com.lcwd.reating.RatingService.services;

import com.lcwd.reating.RatingService.entities.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating create(Rating rating);

    //get all rating
    List<Rating> getRatings();

    //get all by UserId
    List<Rating> getRatingByUserId(String userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
