package com.timfierek.steamgamesincommon.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
	@Override
	public String toString() {
		return "Player [steamId=" + steamId + ", communityVisibilityState=" + communityVisibilityState
				+ ", profileState=" + profileState + ", personaName=" + personaName + ", commentPermission="
				+ commentPermission + ", profileUrl=" + profileUrl + ", avatar=" + avatar + ", avatarMedium="
				+ avatarMedium + ", avatarFull=" + avatarFull + ", avatarHash=" + avatarHash + ", lastLogOff="
				+ lastLogOff + ", personaState=" + personaState + ", realName=" + realName + ", primaryClanId="
				+ primaryClanId + ", timeCreated=" + timeCreated + ", personaStateFlags=" + personaStateFlags
				+ ", locCountryCode=" + locCountryCode + ", locStateCode=" + locStateCode + "]";
	}
	@JsonProperty("steamid")
	private String steamId;
	@JsonProperty("communityvisibilitystate")
	private int communityVisibilityState;
	@JsonProperty("profilestate")
	private int profileState;
	@JsonProperty("personaname")
	private String personaName;
	@JsonProperty("commentpermission")
	private int commentPermission;
	@JsonProperty("profileurl")
	private String profileUrl;
	private String avatar;
	@JsonProperty("avatarmedium")
	private String avatarMedium;
	@JsonProperty("avatarfull")
	private String avatarFull;
	@JsonProperty("avatarhash")
	private String avatarHash;
	@JsonProperty("lastlogoff")
	private long lastLogOff;
	@JsonProperty("personastate")
	private int personaState;
	@JsonProperty("realname")
	private String realName;
	@JsonProperty("primaryclanid")
	private String primaryClanId;
	@JsonProperty("timecreated")
	private long timeCreated;
	@JsonProperty("personastateflags")
	private int personaStateFlags;
	@JsonProperty("loccountrycode")
	private String locCountryCode;
	@JsonProperty("locstatecode")
	private String locStateCode;
	public String getSteamId() {
		return steamId;
	}
	public void setSteamId(String steamId) {
		this.steamId = steamId;
	}
	public int getCommunityVisibilityState() {
		return communityVisibilityState;
	}
	public void setCommunityVisibilityState(int communityVisibilityState) {
		this.communityVisibilityState = communityVisibilityState;
	}
	public int getProfileState() {
		return profileState;
	}
	public void setProfileState(int profileState) {
		this.profileState = profileState;
	}
	public String getPersonaName() {
		return personaName;
	}
	public void setPersonaName(String personaName) {
		this.personaName = personaName;
	}
	public int getCommentPermission() {
		return commentPermission;
	}
	public void setCommentPermission(int commentPermission) {
		this.commentPermission = commentPermission;
	}
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatarMedium() {
		return avatarMedium;
	}
	public void setAvatarMedium(String avatarMedium) {
		this.avatarMedium = avatarMedium;
	}
	public String getAvatarFull() {
		return avatarFull;
	}
	public void setAvatarFull(String avatarFull) {
		this.avatarFull = avatarFull;
	}
	public String getAvatarHash() {
		return avatarHash;
	}
	public void setAvatarHash(String avatarHash) {
		this.avatarHash = avatarHash;
	}
	public long getLastLogOff() {
		return lastLogOff;
	}
	public void setLastLogOff(long lastLogOff) {
		this.lastLogOff = lastLogOff;
	}
	public int getPersonaState() {
		return personaState;
	}
	public void setPersonaState(int personaState) {
		this.personaState = personaState;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPrimaryClanId() {
		return primaryClanId;
	}
	public void setPrimaryClanId(String primaryClanId) {
		this.primaryClanId = primaryClanId;
	}
	public long getTimeCreated() {
		return timeCreated;
	}
	public void setTimeCreated(long timeCreated) {
		this.timeCreated = timeCreated;
	}
	public int getPersonaStateFlags() {
		return personaStateFlags;
	}
	public void setPersonaStateFlags(int personaStateFlags) {
		this.personaStateFlags = personaStateFlags;
	}
	public String getLocCountryCode() {
		return locCountryCode;
	}
	public void setLocCountryCode(String locCountryCode) {
		this.locCountryCode = locCountryCode;
	}
	public String getLocStateCode() {
		return locStateCode;
	}
	public void setLocStateCode(String locStateCode) {
		this.locStateCode = locStateCode;
	}
}
