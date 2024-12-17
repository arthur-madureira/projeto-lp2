package com.manager.places.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.manager.places.model.Place;
import com.manager.places.repository.PlaceRepository;

@RestController
@RequestMapping("/places")
@Validated
public class PlaceController {

    @Autowired
    private PlaceRepository placeRepository;

    @GetMapping
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Place> getPlaceById(@PathVariable String id) {
        Optional<Place> place = placeRepository.findById(id);
        if (place.isPresent()) {
            return new ResponseEntity<>(place.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public Place createPlace(@RequestBody @Validated Place place) {
        return placeRepository.save(place);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlace(@PathVariable String id) {
        Optional<Place> place = placeRepository.findById(id);
        if (place.isPresent()) {
            placeRepository.delete(place.get());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
