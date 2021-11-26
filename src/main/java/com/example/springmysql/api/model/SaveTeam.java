package com.example.springmysql.api.model;

import com.example.springmysql.api.request.DeveloperRequest;
import com.example.springmysql.api.request.TeamRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SaveTeam {

    @JsonProperty("team")
    private TeamRequest team;

    @JsonProperty("developers")
    List<DeveloperRequest> developerList;

    public TeamRequest getTeam() {
        return team;
    }

    public void setTeam(TeamRequest team) {
        this.team = team;
    }

    public List<DeveloperRequest> getDeveloperList() {
        return developerList;
    }

    public void setDeveloperList(List<DeveloperRequest> developerList) {
        this.developerList = developerList;
    }
}
