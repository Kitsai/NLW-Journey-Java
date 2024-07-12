/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.rocketseat.planner.trip;

import java.util.List;

/**
 *
 * @author kitsai
 */
public record TripRequestDto(String destination, String starts_at, String ends_at, List<String> emails_to_invite, String owner_email, String owner_name) {
}
