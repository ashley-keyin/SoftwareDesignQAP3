package com.keyin.restservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "tournament", path = "tournament")
public interface TournamentRepository extends JpaRepository<Tournament, Long> {

    List<Tournament> findByTournamentStartDate(@Param("tournament_start_date") LocalDate tournamentStartDate);
    List<Tournament> findByTournamentEndDate(@Param("tournament_end_date") LocalDate tournamentEndDate);
    List<Tournament> findByTournamentLocation(@Param("tournament_location") String tournamentLocation);
    List<Tournament> findByTournamentEntryFee(@Param("tournament_entry_fee") double tournamentEntryFee);
    List<Tournament> findByCashPrizeAmount(@Param("cash_prize_amount") double cashPrizeAmount);
    List<Tournament> findByTournamentParticipants(@Param("tournament_participants") String tournamentParticipants);
    List<Tournament> findByFinalStandings(@Param("final_standings") String finalStandings);

}
