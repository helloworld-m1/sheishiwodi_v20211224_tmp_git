package com.m.sql.entity;

import java.util.Date;

public class Telegram_user {
    private Integer id;

    private String telegram_id;

    private String firstName;

    private String lastName;

    private String userName;

    private Integer joinGame;

    private Integer completeGame;

    private Integer exitGame;

    private Integer word_people;

    private Integer word_spy;

    private Integer word_people_victory;

    private Integer word_spy_victory;

    private Integer fraction;

    private Date create_time;

    private String language;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelegram_id() {
        return telegram_id;
    }

    public void setTelegram_id(String telegram_id) {
        this.telegram_id = telegram_id == null ? null : telegram_id.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getJoinGame() {
        return joinGame;
    }

    public void setJoinGame(Integer joinGame) {
        this.joinGame = joinGame;
    }

    public Integer getCompleteGame() {
        return completeGame;
    }

    public void setCompleteGame(Integer completeGame) {
        this.completeGame = completeGame;
    }

    public Integer getExitGame() {
        return exitGame;
    }

    public void setExitGame(Integer exitGame) {
        this.exitGame = exitGame;
    }

    public Integer getWord_people() {
        return word_people;
    }

    public void setWord_people(Integer word_people) {
        this.word_people = word_people;
    }

    public Integer getWord_spy() {
        return word_spy;
    }

    public void setWord_spy(Integer word_spy) {
        this.word_spy = word_spy;
    }

    public Integer getWord_people_victory() {
        return word_people_victory;
    }

    public void setWord_people_victory(Integer word_people_victory) {
        this.word_people_victory = word_people_victory;
    }

    public Integer getWord_spy_victory() {
        return word_spy_victory;
    }

    public void setWord_spy_victory(Integer word_spy_victory) {
        this.word_spy_victory = word_spy_victory;
    }

    public Integer getFraction() {
        return fraction;
    }

    public void setFraction(Integer fraction) {
        this.fraction = fraction;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }
}