package br.com.footdata.footapi.model;

public class MatchMoment {
	private int minutes;
	private int seconds;
	private MatchPart gamePart;
	
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public MatchPart getGamePart() {
		return gamePart;
	}
	public void setGamePart(MatchPart gamePart) {
		this.gamePart = gamePart;
	}
}
