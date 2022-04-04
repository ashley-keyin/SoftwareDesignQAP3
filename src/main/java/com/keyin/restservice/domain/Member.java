package com.keyin.restservice.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String memberFirstName;
    private String memberLastName;

    private String memberAddress;

    @OneToMany
    private List<Tournament> tournaments;

    private String memberEmail;
    private String memberPhoneNumber;
    private LocalDate membershipStartDate;
    private String membershipDuration;
    private String membershipType;  // (normal/trial/special offer/family plan/other)
    private String currentTournaments;
    private String pastTournaments;
    private String upcomingTournaments;

    public Member() {
    }

    public Member(Long id,
                  String memberFirstName,
                  String memberLastName,
                  String memberAddress,
                  String memberEmail,
                  String memberPhoneNumber,
                  LocalDate membershipStartDate,
                  String membershipDuration,
                  String membershipType,
                  String currentTournaments,
                  String pastTournaments,
                  String upcomingTournaments) {
        this.id = id;
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
        this.memberAddress = memberAddress;
        this.memberEmail = memberEmail;
        this.memberPhoneNumber = memberPhoneNumber;
        this.membershipStartDate = membershipStartDate;
        this.membershipDuration = membershipDuration;
        this.membershipType = membershipType;
        this.currentTournaments = currentTournaments;
        this.pastTournaments = pastTournaments;
        this.upcomingTournaments = upcomingTournaments;
    }

    public Member(String memberFirstName,
                  String memberLastName,
                  String memberAddress,
                  String memberEmail,
                  String memberPhoneNumber,
                  LocalDate membershipStartDate,
                  String membershipDuration,
                  String membershipType,
                  String currentTournaments,
                  String pastTournaments,
                  String upcomingTournaments) {
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
        this.memberAddress = memberAddress;
        this.memberEmail = memberEmail;
        this.memberPhoneNumber = memberPhoneNumber;
        this.membershipStartDate = membershipStartDate;
        this.membershipDuration = membershipDuration;
        this.membershipType = membershipType;
        this.currentTournaments = currentTournaments;
        this.pastTournaments = pastTournaments;
        this.upcomingTournaments = upcomingTournaments;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getMemberFirstName() {
        return memberFirstName;
    }

    public void setMemberFirstName(String memberFirstNameName) {
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

    @Override
    public String toString() {
        return ("Member{" + "Member Id=" + id +
                ", Member First Name='" + memberFirstName + '\'' +
                ", Member Last Name='" + memberLastName + '\'' +
                ", Member Address='" + memberAddress + '\'' +
                ", Member Email='" + memberEmail + '\'' +
                ", Member Phone Number='" + memberPhoneNumber + '\'' +
                ", Membership Start Date='" + membershipStartDate + '\'' +
                ", Membership Duration='" + membershipDuration + '\'' +
                ", Membership Type='" + membershipType + '\'' +
                ", Current Tournaments='" + currentTournaments + '\'' +
                ", Past Tournaments='" + pastTournaments + '\'' +
                ", Upcoming Tournaments='" + upcomingTournaments + '\'' +
                '}');
    }
}