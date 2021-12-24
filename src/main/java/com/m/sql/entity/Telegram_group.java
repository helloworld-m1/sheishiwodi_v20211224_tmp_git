package com.m.sql.entity;

import java.util.Date;

public class Telegram_group {
    private Integer id;

    private String groupId;

    private Date firstJoinTime;

    private Date joinTime;

    private Integer finishGame;

    private Boolean botAdmin;

    private Integer joinFrequency;

    private Integer kickOutFrequency;

    private Integer maxOfPeople;

    private String language;

    private String userName;

    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public Date getFirstJoinTime() {
        return firstJoinTime;
    }

    public void setFirstJoinTime(Date firstJoinTime) {
        this.firstJoinTime = firstJoinTime;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Integer getFinishGame() {
        return finishGame;
    }

    public void setFinishGame(Integer finishGame) {
        this.finishGame = finishGame;
    }

    public Boolean getBotAdmin() {
        return botAdmin;
    }

    public void setBotAdmin(Boolean botAdmin) {
        this.botAdmin = botAdmin;
    }

    public Integer getJoinFrequency() {
        return joinFrequency;
    }

    public void setJoinFrequency(Integer joinFrequency) {
        this.joinFrequency = joinFrequency;
    }

    public Integer getKickOutFrequency() {
        return kickOutFrequency;
    }

    public void setKickOutFrequency(Integer kickOutFrequency) {
        this.kickOutFrequency = kickOutFrequency;
    }

    public Integer getMaxOfPeople() {
        return maxOfPeople;
    }

    public void setMaxOfPeople(Integer maxOfPeople) {
        this.maxOfPeople = maxOfPeople;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}