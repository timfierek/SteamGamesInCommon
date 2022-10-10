package com.timfierek.steamgamesincommon.model;

import java.util.LinkedHashSet;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GamesResponse {
	@JsonProperty("game_count")
	private int gameCount;
	private LinkedHashSet<Game> games;
	
	public int getGameCount() {
		return gameCount;
	}
	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}
	public LinkedHashSet<Game> getGames() {
		return games;
	}
	public void setGames(LinkedHashSet<Game> games) {
		this.games = games;
	}
}
