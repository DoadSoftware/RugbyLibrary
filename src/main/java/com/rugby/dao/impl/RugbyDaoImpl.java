package com.rugby.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
import com.rugby.util.RugbyUtil;

@Transactional
@Repository("rugbyDao")
@SuppressWarnings("unchecked")
public class RugbyDaoImpl implements RugbyDao {

 @Autowired
 private SessionFactory sessionFactory;
 
@Override
public Player getPlayer(String whatToProcess, String valueToProcess) {
	switch (whatToProcess) {
	case RugbyUtil.PLAYER:
		return (Player) sessionFactory.getCurrentSession().createQuery("from Player WHERE PlayerId=" + valueToProcess).uniqueResult();  
	default:
		return null;  
	}
}

@Override
public Team getTeam(String whatToProcess, String valueToProcess) {
	switch (whatToProcess) {
	case RugbyUtil.TEAM:
		return (Team) sessionFactory.getCurrentSession().createQuery("from Team WHERE TeamId=" + valueToProcess).uniqueResult();  
	default:
		return null;  
	}
}

@Override
public List<NameSuper> getNameSupers() {
	return sessionFactory.getCurrentSession().createQuery("from NameSuper").list();
}

@Override
public List<Team> getTeams() {
	return sessionFactory.getCurrentSession().createQuery("from Team").list();
}

@Override
public List<Player> getPlayers(String whatToProcess, String valueToProcess) {
	switch (whatToProcess) {
	case RugbyUtil.TEAM:
		return sessionFactory.getCurrentSession().createQuery("from Player WHERE TeamId=" + valueToProcess).list();  
	default:
		return null;  
	}
}

@Override
public List<Bugs> getBugs() {
	return sessionFactory.getCurrentSession().createQuery("from Bugs").list();
}

@Override
public List<Ground> getGrounds() {
	return sessionFactory.getCurrentSession().createQuery("from Ground").list();
}

@Override
public List<Playoff> getPlayoffs() {
	return sessionFactory.getCurrentSession().createQuery("from Playoff").list();  
}

@Override
public List<VariousText> getVariousTexts() {
	return sessionFactory.getCurrentSession().createQuery("from VariousText").list();  
}

@Override
public Ground getGround(int ground_id) {
	return (Ground) sessionFactory.getCurrentSession().createQuery("from Ground WHERE GroundId=" + ground_id).uniqueResult();  
}

@Override
public List<Statistics> getAllStats() {
	return sessionFactory.getCurrentSession().createQuery("from Statistics").list();
}

@Override
public List<Player> getAllPlayer() {
	return sessionFactory.getCurrentSession().createQuery("from Player").list();
}

@Override
public List<Fixture> getFixtures() {
	return sessionFactory.getCurrentSession().createQuery("from Fixture").list();
}

@Override
public List<Formation> getFormations() {
	return sessionFactory.getCurrentSession().createQuery("from Formation").list();
}

@Override
public List<TeamColor> getTeamColors() {
	return sessionFactory.getCurrentSession().createQuery("from TeamColor").list();
}

@Override
public List<Staff> getStaff() {
	return sessionFactory.getCurrentSession().createQuery("from Staff").list();
}

@Override
public List<Officials> getOfficials() {
	return sessionFactory.getCurrentSession().createQuery("from Officials").list();
}

}