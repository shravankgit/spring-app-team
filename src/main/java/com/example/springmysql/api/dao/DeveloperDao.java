package com.example.springmysql.api.dao;

import com.example.springmysql.api.model.Developer;
import com.example.springmysql.api.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface DeveloperDao extends CrudRepository<Developer, Integer> {

}
