package com.league.football.service.controller;

import com.league.football.service.api.ClubInfoResponse;
import com.league.football.service.service.ClubInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/clubs", produces = APPLICATION_JSON_VALUE)
public class ClubsInfoController {

    private final ClubInfoService clubInfoService;

    @GetMapping(path = "/get-info", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<ClubInfoResponse> getClubInfo() {
        log.info("Starting the call to fetch club details...");
        ClubInfoResponse clubInfoResponse = clubInfoService.fetchInfo();

        return new ResponseEntity<>(clubInfoResponse, HttpStatus.OK);

    }
}
