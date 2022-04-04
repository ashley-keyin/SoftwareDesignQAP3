package com.keyin.restservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDate;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findById(@Param("member_id") long id);
    List<Member> findByMemberFirstName(@Param("member_first_name") String memberFirstName);
    List<Member> findByMemberLastName(@Param("member_last_name") String memberLastName);
    List<Member> findByMemberAddress(@Param("member_address") String memberAddress);
    List<Member> findByMemberEmail(@Param("member_email") String memberEmail);
    List<Member> findByMemberPhoneNumber(@Param("member_phone_number") String memberPhoneNumber);
    List<Member> findByMembershipStartDate(@Param("membership_start_date") LocalDate membershipStartDate);
    List<Member> findByMembershipDuration(@Param("membership_duration") String membershipDuration);
    List<Member> findByMembershipType(@Param("membership_type") String membershipType);
    List<Member> findByCurrentTournaments(@Param("current_tournaments") String currentTournaments);
    List<Member> findByPastTournaments(@Param("past_tournaments") String pastTournaments);
    List<Member> findByUpcomingTournaments(@Param("upcoming_tournaments") String upcomingTournaments);

}
