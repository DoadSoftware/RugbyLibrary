package com.rugby.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rugby.dao.RugbyDao;
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
import com.rugby.service.RugbyService;

@Service("rugbyService")
@Transactional
public class RugbyServiceImpl implements RugbyService {

 @Autowired
 private RugbyDao rugbyDao;
 
@Override
public Player getPlayer(String whatToProcess, String valueToProcess) {
	return rugbyDao.getPlayer(whatToProcess, valueToProcess);
}

@Override
public Team getTeam(String whatToProcess, String valueToProcess) {
	return rugbyDao.getTeam(whatToProcess, valueToProcess);
}

@Override
public List<Team> getTeams() {
	return rugbyDao.getTeams();
}

@Override
public List<NameSuper> getNameSupers() {
	return rugbyDao.getNameSupers();
}

@Override
public List<Player> getPlayers(String whatToProcess, String valueToProcess) {
	return rugbyDao.getPlayers(whatToProcess, valueToProcess);
}

@Override
public List<Ground> getGrounds() {
	return rugbyDao.getGrounds();
}

@Override
public List<Playoff> getPlayoffs() {
	return rugbyDao.getPlayoffs();
}

@Override
public List<VariousText> getVariousTexts() {
	return rugbyDao.getVariousTexts();
}

@Override
public Ground getGround(int ground_id) {
	return rugbyDao.getGround(ground_id);
}

@Override
public List<Bugs> getBugs() {
	return rugbyDao.getBugs();
}

@Override
public List<Statistics> getAllStats() {
	return rugbyDao.getAllStats();
}

@Override
public List<Player> getAllPlayer() {
	return rugbyDao.getAllPlayer();
}

@Override
public List<Fixture> getFixtures() {
	return rugbyDao.getFixtures();
}

@Override
public List<Formation> getFormations() {
	return rugbyDao.getFormations();
}

@Override
public List<TeamColor> getTeamColors() {
	return rugbyDao.getTeamColors();
}

@Override
public List<Staff> getStaffs() {
	return rugbyDao.getStaff();
}

@Override
public List<Officials> getOfficials() {
	return rugbyDao.getOfficials();
}

}