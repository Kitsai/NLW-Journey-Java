/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.rocketseat.planner.participant;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.planner.trip.Trip;

/**
 *
 * @author kitsai
 */
@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository repository;

    public ParticipantCreateResponse registerParticipantToTrip(String email, Trip trip) {
        Participant participant = new Participant(email, trip);

        this.repository.save(participant);

        return new ParticipantCreateResponse(participant.getId());
    }

    public void registerParticipantsToTrip(List<String> participantsToInvite, Trip trip){
        List<Participant> participants = participantsToInvite.stream().map(email -> new Participant(email, trip)).toList();
        
        this.repository.saveAll(participants);

        System.out.println(participants.get(0).getId());
    }

    public void triggerConfirmationEmailToParticipants(UUID tripId){}
    public void triggerConfirmationEmailToParticipant(String email, UUID tripId){}

    public List<ParticipantData> getAllParticipantsFromTrip(UUID tripId) {
        return this.repository.findByTripId(tripId).stream().map(participant -> new ParticipantData(participant.getId(), participant.getName(), participant.getEmail(), participant.getIsConfirmed())).toList();
    }
}
