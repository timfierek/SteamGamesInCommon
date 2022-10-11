package com.timfierek.steamgamesincommon.model;

public class GetFriendListResponse {
	private FriendsResponse friendslist;

	public FriendsResponse getFriendslist() {
		return friendslist;
	}

	public void setFriendslist(FriendsResponse friendslist) {
		this.friendslist = friendslist;
	}
}
