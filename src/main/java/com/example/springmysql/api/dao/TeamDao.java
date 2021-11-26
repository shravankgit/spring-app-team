package com.example.springmysql.api.dao;

import com.example.springmysql.api.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamDao extends CrudRepository<Team, Integer> {

//    @Query(name = "select Team from Team where id = ?")
//    public Team findById(int id);

}
