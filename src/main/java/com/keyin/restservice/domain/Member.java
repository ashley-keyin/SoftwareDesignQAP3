package com.keyin.restservice.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Member {

    //Initialize id as primary key and auto-generate id increments
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    // Initialize other instance variables
    private String memberFirstName;
    private String memberLastName;
    private String memberAddress;
    private String memberEmail;
    private String memberPhoneNumber;
    private LocalDate membershipStartDate;
    private String membershipDuration;
    private String membershipType;  // (normal/trial/special offer/family plan/other)
    private String currentTournaments;
    private String pastTournaments;
    private String upcomingTournaments;

    // Create manytomany relationship between members and tournaments
    @ManyToMany
    private List<Tournament> tournaments;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getMemberFirstName() {
        return memberFirstName;
    }

    public void setMemberFirstName(String memberFirstName) {
        this.memberFirstName = memberFirstName;
    }

    public String getMemberLastName() {
        return memberLastName;
    }

    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPhoneNumber() {
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber(String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber;
    }

    public LocalDate getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(LocalDate membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }

    public String getMembershipDuration() {
        return membershipDuration;
    }

    public void setMembershipDuration(String membershipDuration) {
        this.membershipDuration = membershipDuration;
    }

    public String getMembershipType() {  //normal/trial/special offer/family plan/other
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getCurrentTournaments() {
        return currentTournaments;
    }

    public void setCurrentTournaments(String currentTournaments) {
        this.currentTournaments = currentTournaments;
    }

    public String getPastTournaments() {
        return pastTournaments;
    }

    public void setPastTournaments(String pastTournaments) {
        this.pastTournaments = pastTournaments;
    }

    public String getUpcomingTournaments() {
        return upcomingTournaments;
    }

    public void setUpcomingTournaments(String upcomingTournaments) {
        this.upcomingTournaments = upcomingTournaments;
    }


    public List<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(List<Tournament> tournaments) {
        this.tournaments = tournaments;
    }
}