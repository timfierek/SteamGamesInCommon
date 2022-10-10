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
	public String results(@RequestParam String steamId, Model model) {
		LinkedHashSet<Game> games = steamApiService.getUsersGames(steamId);
		
		model.addAttribute("games", games);
		
		return "results";
	}
}
