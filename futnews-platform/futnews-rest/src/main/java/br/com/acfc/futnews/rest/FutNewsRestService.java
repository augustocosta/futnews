package br.com.acfc.futnews.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.acfc.futnews.model.Team;
import br.com.acfc.futnews.rest.dto.NewsDTO;
import br.com.acfc.futnews.rest.dto.TeamDTO;
import br.com.acfc.futnews.rest.dto.util.ModelConverter;
import br.com.acfc.futnews.service.INewsService;
import br.com.acfc.futnews.service.ITeamService;

@Path("/v1")
@Component
public class FutNewsRestService {

	@Autowired
	private ITeamService teamService;
	
	@Autowired
	private INewsService newsService;
	
	@POST
	@Path("/team/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTeam(TeamDTO teamDTO) {
		
		teamService.createTeam(ModelConverter.convertFromTeamDTOtoTeam(teamDTO));
		
		return Response.status(Status.CREATED).build();
	}
	
	@GET
	@Path("/team/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Team getTeam(@PathParam("id") Long id) {
		return teamService.getTeam(id);
	}
	
	@POST
	@Path("/news")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createNews(NewsDTO newsDTO) {
		
		newsService.createNews(ModelConverter.convertFromNewsDTOtoNews(newsDTO));
		
		return Response.status(Status.CREATED).build();
	}
}
