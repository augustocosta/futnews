package br.com.acfc.futnews.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties({"news"})
@Entity
@Table(name = "FN_TEAM")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEAM_ID")
	private Long id;
	
	@Column(name = "TEAM_NAME")
	private String name;
	
	@Column(name = "TEAM_NICK")
	private String nickName;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "TEAM_FOUNDATION")
	private Date foundation;
	
	@Column(name = "TEAM_MASCOT")
	private String mascot;

	@Column(name = "TEAM_BADGE")
	private String badge;

	@OneToMany(mappedBy="team", fetch=FetchType.EAGER, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<News> news;
	
	public Team() {
		news = new ArrayList<News>();
	}
	
	public Team(String name) {
		news = new ArrayList<News>();
		this.name = name;
	}

	public Team(Long id) {
		news = new ArrayList<News>();
		this.id = id;
	}
	
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
	 * Getter method for nickName
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * Setter method for nickName
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * Getter method for foundation
	 * @return the foundation
	 */
	public Date getFoundation() {
		return foundation;
	}

	/**
	 * Setter method for foundation
	 * @param foundation the foundation to set
	 */
	public void setFoundation(Date foundation) {
		this.foundation = foundation;
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

	/**
	 * Getter method for badge
	 * @return the badge
	 */
	public String getBadge() {
		return badge;
	}

	/**
	 * Setter method for badge
	 * @param badge the badge to set
	 */
	public void setBadge(String badge) {
		this.badge = badge;
	}

	/**
	 * Getter method for news
	 * @return the news
	 */
	public List<News> getNews() {
		return news;
	}

	/**
	 * Setter method for news
	 * @param news the news to set
	 */
	public void setNews(List<News> news) {
		this.news = news;
	}

	public void addNews(News news) {
		this.news.add(news);
		news.setTeam(this);
	}
	
	public void removeNews(News news){
		this.news.remove(news);
	}
	
	public News loadNews(News news){
		
		for(News n : this.news){
			if(n.equals(news)) {
				return n;
			}
		}
		return null;
	}
}
