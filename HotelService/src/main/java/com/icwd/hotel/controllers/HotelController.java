package com.icwd.hotel.controllers;

import com.icwd.hotel.entities.Hotel;
import com.icwd.hotel.services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelServices hotelServices;

    //Create
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelServices.create(hotel));
    }
    //get single
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> createHotel(@PathVariable String hotelId) {
        return ResponseEntity.status(HttpStatus.OK).body(hotelServices.get(hotelId));
    }

    //get all
    @GetMapping
    public ResponseEntity<List<Hotel>> getAll(){
        return ResponseEntity.ok(hotelServices.getAll());
    }
}
