package com.example.springmysql.api.controller;

import com.example.springmysql.api.model.SaveTeam;
import com.example.springmysql.api.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    TeamService teamService;


    @PostMapping("/createTeam")
    public String createTeam(@RequestBody SaveTeam team) {
        teamService.createTeam(team);
        return "team is created ";
    }

//    @GetMapping("/getTeams")
//    public List<Team> getTeams() {
//        return (List<Team>) dao.findAll();
//    }

}