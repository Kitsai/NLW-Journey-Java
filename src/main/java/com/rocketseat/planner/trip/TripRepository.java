/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.rocketseat.planner.trip;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kitsai
 */
public interface TripRepository extends JpaRepository<Trip, UUID> {
}
