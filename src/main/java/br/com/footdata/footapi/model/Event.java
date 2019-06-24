package br.com.footdata.footapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "event", type = "event")
public class Event {

		@Id
		private String id;
		private EventType type;
		private Player player;
		private Team team;
		private Player targetPlayer;
		private Team targetTeam;
		private Match match;
		private MatchMoment moment;
		private TouchingPart touchingPart;
		
		public Event() {
		}

		public EventType getType() {
			return type;
		}

		public void setType(EventType type) {
			this.type = type;
		}

		public Player getPlayer() {
			return player;
		}

		public void setPlayer(Player player) {
			this.player = player;
		}

		public Team getTeam() {
			return team;
		}

		public void setTeam(Team team) {
			this.team = team;
		}

		public Player getTargetPlayer() {
			return targetPlayer;
		}

		public void setTargetPlayer(Player targetPlayer) {
			this.targetPlayer = targetPlayer;
		}

		public Team getTargetTeam() {
			return targetTeam;
		}

		public void setTargetTeam(Team targetTeam) {
			this.targetTeam = targetTeam;
		}

		public Match getMatch() {
			return match;
		}

		public void setMatch(Match match) {
			this.match = match;
		}

		public MatchMoment getMoment() {
			return moment;
		}

		public void setMoment(MatchMoment moment) {
			this.moment = moment;
		}

		public TouchingPart getTouchingPart() {
			return touchingPart;
		}

		public void setTouchingPart(TouchingPart touchingPart) {
			this.touchingPart = touchingPart;
		}

		public void setId(String id) {
			this.id = id;
		}
		
		public String getId() {
			return id;
		}
}
