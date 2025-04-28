package com.rugby.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {

  @JsonProperty("squadPerTeam")
  private int squadPerTeam;
  
  @JsonProperty("homeSubstitutesPerTeam")
  private int homeSubstitutesPerTeam;


  @JsonProperty("awaySubstitutesPerTeam")
  private int awaySubstitutesPerTeam;
  
  @JsonProperty("matchFileTimeStamp")
  private String matchFileTimeStamp;

  @JsonProperty("matchResult")
  private String matchResult;

  @JsonProperty("matchStatus")
  private String matchStatus;
  
  @JsonProperty("matchFileName")
  private String matchFileName;

  @JsonProperty("tournament")
  private String tournament;

  @JsonProperty("matchIdent")
  private String matchIdent;
  
  @JsonProperty("matchId")
  private int matchId;

  @JsonProperty("homeTeamFormationId")
  private int homeTeamFormationId;

  @JsonProperty("awayTeamFormationId")
  private int awayTeamFormationId;
  
  @JsonProperty("homeTeamId")
  private int homeTeamId;

  @JsonProperty("awayTeamId")
  private int awayTeamId;

  @JsonProperty("homePenaltiesHits")
  private int homePenaltiesHits;

  @JsonProperty("awayPenaltiesHits")
  private int awayPenaltiesHits;

  @JsonProperty("homePenaltiesMisses")
  private int homePenaltiesMisses;

  @JsonProperty("awayPenaltiesMisses")
  private int awayPenaltiesMisses;
 
  @JsonProperty("homeTeamJerseyColor")
  private String homeTeamJerseyColor;

  @JsonProperty("awayTeamJerseyColor")
  private String awayTeamJerseyColor;
  
  @JsonProperty("homeTeamGKJerseyColor")
  private String homeTeamGKJerseyColor;

  @JsonProperty("awayTeamGKJerseyColor")
  private String awayTeamGKJerseyColor;

  @JsonProperty("groundId")
  private int groundId;

  @JsonProperty("venueName")
  private String venueName;

  @JsonProperty("homeTeamScore")
  private int homeTeamScore;

  @JsonProperty("awayTeamScore")
  private int awayTeamScore;

   @JsonIgnore
  private String api_photo;
  
   @JsonIgnore
  private Ground ground;
  
   @JsonIgnore
  private Team homeTeam;

   @JsonIgnore
  private Team awayTeam;
  
   @JsonIgnore
  private List<APITeam> ApiData;

  @JsonProperty("homeSquad")
  private List<Player> homeSquad;

  @JsonProperty("homeSubstitutes")
  private List<Player> homeSubstitutes;
  
  @JsonProperty("awaySquad")
  private List<Player> awaySquad;

  @JsonProperty("awaySubstitutes")
  private List<Player> awaySubstitutes;
  
  @JsonProperty("homeOtherSquad")
  private List<Player> homeOtherSquad;

  @JsonProperty("awayOtherSquad")
  private List<Player> awayOtherSquad;

  @JsonProperty("matchStat")
  private List<MatchStats> matchStats;
  
  @JsonProperty("clock")
  private Clock clock;

  @JsonIgnore
  private List<Event> events;
  
public int getHomePenaltiesHits() {
	return homePenaltiesHits;
}

public void setHomePenaltiesHits(int homePenaltiesHits) {
	this.homePenaltiesHits = homePenaltiesHits;
}

public int getAwayPenaltiesHits() {
	return awayPenaltiesHits;
}

public void setAwayPenaltiesHits(int awayPenaltiesHits) {
	this.awayPenaltiesHits = awayPenaltiesHits;
}

public int getHomePenaltiesMisses() {
	return homePenaltiesMisses;
}

public void setHomePenaltiesMisses(int homePenaltiesMisses) {
	this.homePenaltiesMisses = homePenaltiesMisses;
}

public int getAwayPenaltiesMisses() {
	return awayPenaltiesMisses;
}

public void setAwayPenaltiesMisses(int awayPenaltiesMisses) {
	this.awayPenaltiesMisses = awayPenaltiesMisses;
}

public Clock getClock() {
	return clock;
}

public void setClock(Clock clock) {
	this.clock = clock;
}

public int getHomeTeamScore() {
	return homeTeamScore;
}

public void setHomeTeamScore(int homeTeamScore) {
	this.homeTeamScore = homeTeamScore;
}

public int getAwayTeamScore() {
	return awayTeamScore;
}

public void setAwayTeamScore(int awayTeamScore) {
	this.awayTeamScore = awayTeamScore;
}

public List<MatchStats> getMatchStats() {
	return matchStats;
}

public void setMatchStats(List<MatchStats> matchStats) {
	this.matchStats = matchStats;
}

public int getHomeSubstitutesPerTeam() {
	return homeSubstitutesPerTeam;
}

public void setHomeSubstitutesPerTeam(int homeSubstitutesPerTeam) {
	this.homeSubstitutesPerTeam = homeSubstitutesPerTeam;
}

public int getAwaySubstitutesPerTeam() {
	return awaySubstitutesPerTeam;
}

public void setAwaySubstitutesPerTeam(int awaySubstitutesPerTeam) {
	this.awaySubstitutesPerTeam = awaySubstitutesPerTeam;
}

public String getMatchFileTimeStamp() {
	return matchFileTimeStamp;
}

public void setMatchFileTimeStamp(String matchFileTimeStamp) {
	this.matchFileTimeStamp = matchFileTimeStamp;
}

public String getMatchResult() {
	return matchResult;
}

public void setMatchResult(String matchResult) {
	this.matchResult = matchResult;
}

public String getMatchStatus() {
	return matchStatus;
}

public void setMatchStatus(String matchStatus) {
	this.matchStatus = matchStatus;
}

public String getMatchFileName() {
	return matchFileName;
}

public void setMatchFileName(String matchFileName) {
	this.matchFileName = matchFileName;
}

public String getTournament() {
	return tournament;
}

public void setTournament(String tournament) {
	this.tournament = tournament;
}

public String getMatchIdent() {
	return matchIdent;
}

public void setMatchIdent(String matchIdent) {
	this.matchIdent = matchIdent;
}

public int getMatchId() {
	return matchId;
}

public void setMatchId(int matchId) {
	this.matchId = matchId;
}

public int getHomeTeamId() {
	return homeTeamId;
}

public void setHomeTeamId(int homeTeamId) {
	this.homeTeamId = homeTeamId;
}

public int getAwayTeamId() {
	return awayTeamId;
}

public void setAwayTeamId(int awayTeamId) {
	this.awayTeamId = awayTeamId;
}

public int getGroundId() {
	return groundId;
}

public void setGroundId(int groundId) {
	this.groundId = groundId;
}

public String getVenueName() {
	return venueName;
}

public void setVenueName(String venueName) {
	this.venueName = venueName;
}

public Ground getGround() {
	return ground;
}

public void setGround(Ground ground) {
	this.ground = ground;
}

public int getHomeTeamFormationId() {
	return homeTeamFormationId;
}

public void setHomeTeamFormationId(int homeTeamFormationId) {
	this.homeTeamFormationId = homeTeamFormationId;
}

public int getAwayTeamFormationId() {
	return awayTeamFormationId;
}

public void setAwayTeamFormationId(int awayTeamFormationId) {
	this.awayTeamFormationId = awayTeamFormationId;
}

public Team getHomeTeam() {
	return homeTeam;
}

public void setHomeTeam(Team homeTeam) {
	this.homeTeam = homeTeam;
}

public Team getAwayTeam() {
	return awayTeam;
}

public void setAwayTeam(Team awayTeam) {
	this.awayTeam = awayTeam;
}

public List<Player> getHomeSquad() {
	return homeSquad;
}

public void setHomeSquad(List<Player> homeSquad) {
	this.homeSquad = homeSquad;
}

public List<Player> getHomeSubstitutes() {
	return homeSubstitutes;
}

public void setHomeSubstitutes(List<Player> homeSubstitutes) {
	this.homeSubstitutes = homeSubstitutes;
}

public List<Player> getAwaySquad() {
	return awaySquad;
}

public void setAwaySquad(List<Player> awaySquad) {
	this.awaySquad = awaySquad;
}

public List<Player> getAwaySubstitutes() {
	return awaySubstitutes;
}

public void setAwaySubstitutes(List<Player> awaySubstitutes) {
	this.awaySubstitutes = awaySubstitutes;
}

public List<Player> getHomeOtherSquad() {
	return homeOtherSquad;
}

public void setHomeOtherSquad(List<Player> homeOtherSquad) {
	this.homeOtherSquad = homeOtherSquad;
}

public List<Player> getAwayOtherSquad() {
	return awayOtherSquad;
}

public void setAwayOtherSquad(List<Player> awayOtherSquad) {
	this.awayOtherSquad = awayOtherSquad;
}

public List<Event> getEvents() {
	return events;
}

public void setEvents(List<Event> events) {
	this.events = events;
}

public String getHomeTeamJerseyColor() {
	return homeTeamJerseyColor;
}

public void setHomeTeamJerseyColor(String homeTeamJerseyColor) {
	this.homeTeamJerseyColor = homeTeamJerseyColor;
}

public String getAwayTeamJerseyColor() {
	return awayTeamJerseyColor;
}

public void setAwayTeamJerseyColor(String awayTeamJerseyColor) {
	this.awayTeamJerseyColor = awayTeamJerseyColor;
}

public List<APITeam> getApiData() {
	return ApiData;
}

public void setApiData(List<APITeam> apiData) {
	ApiData = apiData;
}

public String getApi_photo() {
	return api_photo;
}

public void setApi_photo(String api_photo) {
	this.api_photo = api_photo;
}

public String getHomeTeamGKJerseyColor() {
	return homeTeamGKJerseyColor;
}

public void setHomeTeamGKJerseyColor(String homeTeamGKJerseyColor) {
	this.homeTeamGKJerseyColor = homeTeamGKJerseyColor;
}

public String getAwayTeamGKJerseyColor() {
	return awayTeamGKJerseyColor;
}

public void setAwayTeamGKJerseyColor(String awayTeamGKJerseyColor) {
	this.awayTeamGKJerseyColor = awayTeamGKJerseyColor;
}

public int getSquadPerTeam() {
	return squadPerTeam;
}

public void setSquadPerTeam(int squadPerTeam) {
	this.squadPerTeam = squadPerTeam;
}

@Override
public String toString() {
	return "Match [homeSubstitutesPerTeam=" + homeSubstitutesPerTeam + ", awaySubstitutesPerTeam="
			+ awaySubstitutesPerTeam + ", matchFileTimeStamp=" + matchFileTimeStamp + ", matchResult=" + matchResult
			+ ", matchStatus=" + matchStatus + ", matchFileName=" + matchFileName + ", tournament=" + tournament
			+ ", matchIdent=" + matchIdent + ", matchId=" + matchId + ", homeTeamFormationId=" + homeTeamFormationId
			+ ", awayTeamFormationId=" + awayTeamFormationId + ", homeTeamId=" + homeTeamId + ", awayTeamId="
			+ awayTeamId + ", homePenaltiesHits=" + homePenaltiesHits + ", awayPenaltiesHits=" + awayPenaltiesHits
			+ ", homePenaltiesMisses=" + homePenaltiesMisses + ", awayPenaltiesMisses=" + awayPenaltiesMisses
			+ ", homeTeamJerseyColor=" + homeTeamJerseyColor + ", awayTeamJerseyColor=" + awayTeamJerseyColor
			+ ", homeTeamGKJerseyColor=" + homeTeamGKJerseyColor + ", awayTeamGKJerseyColor=" + awayTeamGKJerseyColor
			+ ", groundId=" + groundId + ", venueName=" + venueName + ", homeTeamScore=" + homeTeamScore
			+ ", awayTeamScore=" + awayTeamScore + ", api_photo=" + api_photo + ", ground=" + ground + ", homeTeam="
			+ homeTeam + ", awayTeam=" + awayTeam + ", ApiData=" + ApiData + ", homeSquad=" + homeSquad
			+ ", homeSubstitutes=" + homeSubstitutes + ", awaySquad=" + awaySquad + ", awaySubstitutes="
			+ awaySubstitutes + ", homeOtherSquad=" + homeOtherSquad + ", awayOtherSquad=" + awayOtherSquad
			+ ", matchStats=" + matchStats + ", clock=" + clock + ", events=" + events + "]";
}

}