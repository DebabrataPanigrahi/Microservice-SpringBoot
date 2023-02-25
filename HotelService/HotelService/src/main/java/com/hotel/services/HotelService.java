package com.hotel.services;
import com.hotel.entites.Hotel;
import java.util.List;
public interface HotelService {
    //create
    Hotel create(Hotel hotel);
    //getall
    List<Hotel> getAll();
    //getSingle
    Hotel get(String id);
}
