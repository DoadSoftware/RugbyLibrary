package com.rugby.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Teams")
public class Team implements Comparable<Team> {

  @Id
  @Column(name = "TEAMID")
  private int teamId;
	
  @Column(name = "TeamName1")
  private String teamName1;

  @Column(name = "TeamName2")
  private String teamName2;
  
  @Column(name = "TeamName3")
  private String teamName3;
  
  @Column(name = "TeamName4")
  private String teamName4;
  
  @Column(name = "TeamColor")
  private String teamColor;
  
  @Column(name = "TeamGroup")
  private String teamGroup;
  
  @Column(name = "TeamCoach")
  private String teamCoach;
  
  @Column(name = "TeamAssistantCoach")
  private String teamAssistantCoach;
  
  @Column(name = "CoachPhotoName")
  private String coachPhotoName;
  
  @Column(name = "TeamApiId")
  private int teamApiId;

public int getTeamId() {
	return teamId;
}

public void setTeamId(int teamId) {
	this.teamId = teamId;
}

public String getTeamName1() {
	return teamName1;
}

public void setTeamName1(String teamName1) {
	this.teamName1 = teamName1;
}

public String getTeamName2() {
	return teamName2;
}

public void setTeamName2(String teamName2) {
	this.teamName2 = teamName2;
}

public String getTeamName3() {
	return teamName3;
}

public void setTeamName3(String teamName3) {
	this.teamName3 = teamName3;
}

public String getTeamName4() {
	return teamName4;
}

public void setTeamName4(String teamName4) {
	this.teamName4 = teamName4;
}

public String getTeamColor() {
	return teamColor;
}

public void setTeamColor(String teamColor) {
	this.teamColor = teamColor;
}

public String getTeamCoach() {
	return teamCoach;
}

public void setTeamCoach(String teamCoach) {
	this.teamCoach = teamCoach;
}

public int getTeamApiId() {
	return teamApiId;
}

public void setTeamApiId(int teamApiId) {
	this.teamApiId = teamApiId;
}

public String getCoachPhotoName() {
	return coachPhotoName;
}

public void setCoachPhotoName(String coachPhotoName) {
	this.coachPhotoName = coachPhotoName;
}

public String getTeamGroup() {
	return teamGroup;
}

public void setTeamGroup(String teamGroup) {
	this.teamGroup = teamGroup;
}

public String getTeamAssistantCoach() {
	return teamAssistantCoach;
}

public void setTeamAssistantCoach(String teamAssistantCoach) {
	this.teamAssistantCoach = teamAssistantCoach;
}

@Override
public String toString() {
	return "Team [teamId=" + teamId + ", teamName1=" + teamName1 + ", teamName2=" + teamName2 + ", teamName3="
			+ teamName3 + ", teamName4=" + teamName4 + ", teamColor=" + teamColor + ", teamGroup=" + teamGroup
			+ ", teamCoach=" + teamCoach + ", teamAssistantCoach=" + teamAssistantCoach + ", coachPhotoName="
			+ coachPhotoName + ", teamApiId=" + teamApiId + "]";
}

@Override
public int compareTo(Team tm) {
	return (int) (this.getTeamId()-tm.getTeamId());
}

}