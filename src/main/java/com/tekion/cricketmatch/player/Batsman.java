package com.tekion.cricketmatch.player;

public class Batsman extends Player {
  private int runsScored;
  private int bowlPlayed;
  private int noOfBoundaries;
  private String outOrNotOut = "";

  public Batsman(String playerName) {
    super(playerName);
  }

  public int getRunsScored() {
    return runsScored;
  }

  public void setRunsScored(int runsScored) {
    this.runsScored = runsScored;
  }

  public int getBowlPlayed() {
    return bowlPlayed;
  }

  public void setBowlPlayed(int bowlPlayed) {
    this.bowlPlayed = bowlPlayed;
  }

  public String getOutOrNotOut() {
    return outOrNotOut;
  }

  public void setOutOrNotOut(String outOrNotOut) {
    this.outOrNotOut = outOrNotOut;
  }

  public int getNoOfBoundaries() {
    return noOfBoundaries;
  }

  public void setNoOfBoundaries(int noOfBoundaries) {
    this.noOfBoundaries = noOfBoundaries;
  }
}
