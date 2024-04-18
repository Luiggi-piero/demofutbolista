package com.example.demofutbolista.repository;

import com.example.demofutbolista.entity.SoccerPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoccerPlayerRepository extends JpaRepository<SoccerPlayer, Long> {

}
