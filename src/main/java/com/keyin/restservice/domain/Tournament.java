package com.keyin.restservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private LocalDate tournamentStartDate;
    private LocalDate tournamentEndDate;
    private String tournamentLocation;
    private double tournamentEntryFee;
    private double cashPrizeAmount;
    private String tournamentParticipants;
    private String finalStandings;

    public Tournament(){
    }

    public Tournament(Long id,
                      LocalDate tournamentStartDate,
                      LocalDate tournamentEndDate,
                      String tournamentLocation,
                      double tournamentEntryFee,
                      double cashPrizeAmount,
                      String tournamentParticipants,
                      String finalStandings) {
        this.id = id;
        this.tournamentStartDate = tournamentStartDate;
        this.tournamentEndDate = tournamentEndDate;
        this.tournamentLocation = tournamentLocation;
        this.tournamentEntryFee = tournamentEntryFee;
        this.cashPrizeAmount = cashPrizeAmount;
        this.tournamentParticipants = tournamentParticipants;
        this.finalStandings = finalStandings;
    }

    public Tournament(LocalDate tournamentStartDate,
                      LocalDate tournamentEndDate,
                      String tournamentLocation,
                      double tournamentEntryFee,
                      double cashPrizeAmount,
                      String tournamentParticipants,
                      String finalStandings) {
        this.tournamentStartDate = tournamentStartDate;
        this.tournamentEndDate = tournamentEndDate;
        this.tournamentLocation = tournamentLocation;
        this.tournamentEntryFee = tournamentEntryFee;
        this.cashPrizeAmount = cashPrizeAmount;
        this.tournamentParticipants = tournamentParticipants;
        this.finalStandings = finalStandings;
    }

    public long getId() {
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

    @Override
    public String toString() {
        return "Tournament{" +
                "Tournament Id=" + id +
                ", Tournament Start Date='" + tournamentStartDate + '\'' +
                ", Tournament End Date='" + tournamentEndDate + '\'' +
                ", Tournament Location='" + tournamentLocation + '\'' +
                ", Tournament Entry Fee=" + "$" + tournamentEntryFee +
                ", Cash Prize Amount=" + "$" + cashPrizeAmount +
                ", Tournament Participants='" + tournamentParticipants + '\'' +
                ", Final Standings='" + finalStandings + '\'' +
                '}';
    }
}