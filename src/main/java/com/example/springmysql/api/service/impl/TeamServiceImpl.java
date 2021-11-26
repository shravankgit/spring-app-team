package com.example.springmysql.api.service.impl;

import com.example.springmysql.api.dao.DeveloperDao;
import com.example.springmysql.api.dao.TeamDao;
import com.example.springmysql.api.model.Developer;
import com.example.springmysql.api.model.SaveTeam;
import com.example.springmysql.api.model.Team;
import com.example.springmysql.api.request.DeveloperRequest;
import com.example.springmysql.api.service.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    private static final Logger logger = LoggerFactory.getLogger(TeamServiceImpl.class);

    @Autowired
    private TeamDao teamDao;

    @Autowired
    private DeveloperDao developerDao;

    @Override
    public String createTeam(SaveTeam teamDto) {

        // saving team into db
        savingTeamIntoDb(teamDto);
        // saving developer into db
        saveDeveloperToDb(teamDto);
        return "team is saved to db";
    }

    private void saveDeveloperToDb(SaveTeam teamDto) {
        List<DeveloperRequest> developerList = teamDto.getDeveloperList();

        List<Developer> developers = new ArrayList<>();
        for(DeveloperRequest developerRequest : developerList){
            Developer developer = new Developer();
            developer.setName(developerRequest.getName());
            developer.setPhone_number(developerRequest.getPhone_number());
            developers.add(developer);
        }
        developerDao.saveAll(developers);
    }

    private void savingTeamIntoDb(SaveTeam teamDto) {
        Team team = new Team();
        team.setName(teamDto.getTeam().getName());
        teamDao.save(team);
    }

}
