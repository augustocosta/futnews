package br.com.acfc.futnews.rest.dto.util;

import br.com.acfc.futnews.model.Team;
import br.com.acfc.futnews.rest.dto.TeamDTO;

public class ModelConverter {

	public static Team convertFromTeamDTOtoTeam(TeamDTO teamDTO) {
		
		Team team = new Team();
		team.setName(teamDTO.getName());
		team.setNickName(teamDTO.getNick());
		team.setMascot(teamDTO.getMascot());
		
		return team;
	}
}
