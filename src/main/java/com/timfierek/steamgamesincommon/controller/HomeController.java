package com.timfierek.steamgamesincommon.controller;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.timfierek.steamgamesincommon.model.Game;
import com.timfierek.steamgamesincommon.model.Player;
import com.timfierek.steamgamesincommon.service.SteamApiService;



@Controller
public class HomeController {
	@Autowired
	private SteamApiService steamApiService;
	
	private Pattern pat = Pattern.compile("([0-9]{17})");
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/display-friends")
	public String displayFriends(@RequestParam String steamId, Model model) {
		String parsedId = parseSteamId(steamId);
		if(parsedId.equals("error")) {
			model.addAttribute("errorMessage", "Error! Account url or Steam64ID could not be parsed.");
			return "home";
		}
		
		Player player = steamApiService.getPlayer(parsedId);
		
		if(player.getCommunityVisibilityState() == 1) {
			model.addAttribute("errorMessage", "Error! Account entered is not publicly visible.");
			return "home";
		}
		
		model.addAttribute("player", player);
		model.addAttribute("friends", steamApiService.getPlayersFriendsList(parsedId));
		return "friends-list";
	}
	
	@RequestMapping("/submit")
	public String results(@RequestParam("steamId[]") List<String> steamId, Model model) {
		System.out.println(steamId.toString());
		LinkedHashSet<Game> gamesInCommon = new LinkedHashSet<Game>(steamApiService.getUsersGames(steamId.get(0)));
		List<String> errorIds = new ArrayList<String>();
		
		for(String id : steamId) {
			String parsedId = parseSteamId(id);
			if(!(parsedId.equals("error"))) {
				gamesInCommon.retainAll(steamApiService.getUsersGames(parsedId));
			}
			else {
				errorIds.add(id);
			}
		}
		
		model.addAttribute("games", gamesInCommon);
		model.addAttribute("errors", errorIds);
		
		return "results";
	}
	
	public String parseSteamId(String id) {
		if(id == null || id.length() < 17) return "error";
		
		Matcher mat = pat.matcher(id);
		mat.find();
		
		try {
			return mat.group(0);
		}catch(Exception e) {
			return "error";
		}
	}
}
