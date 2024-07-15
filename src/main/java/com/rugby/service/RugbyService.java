package com.rugby.service;

import java.util.List;

import com.rugby.model.Bugs;
import com.rugby.model.Fixture;
import com.rugby.model.Formation;
import com.rugby.model.Ground;
import com.rugby.model.NameSuper;
import com.rugby.model.Officials;
import com.rugby.model.Player;
import com.rugby.model.Playoff;
import com.rugby.model.Staff;
import com.rugby.model.Statistics;
import com.rugby.model.Team;
import com.rugby.model.TeamColor;
import com.rugby.model.VariousText;

public interface RugbyService {
  Player getPlayer(String whatToProcess, String valueToProcess);
  Team getTeam(String whatToProcess, String valueToProcess);
  Ground getGround(int ground_id);
  List<Player> getPlayers(String whatToProcess, String valueToProcess);
  List<Team> getTeams();
  List<NameSuper> getNameSupers();
  List<Ground> getGrounds();
  List<Playoff> getPlayoffs();
  List<VariousText> getVariousTexts();
  List<Statistics> getAllStats();
  List<Player> getAllPlayer();
  List<Bugs> getBugs();
  List<Fixture> getFixtures();
  List<Formation> getFormations();
  List<TeamColor> getTeamColors();
  List<Staff> getStaffs();
  List<Officials> getOfficials();
}