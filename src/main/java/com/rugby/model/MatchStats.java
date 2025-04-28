package com.rugby.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class MatchStats {

  @JsonProperty("statsId")
  private int statsId;

  @JsonProperty("playerId")
  private int playerId;
  
  @JsonProperty("matchHalves")
  private String matchHalves;
  
  @JsonProperty("statsType")
  private String stats_type;

  @JsonProperty("statsCount")
  private int statsCount;

  @JsonProperty("totalMatchSeconds")
  private long totalMatchSeconds;
   @JsonIgnore
  private Player player;
  
public MatchStats() {
	super();
}

public MatchStats(int statsId, int playerId, String matchHalves, String stats_type, int statsCount,
		long totalMatchSeconds) {
	super();
	this.statsId = statsId;
	this.playerId = playerId;
	this.matchHalves = matchHalves;
	this.stats_type = stats_type;
	this.statsCount = statsCount;
	this.totalMatchSeconds = totalMatchSeconds;
}

public Player getPlayer() {
	return player;
}

public void setPlayer(Player player) {
	this.player = player;
}

public int getPlayerId() {
	return playerId;
}

public void setPlayerId(int playerId) {
	this.playerId = playerId;
}

public long getTotalMatchSeconds() {
	return totalMatchSeconds;
}

public void setTotalMatchSeconds(long totalMatchSeconds) {
	this.totalMatchSeconds = totalMatchSeconds;
}

public int getStatsId() {
	return statsId;
}

public void setStatsId(int statsId) {
	this.statsId = statsId;
}

public String getStats_type() {
	return stats_type;
}

public void setStats_type(String stats_type) {
	this.stats_type = stats_type;
}

public int getStatsCount() {
	return statsCount;
}

public void setStatsCount(int statsCount) {
	this.statsCount = statsCount;
}

public String getMatchHalves() {
	return matchHalves;
}

public void setMatchHalves(String matchHalves) {
	this.matchHalves = matchHalves;
}
 
}