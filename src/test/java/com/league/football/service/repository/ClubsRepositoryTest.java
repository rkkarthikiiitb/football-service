package com.league.football.service.repository;

import com.league.football.service.entity.Clubs;
import org.apache.commons.collections4.IterableUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@DataJpaTest
@ActiveProfiles("test-h2")
public class ClubsRepositoryTest {

    @Autowired
    private ClubsRepository clubsRepository;

    @Test
    public void shouldSaveClub() {
        List<Clubs> clubsIterableBeforeSave = IterableUtils.toList(clubsRepository.findAll());
        Clubs clubs = new Clubs(7L, "West Ham", "Upton Park");
        Clubs savedClub = clubsRepository.save(clubs);
        List<Clubs> clubsIterableAfterSave = IterableUtils.toList(clubsRepository.findAll());
        assertThat(clubsIterableBeforeSave.size()).isEqualTo(0);
        assertThat(clubsIterableAfterSave.size()).isEqualTo(1);
    }

}
