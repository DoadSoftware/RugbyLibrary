package com.rugby.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Column;

@Entity
@Table(name = "Fixtures")
public class Fixture {

  @Id
  @Column(name = "MATCHNUMBER")
  private int matchnumber;
  
  @Column(name = "MatchFileName")
  private String matchfilename;
  
  @Column(name = "Date")
  private String date;
  
  @Column(name = "Time")
  private String time;
  
  @Column(name = "GroupName")
  private String groupName;

  @Column(name = "HOMETEAM")
  private int hometeamid;

  @Column(name = "AWAYTEAM")
  private int awayteamid;
  
  @Column(name = "Winner")
  private String winnerteam;
  
  @Column(name = "Margin")
  private String margin;
  
  @Column(name = "Venue")
  private int venue;
  
  @Transient
  private Team home_Team;

  @Transient
  private Team away_Team;

public Fixture() {
	super();
}

public Fixture(int matchnumber) {
	super();
	this.matchnumber = matchnumber;
}

public int getMatchnumber() {
	return matchnumber;
}

public void setMatchnumber(int matchnumber) {
	this.matchnumber = matchnumber;
}

public String getMatchfilename() {
	return matchfilename;
}

public void setMatchfilename(String matchfilename) {
	this.matchfilename = matchfilename;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public int getHometeamid() {
	return hometeamid;
}

public void setHometeamid(int hometeamid) {
	this.hometeamid = hometeamid;
}

public int getAwayteamid() {
	return awayteamid;
}

public void setAwayteamid(int awayteamid) {
	this.awayteamid = awayteamid;
}

public Team getHome_Team() {
	return home_Team;
}

public void setHome_Team(Team home_Team) {
	this.home_Team = home_Team;
}

public Team getAway_Team() {
	return away_Team;
}

public void setAway_Team(Team away_Team) {
	this.away_Team = away_Team;
}

public String getWinnerteam() {
	return winnerteam;
}

public void setWinnerteam(String winnerteam) {
	this.winnerteam = winnerteam;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public int getVenue() {
	return venue;
}

public void setVenue(int venue) {
	this.venue = venue;
}

public String getGroupName() {
	return groupName;
}

public void setGroupName(String groupName) {
	this.groupName = groupName;
}

public String getMargin() {
	return margin;
}

public void setMargin(String margin) {
	this.margin = margin;
}

}