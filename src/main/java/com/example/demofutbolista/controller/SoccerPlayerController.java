package com.example.demofutbolista.controller;

import com.example.demofutbolista.entity.SoccerPlayer;
import com.example.demofutbolista.service.SoccerPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "futbolista")
public class SoccerPlayerController {

    @Autowired
    private SoccerPlayerService soccerPlayerService;

    @GetMapping
    public List<SoccerPlayer> getAll(){
        return soccerPlayerService.getPlayers();
    }

    @PostMapping
    public void saveUpdate(@RequestBody SoccerPlayer soccerPlayer){
        soccerPlayerService.saveOrUpdate(soccerPlayer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        soccerPlayerService.delete(id);
    }

    @GetMapping("/{id}")
    public Optional<SoccerPlayer> getById(@PathVariable("id") Long id){
        return soccerPlayerService.getPlayer(id);
    }
}
