package com.mmdb.moviepojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE_DETAILS")
public class MovieDetails {
	@Id
	private int id;
	@Column(name = "MOVIE_NAME")
	private String movieName;

	@Column(name = "DTAE_OF_RELEASE")
	private String dateOfRelease;

	@Column(name = "DIRECTOR_NAME")
	private String directorName;

	@Column(name = "ACTORS")
	private String Actors;

	@Column(name = "PRODUCER")
	private String producer;

	@Column(name = "DISTRIBUTOR")
	private String distributor;

	@Column(name = "CINEMATOGRAPHER")
	private String cinematographer;

	@Column(name = "SCRIPT_WRITER")
	private String scriptWritrt;

	@Column(name = "MUSIC_DIRECTOR")
	private String musicDirector;

	@Column(name = "ORGINAL_SCORE")
	private String orginalScore;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDateOfRelease() {
		return dateOfRelease;
	}

	public void setDateOfRelease(String dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getActors() {
		return Actors;
	}

	public void setActors(String actors) {
		Actors = actors;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public String getCinematographer() {
		return cinematographer;
	}

	public void setCinematographer(String cinematographer) {
		this.cinematographer = cinematographer;
	}

	public String getScriptWritrt() {
		return scriptWritrt;
	}

	public void setScriptWritrt(String scriptWritrt) {
		this.scriptWritrt = scriptWritrt;
	}

	public String getMusicDirector() {
		return musicDirector;
	}

	public void setMusicDirector(String musicDirector) {
		this.musicDirector = musicDirector;
	}

	public String getOrginalScore() {
		return orginalScore;
	}

	public void setOrginalScore(String orginalScore) {
		this.orginalScore = orginalScore;
	}

}
