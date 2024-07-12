/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */

package com.rocketseat.planner.participant;

import java.util.UUID;

/**
 *
 * @author kitsai
 */
public record ParticipantData(UUID id,String name, String email, Boolean isConfirmed) {
    
}
