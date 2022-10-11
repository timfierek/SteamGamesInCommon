package com.timfierek.steamgamesincommon.model;

import java.util.List;

public class FriendsResponse {
	private List<Player> friends;

	public List<Player> getFriends() {
		return friends;
	}

	public void setFriends(List<Player> friends) {
		this.friends = friends;
	}
}
