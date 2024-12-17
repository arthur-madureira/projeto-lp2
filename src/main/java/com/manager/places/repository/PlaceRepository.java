package com.manager.places.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manager.places.model.Place;

public interface PlaceRepository extends MongoRepository<Place, String> {
    
}