package br.edu.atitus.atitusound.dtos;

import java.time.Duration;

public class MusicDTO {
	
	private String name;
	private Duration duration;
	private String url;
	private ArtistOnlyUUID artist;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public ArtistOnlyUUID getArtist() {
		return artist;
	}
	public void setArtist(ArtistOnlyUUID artist) {
		this.artist = artist;
	}

}
