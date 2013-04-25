/*
* This software is confidential and proprietary information of 
* Nokia ("Confidential Information"). You shall not
* disclose such Confidential Information and shall use it only in
* accordance with the terms of the license agreement you entered into
* with Nokia and the Nokia Institute of Technology.
*/

package br.com.acfc.futnews.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.acfc.futnews.dao.impl.NewsDAO;
import br.com.acfc.futnews.dao.impl.TeamDAO;
import br.com.acfc.futnews.model.News;
import br.com.acfc.futnews.model.Team;
import br.com.acfc.futnews.service.INewsService;

/** 
 * NewsService.java
 * 
 * TODO <Class Description>
 * 
 * @author augcosta – INdT Cloud & Backend Team 
 *  
 */
@Service
public class NewsService implements INewsService {

	private final Logger logger = LoggerFactory.getLogger(NewsService.class);
	
	@Autowired
	private TeamDAO teamDAO;
	
	@Autowired
	private NewsDAO newsDAO;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void createNews(News news) {

		Team team = teamDAO.findByPK(Team.class, news.getTeam().getId());
		
		news.setTeam(team);
		team.addNews(news);
		
		newsDAO.save(news);
		logger.debug("News saved: " + news.getId() + " / " + news.getTitle());
	}

}
