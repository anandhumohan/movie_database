package com.mmdb.moviepojos;

import javax.persistence.Entity;

@Entity
public class MovieDetails {
	private int id;
	private String movieName;
	private String dateOfRelease;
	private String directorName;
	private String Actors;
	private String producer;
	private String distributor;
	private String cinematographer;
	private String scriptWritrt;
	private String musicDirector;
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
