package com.amdocs.media.assignement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.media.assignement.entity.ThemeParkRide;

@Repository
public interface ThemeParkRideRepository extends JpaRepository<ThemeParkRide, Long> {
    List<ThemeParkRide> findByName(String name);
}
