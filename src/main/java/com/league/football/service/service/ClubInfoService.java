package com.league.football.service.service;

import com.league.football.service.config.api.ClubInfoResponse;
import com.league.football.service.entity.Clubs;
import com.league.football.service.repository.ClubsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClubInfoService {

    private final ClubsRepository clubsRepository;

    public ClubInfoResponse fetchInfo() {
        Iterable<Clubs> clubs = clubsRepository.findAll();
        return ClubInfoResponse.builder().clubInfo(IterableUtils.toList(clubs)).build();
    }
}
