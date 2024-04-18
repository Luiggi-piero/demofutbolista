package com.example.demofutbolista.service;

import com.example.demofutbolista.entity.SoccerPlayer;
import com.example.demofutbolista.repository.SoccerPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SoccerPlayerService {
    @Autowired
    SoccerPlayerRepository soccerPlayerRepository;

    public List<SoccerPlayer> getPlayers(){
        return soccerPlayerRepository.findAll();
    }

    public Optional<SoccerPlayer> getPlayer(Long id){
        return soccerPlayerRepository.findById(id);
    }

    public void saveOrUpdate(SoccerPlayer soccerPlayer){
        soccerPlayerRepository.save(soccerPlayer);
    }

    public void delete(Long id){
        soccerPlayerRepository.deleteById(id);
    }
}
