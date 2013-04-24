package br.com.acfc.futnews.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FN_NEWS")
@NamedQueries({@NamedQuery(name = News.NQ_NEWS_BY_TEAM_SIZE, query = "select n from News n where n.team.id = :teamId")})
public class News {

	public static final String NQ_NEWS_BY_TEAM_SIZE = "nqNewsByTeamSize";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NEWS_ID")
	private Long id;
	
	@Column(name = "NEWS_TITLE")
	private String title;
	
	@Column(name = "NEWS_SUBTITLE")
	private String subTitle;
	
	@Column(name = "NEWS_HEADER")
	private String header;
	
	@Lob
	@Column(name = "NEWS_CONTENT")
	private String content;
	
	@Column(name = "NEWS_LINK")
	private String link;
	
	@Column(name = "NEWS_SOURCE")
	private String source;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "NEWS_DATE")
	private Date date;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NEWS_CREATED")
	private Date created;

	@ManyToOne
    @JoinColumn(name="NEWS_TEAM_ID",referencedColumnName="TEAM_ID")
    private Team team;
	/**
	 * Getter method for id
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Setter method for id
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

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
	public Team getTeam() {
		return team;
	}

	/**
	 * Setter method for team
	 * @param team the team to set
	 */
	public void setTeam(Team team) {
		this.team = team;
	}
}
