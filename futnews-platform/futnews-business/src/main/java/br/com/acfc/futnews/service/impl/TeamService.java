package br.com.acfc.futnews.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.acfc.futnews.dao.impl.NewsDAO;
import br.com.acfc.futnews.dao.impl.TeamDAO;
import br.com.acfc.futnews.model.News;
import br.com.acfc.futnews.model.Team;
import br.com.acfc.futnews.service.ITeamService;

@Service
public class TeamService implements ITeamService {

	private final Logger logger = LoggerFactory.getLogger(TeamService.class);
	
	@Autowired
	private TeamDAO teamDAO;
	
	@Autowired
	private NewsDAO newsDAO;
	
	@Transactional
	@Override
	public void createTeam(Team team) {

		teamDAO.save(team);
		logger.debug("Team saved..." + team.getName());
	}

	/**
	 * (non-Javadoc)
	 * @see br.com.acfc.futnews.service.ITeamService#getTeam(java.lang.Long)
	 */
	@Override
	public Team getTeam(Long id) {
		return teamDAO.findByPK(Team.class, id);
	}

	/**
	 * (non-Javadoc)
	 * @see br.com.acfc.futnews.service.ITeamService#getNews(java.lang.Long, int)
	 */
	@Override
	public List<News> getNews(Long teamId, int size) {
		return null;
	}
}
