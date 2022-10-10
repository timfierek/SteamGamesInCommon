package com.timfierek.steamgamesincommon.controller;

import java.util.LinkedHashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.timfierek.steamgamesincommon.model.Game;
import com.timfierek.steamgamesincommon.model.Player;
import com.timfierek.steamgamesincommon.service.SteamApiService;



@Controller
public class HomeController {
	@Autowired
	SteamApiService steamApiService;
	
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/submit")
	public String results(@RequestParam String steamId1, @RequestParam String steamId2,
							@RequestParam String steamId3, 
							@RequestParam String steamId4, 
							@RequestParam String steamId5, 
							Model model) {
		LinkedHashSet<String> games1 = steamApiService.getUsersGames(steamId1);
		LinkedHashSet<String> games2 = steamApiService.getUsersGames(steamId2);
		games1.retainAll(games2);
		
		model.addAttribute("games", games1);
		
		return "results";
	}
}
