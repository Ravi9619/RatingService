package com.lcwd.rating.repository;

import com.lcwd.rating.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating,String> {

     //custom finder method
    public List<Rating> findByUserId(String userId);

    public List<Rating> getRatingByHotelId(String hotelId);

}
