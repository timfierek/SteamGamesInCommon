package com.timfierek.steamgamesincommon.service;

import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.timfierek.steamgamesincommon.model.Player;
import com.timfierek.steamgamesincommon.model.Game;
import com.timfierek.steamgamesincommon.model.GetOwnedGamesResponse;
import com.timfierek.steamgamesincommon.model.GetPlayerSummariesResponse;

@Service
public class SteamApiService {
	
	private RestTemplate restTemplate = new RestTemplate();
	
	@Value("${api.key}")
	private String apiKey;
	
	//http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key=XXXX&steamids=76561198328487553
	public Player getPlayer(String steamId) {
		StringBuilder url = new StringBuilder("http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key=");
		url.append(apiKey);
		url.append("&steamids=");
		url.append(steamId);
		GetPlayerSummariesResponse response = restTemplate.getForObject(url.toString(), GetPlayerSummariesResponse.class);
		
		return response.getResponse().getPlayers().get(0);
	}
	
	//http://api.steampowered.com/IPlayerService/GetOwnedGames/v0001/?key=XXXX&steamid=76561198328487553&include_appinfo=true
	public LinkedHashSet<Game> getUsersGames(String steamId){
		StringBuilder url = new StringBuilder("http://api.steampowered.com/IPlayerService/GetOwnedGames/v0001/?key=");
		url.append(apiKey);
		url.append("&steamid=");
		url.append(steamId);
		url.append("&include_appinfo=true");
		
		GetOwnedGamesResponse response = restTemplate.getForObject(url.toString(), GetOwnedGamesResponse.class);
		
		return response.getResponse().getGames();
	}
	
	
}
