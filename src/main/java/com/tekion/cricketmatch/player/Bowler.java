package com.tekion.cricketmatch.player;

public class Bowler extends Batsman {

  private int oversBowled;
  private int wicketsTaken;
  private int runsGiven;

  public Bowler(String playerName) {
    super(playerName);
  }

  public int getOversBowled() {
    return oversBowled;
  }

  public void setOversBowled(int oversBowled) {
    this.oversBowled = oversBowled;
  }

  public int getWicketsTaken() {
    return wicketsTaken;
  }

  public void setWicketsTaken(int wicketsTaken) {
    this.wicketsTaken = wicketsTaken;
  }

  public int getRunsGiven() {
    return runsGiven;
  }

  public void setRunsGiven(int runsGiven) {
    this.runsGiven = runsGiven;
  }
}
