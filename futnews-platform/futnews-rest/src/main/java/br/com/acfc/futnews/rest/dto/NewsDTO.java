package br.com.acfc.futnews.rest.dto;

import java.util.Date;

public class NewsDTO {

	private String title;
	private String subTitle;
	private String header;
	private String content;
	private String link;
	private String source;
	private Date date;
	private Date created;
    private Long teamId;

    /**
	 * Getter method for title
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Setter method for title
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * Getter method for subTitle
	 * @return the subTitle
	 */
	public String getSubTitle() {
		return subTitle;
	}
	/**
	 * Setter method for subTitle
	 * @param subTitle the subTitle to set
	 */
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	/**
	 * Getter method for header
	 * @return the header
	 */
	public String getHeader() {
		return header;
	}
	/**
	 * Setter method for header
	 * @param header the header to set
	 */
	public void setHeader(String header) {
		this.header = header;
	}
	/**
	 * Getter method for content
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * Setter method for content
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * Getter method for link
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * Setter method for link
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * Getter method for source
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * Setter method for source
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * Getter method for date
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * Setter method for date
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * Getter method for created
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}
	/**
	 * Setter method for created
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	/**
	 * Getter method for team
	 * @return the team
	 */
	public Long getTeamId() {
		return teamId;
	}
	/**
	 * Setter method for team
	 * @param teamId the team to set
	 */
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
}
