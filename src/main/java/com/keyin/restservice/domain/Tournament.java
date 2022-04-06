package com.keyin.restservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Tournament {
    // initialize ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    // Initialize instance variables
    private LocalDate tournamentStartDate;
    private LocalDate tournamentEndDate;
    private String tournamentLocation;
    private double tournamentEntryFee;
    private double cashPrizeAmount;
    private String tournamentParticipants;
    private String finalStandings;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getTournamentStartDate() {
        return tournamentStartDate;
    }

    public void setTournamentStartDate(LocalDate tournamentStartDate) {
        this.tournamentStartDate = tournamentStartDate;
    }

    public LocalDate getTournamentEndDate() {
        return tournamentEndDate;
    }

    public void setTournamentEndDate(LocalDate tournamentEndDate) {
        this.tournamentEndDate = tournamentEndDate;
    }

    public String getTournamentLocation() {
        return tournamentLocation;
    }

    public void setTournamentLocation(String tournamentLocation) {
        this.tournamentLocation = tournamentLocation;
    }

    public double getTournamentEntryFee() {
        return tournamentEntryFee;
    }

    public void setTournamentEntryFee(double tournamentEntryFee) {
        this.tournamentEntryFee = tournamentEntryFee;
    }

    public double getCashPrizeAmount() {
        return cashPrizeAmount;
    }

    public void setCashPrizeAmount(double cashPrizeAmount) {
        this.cashPrizeAmount = cashPrizeAmount;
    }

    public String getTournamentParticipants() {
        return tournamentParticipants;
    }

    public void setTournamentParticipants(String tournamentParticipants) {
        this.tournamentParticipants = tournamentParticipants;
    }

    public String getFinalStandings() {
        return finalStandings;
    }

    public void setFinalStandings(String finalStandings) {
        this.finalStandings = finalStandings;
    }


}