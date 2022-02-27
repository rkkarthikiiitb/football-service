package com.league.football.service.repository;

import com.league.football.service.entity.Clubs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubsRepository extends CrudRepository<Clubs, Long> {

}
