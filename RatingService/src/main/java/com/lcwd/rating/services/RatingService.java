package com.lcwd.rating.services;

import com.lcwd.rating.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getAllRatings();

    //get all by UserId
    List<Rating> getRatingsByUserId(String UserId);

    //get all by hotelId
    List<Rating> getRatingsByHotelId(String hotelId);



}
