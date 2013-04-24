package br.com.acfc.futnews.rest.dto;

public class TeamDTO {

	private String name;
	private String nick;
	private String mascot;
	/**
	 * Getter method for name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for nick
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * Setter method for nick
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * Getter method for mascot
	 * @return the mascot
	 */
	public String getMascot() {
		return mascot;
	}

	/**
	 * Setter method for mascot
	 * @param mascot the mascot to set
	 */
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
}
