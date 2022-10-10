package com.timfierek.steamgamesincommon.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {
	@Override
	public String toString() {
		return "Game [appId=" + appId + ", name=" + name + ", playtimeForever=" + playtimeForever + ", imgIconUrl="
				+ imgIconUrl + ", hasCommunityVisibleStats=" + hasCommunityVisibleStats + ", playtimeWindowsForever="
				+ playtimeWindowsForever + ", playtimeMacForever=" + playtimeMacForever + ", playtimeLinuxForever="
				+ playtimeLinuxForever + ", rTimeLastPlayed=" + rTimeLastPlayed + "]";
	}
	@JsonProperty("appid")
	private int appId;
	private String name;
	@JsonProperty("playtime_forever")
	private int playtimeForever;
	@JsonProperty("img_icon_url")
	private String imgIconUrl;
	@JsonProperty("has_community_visible_stats")
	private boolean hasCommunityVisibleStats;
	@JsonProperty("playtime_windows_forever")
	private int playtimeWindowsForever;
	@JsonProperty("playtime_mac_forever")
	private int playtimeMacForever;
	@JsonProperty("playtime_linux_forever")
	private int playtimeLinuxForever;
	@JsonProperty("rtime_last_played")
	private long rTimeLastPlayed;
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPlaytimeForever() {
		return playtimeForever;
	}
	public void setPlaytimeForever(int playtimeForever) {
		this.playtimeForever = playtimeForever;
	}
	public String getImgIconUrl() {
		return imgIconUrl;
	}
	public void setImgIconUrl(String imgIconUrl) {
		this.imgIconUrl = imgIconUrl;
	}
	public boolean isHasCommunityVisibleStats() {
		return hasCommunityVisibleStats;
	}
	public void setHasCommunityVisibleStats(boolean hasCommunityVisibleStats) {
		this.hasCommunityVisibleStats = hasCommunityVisibleStats;
	}
	public int getPlaytimeWindowsForever() {
		return playtimeWindowsForever;
	}
	public void setPlaytimeWindowsForever(int playtimeWindowsForever) {
		this.playtimeWindowsForever = playtimeWindowsForever;
	}
	public int getPlaytimeMacForever() {
		return playtimeMacForever;
	}
	public void setPlaytimeMacForever(int playtimeMacForever) {
		this.playtimeMacForever = playtimeMacForever;
	}
	public int getPlaytimeLinuxForever() {
		return playtimeLinuxForever;
	}
	public void setPlaytimeLinuxForever(int playtimeLinuxForever) {
		this.playtimeLinuxForever = playtimeLinuxForever;
	}
	public long getrTimeLastPlayed() {
		return rTimeLastPlayed;
	}
	public void setrTimeLastPlayed(long rTimeLastPlayed) {
		this.rTimeLastPlayed = rTimeLastPlayed;
	}
}
