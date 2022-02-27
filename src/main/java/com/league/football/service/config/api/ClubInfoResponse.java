package com.league.football.service.config.api;

import com.league.football.service.entity.Clubs;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ClubInfoResponse {
    List<Clubs> clubInfo;
}
