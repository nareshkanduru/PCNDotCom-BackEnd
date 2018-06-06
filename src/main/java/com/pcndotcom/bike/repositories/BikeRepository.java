package com.pcndotcom.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcndotcom.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
