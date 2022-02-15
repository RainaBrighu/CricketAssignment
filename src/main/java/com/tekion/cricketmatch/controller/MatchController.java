package com.tekion.cricketmatch.controller;

import com.tekion.cricketmatch.match.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MatchController {

  @Autowired
  private Match match;

  @RequestMapping("/match")
  public void playMatch() throws IOException{
    match.startMatch();
  }
}