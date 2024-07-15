package com.rugby.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="matchStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class MatchStats {

  @XmlElement(name = "statsId")
  private int statsId;

  @XmlElement(name = "playerId")
  private int playerId;
  
  @XmlElement(name = "matchHalves")
  private String matchHalves;
  
  @XmlElement(name = "statsType")
  private String stats_type;

  @XmlElement(name = "statsCount")
  private int statsCount;

  @XmlElement(name = "totalMatchSeconds")
  private long totalMatchSeconds;

  @XmlTransient
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