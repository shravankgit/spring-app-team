package com.example.springmysql.api.service;

import com.example.springmysql.api.model.SaveTeam;

import java.sql.SQLException;
import java.util.Optional;

public interface TeamService {
    String createTeam(SaveTeam customerDto);
}
