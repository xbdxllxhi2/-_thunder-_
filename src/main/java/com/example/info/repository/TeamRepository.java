package com.example.info.repository;

import com.example.info.enity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team,Long> {
    List<Team> findByName(String s);

    List<Team> findByNameLikeIgnoreCase(String s);
    List<Team> findByNameContainingIgnoreCase(String s);

}
