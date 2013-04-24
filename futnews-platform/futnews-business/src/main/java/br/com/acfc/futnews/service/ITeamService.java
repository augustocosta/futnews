package br.com.acfc.futnews.service;

import java.util.List;

import br.com.acfc.futnews.model.News;
import br.com.acfc.futnews.model.Team;


public interface ITeamService {

	public void createTeam(Team team);

	/**
	 * Returns the team specified
	 * @param id
	 * @return team
	 */
	public Team getTeam(Long id);
	
	/**
	 * Returns news of the specified team
	 * @param teamId
	 * @param size number of news
	 * @return news
	 */
	public List<News> getNews(Long teamId, int size);
}
