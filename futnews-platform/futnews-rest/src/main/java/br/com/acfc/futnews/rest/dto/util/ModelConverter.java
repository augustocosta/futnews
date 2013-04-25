package br.com.acfc.futnews.rest.dto.util;

import java.util.Date;

import br.com.acfc.futnews.model.News;
import br.com.acfc.futnews.model.Team;
import br.com.acfc.futnews.rest.dto.NewsDTO;
import br.com.acfc.futnews.rest.dto.TeamDTO;

public class ModelConverter {

	public static Team convertFromTeamDTOtoTeam(TeamDTO teamDTO) {
		
		Team team = new Team();
		team.setName(teamDTO.getName());
		team.setNickName(teamDTO.getNick());
		team.setMascot(teamDTO.getMascot());
		
		return team;
	}
	
	public static News convertFromNewsDTOtoNews(NewsDTO newsDTO) {
		
		News news = new News();
		
		news.setContent(newsDTO.getContent());
		news.setCreated(new Date());
		news.setDate(newsDTO.getDate());
		news.setHeader(newsDTO.getHeader());
		news.setLink(newsDTO.getLink());
		news.setSource(newsDTO.getSource());
		news.setSubTitle(newsDTO.getSubTitle());
		news.setTitle(newsDTO.getTitle());
		news.setTeam(new Team(newsDTO.getTeamId()));
		
		return news;
	}
}
