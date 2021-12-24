package com.m.sql.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Telegram_userExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Telegram_userExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTelegram_idIsNull() {
            addCriterion("telegram_id is null");
            return (Criteria) this;
        }

        public Criteria andTelegram_idIsNotNull() {
            addCriterion("telegram_id is not null");
            return (Criteria) this;
        }

        public Criteria andTelegram_idEqualTo(String value) {
            addCriterion("telegram_id =", value, "telegram_id");
            return (Criteria) this;
        }

        public Criteria andTelegram_idNotEqualTo(String value) {
            addCriterion("telegram_id <>", value, "telegram_id");
            return (Criteria) this;
        }

        public Criteria andTelegram_idGreaterThan(String value) {
            addCriterion("telegram_id >", value, "telegram_id");
            return (Criteria) this;
        }

        public Criteria andTelegram_idGreaterThanOrEqualTo(String value) {
            addCriterion("telegram_id >=", value, "telegram_id");
            return (Criteria) this;
        }

        public Criteria andTelegram_idLessThan(String value) {
            addCriterion("telegram_id <", value, "telegram_id");
            return (Criteria) this;
        }

        public Criteria andTelegram_idLessThanOrEqualTo(String value) {
            addCriterion("telegram_id <=", value, "telegram_id");
            return (Criteria) this;
        }

        public Criteria andTelegram_idLike(String value) {
            addCriterion("telegram_id like", value, "telegram_id");
            return (Criteria) this;
        }

        public Criteria andTelegram_idNotLike(String value) {
            addCriterion("telegram_id not like", value, "telegram_id");
            return (Criteria) this;
        }

        public Criteria andTelegram_idIn(List<String> values) {
            addCriterion("telegram_id in", values, "telegram_id");
            return (Criteria) this;
        }

        public Criteria andTelegram_idNotIn(List<String> values) {
            addCriterion("telegram_id not in", values, "telegram_id");
            return (Criteria) this;
        }

        public Criteria andTelegram_idBetween(String value1, String value2) {
            addCriterion("telegram_id between", value1, value2, "telegram_id");
            return (Criteria) this;
        }

        public Criteria andTelegram_idNotBetween(String value1, String value2) {
            addCriterion("telegram_id not between", value1, value2, "telegram_id");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("firstName is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("firstName is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("firstName =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("firstName <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("firstName >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("firstName >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("firstName <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("firstName <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("firstName like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("firstName not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("firstName in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("firstName not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("firstName between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("firstName not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNull() {
            addCriterion("lastName is null");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNotNull() {
            addCriterion("lastName is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameEqualTo(String value) {
            addCriterion("lastName =", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotEqualTo(String value) {
            addCriterion("lastName <>", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThan(String value) {
            addCriterion("lastName >", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("lastName >=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThan(String value) {
            addCriterion("lastName <", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThanOrEqualTo(String value) {
            addCriterion("lastName <=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLike(String value) {
            addCriterion("lastName like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotLike(String value) {
            addCriterion("lastName not like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameIn(List<String> values) {
            addCriterion("lastName in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotIn(List<String> values) {
            addCriterion("lastName not in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameBetween(String value1, String value2) {
            addCriterion("lastName between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotBetween(String value1, String value2) {
            addCriterion("lastName not between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andJoinGameIsNull() {
            addCriterion("joinGame is null");
            return (Criteria) this;
        }

        public Criteria andJoinGameIsNotNull() {
            addCriterion("joinGame is not null");
            return (Criteria) this;
        }

        public Criteria andJoinGameEqualTo(Integer value) {
            addCriterion("joinGame =", value, "joinGame");
            return (Criteria) this;
        }

        public Criteria andJoinGameNotEqualTo(Integer value) {
            addCriterion("joinGame <>", value, "joinGame");
            return (Criteria) this;
        }

        public Criteria andJoinGameGreaterThan(Integer value) {
            addCriterion("joinGame >", value, "joinGame");
            return (Criteria) this;
        }

        public Criteria andJoinGameGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinGame >=", value, "joinGame");
            return (Criteria) this;
        }

        public Criteria andJoinGameLessThan(Integer value) {
            addCriterion("joinGame <", value, "joinGame");
            return (Criteria) this;
        }

        public Criteria andJoinGameLessThanOrEqualTo(Integer value) {
            addCriterion("joinGame <=", value, "joinGame");
            return (Criteria) this;
        }

        public Criteria andJoinGameIn(List<Integer> values) {
            addCriterion("joinGame in", values, "joinGame");
            return (Criteria) this;
        }

        public Criteria andJoinGameNotIn(List<Integer> values) {
            addCriterion("joinGame not in", values, "joinGame");
            return (Criteria) this;
        }

        public Criteria andJoinGameBetween(Integer value1, Integer value2) {
            addCriterion("joinGame between", value1, value2, "joinGame");
            return (Criteria) this;
        }

        public Criteria andJoinGameNotBetween(Integer value1, Integer value2) {
            addCriterion("joinGame not between", value1, value2, "joinGame");
            return (Criteria) this;
        }

        public Criteria andCompleteGameIsNull() {
            addCriterion("completeGame is null");
            return (Criteria) this;
        }

        public Criteria andCompleteGameIsNotNull() {
            addCriterion("completeGame is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteGameEqualTo(Integer value) {
            addCriterion("completeGame =", value, "completeGame");
            return (Criteria) this;
        }

        public Criteria andCompleteGameNotEqualTo(Integer value) {
            addCriterion("completeGame <>", value, "completeGame");
            return (Criteria) this;
        }

        public Criteria andCompleteGameGreaterThan(Integer value) {
            addCriterion("completeGame >", value, "completeGame");
            return (Criteria) this;
        }

        public Criteria andCompleteGameGreaterThanOrEqualTo(Integer value) {
            addCriterion("completeGame >=", value, "completeGame");
            return (Criteria) this;
        }

        public Criteria andCompleteGameLessThan(Integer value) {
            addCriterion("completeGame <", value, "completeGame");
            return (Criteria) this;
        }

        public Criteria andCompleteGameLessThanOrEqualTo(Integer value) {
            addCriterion("completeGame <=", value, "completeGame");
            return (Criteria) this;
        }

        public Criteria andCompleteGameIn(List<Integer> values) {
            addCriterion("completeGame in", values, "completeGame");
            return (Criteria) this;
        }

        public Criteria andCompleteGameNotIn(List<Integer> values) {
            addCriterion("completeGame not in", values, "completeGame");
            return (Criteria) this;
        }

        public Criteria andCompleteGameBetween(Integer value1, Integer value2) {
            addCriterion("completeGame between", value1, value2, "completeGame");
            return (Criteria) this;
        }

        public Criteria andCompleteGameNotBetween(Integer value1, Integer value2) {
            addCriterion("completeGame not between", value1, value2, "completeGame");
            return (Criteria) this;
        }

        public Criteria andExitGameIsNull() {
            addCriterion("exitGame is null");
            return (Criteria) this;
        }

        public Criteria andExitGameIsNotNull() {
            addCriterion("exitGame is not null");
            return (Criteria) this;
        }

        public Criteria andExitGameEqualTo(Integer value) {
            addCriterion("exitGame =", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameNotEqualTo(Integer value) {
            addCriterion("exitGame <>", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameGreaterThan(Integer value) {
            addCriterion("exitGame >", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameGreaterThanOrEqualTo(Integer value) {
            addCriterion("exitGame >=", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameLessThan(Integer value) {
            addCriterion("exitGame <", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameLessThanOrEqualTo(Integer value) {
            addCriterion("exitGame <=", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameIn(List<Integer> values) {
            addCriterion("exitGame in", values, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameNotIn(List<Integer> values) {
            addCriterion("exitGame not in", values, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameBetween(Integer value1, Integer value2) {
            addCriterion("exitGame between", value1, value2, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameNotBetween(Integer value1, Integer value2) {
            addCriterion("exitGame not between", value1, value2, "exitGame");
            return (Criteria) this;
        }

        public Criteria andWord_peopleIsNull() {
            addCriterion("word_people is null");
            return (Criteria) this;
        }

        public Criteria andWord_peopleIsNotNull() {
            addCriterion("word_people is not null");
            return (Criteria) this;
        }

        public Criteria andWord_peopleEqualTo(Integer value) {
            addCriterion("word_people =", value, "word_people");
            return (Criteria) this;
        }

        public Criteria andWord_peopleNotEqualTo(Integer value) {
            addCriterion("word_people <>", value, "word_people");
            return (Criteria) this;
        }

        public Criteria andWord_peopleGreaterThan(Integer value) {
            addCriterion("word_people >", value, "word_people");
            return (Criteria) this;
        }

        public Criteria andWord_peopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("word_people >=", value, "word_people");
            return (Criteria) this;
        }

        public Criteria andWord_peopleLessThan(Integer value) {
            addCriterion("word_people <", value, "word_people");
            return (Criteria) this;
        }

        public Criteria andWord_peopleLessThanOrEqualTo(Integer value) {
            addCriterion("word_people <=", value, "word_people");
            return (Criteria) this;
        }

        public Criteria andWord_peopleIn(List<Integer> values) {
            addCriterion("word_people in", values, "word_people");
            return (Criteria) this;
        }

        public Criteria andWord_peopleNotIn(List<Integer> values) {
            addCriterion("word_people not in", values, "word_people");
            return (Criteria) this;
        }

        public Criteria andWord_peopleBetween(Integer value1, Integer value2) {
            addCriterion("word_people between", value1, value2, "word_people");
            return (Criteria) this;
        }

        public Criteria andWord_peopleNotBetween(Integer value1, Integer value2) {
            addCriterion("word_people not between", value1, value2, "word_people");
            return (Criteria) this;
        }

        public Criteria andWord_spyIsNull() {
            addCriterion("word_spy is null");
            return (Criteria) this;
        }

        public Criteria andWord_spyIsNotNull() {
            addCriterion("word_spy is not null");
            return (Criteria) this;
        }

        public Criteria andWord_spyEqualTo(Integer value) {
            addCriterion("word_spy =", value, "word_spy");
            return (Criteria) this;
        }

        public Criteria andWord_spyNotEqualTo(Integer value) {
            addCriterion("word_spy <>", value, "word_spy");
            return (Criteria) this;
        }

        public Criteria andWord_spyGreaterThan(Integer value) {
            addCriterion("word_spy >", value, "word_spy");
            return (Criteria) this;
        }

        public Criteria andWord_spyGreaterThanOrEqualTo(Integer value) {
            addCriterion("word_spy >=", value, "word_spy");
            return (Criteria) this;
        }

        public Criteria andWord_spyLessThan(Integer value) {
            addCriterion("word_spy <", value, "word_spy");
            return (Criteria) this;
        }

        public Criteria andWord_spyLessThanOrEqualTo(Integer value) {
            addCriterion("word_spy <=", value, "word_spy");
            return (Criteria) this;
        }

        public Criteria andWord_spyIn(List<Integer> values) {
            addCriterion("word_spy in", values, "word_spy");
            return (Criteria) this;
        }

        public Criteria andWord_spyNotIn(List<Integer> values) {
            addCriterion("word_spy not in", values, "word_spy");
            return (Criteria) this;
        }

        public Criteria andWord_spyBetween(Integer value1, Integer value2) {
            addCriterion("word_spy between", value1, value2, "word_spy");
            return (Criteria) this;
        }

        public Criteria andWord_spyNotBetween(Integer value1, Integer value2) {
            addCriterion("word_spy not between", value1, value2, "word_spy");
            return (Criteria) this;
        }

        public Criteria andWord_people_victoryIsNull() {
            addCriterion("word_people_victory is null");
            return (Criteria) this;
        }

        public Criteria andWord_people_victoryIsNotNull() {
            addCriterion("word_people_victory is not null");
            return (Criteria) this;
        }

        public Criteria andWord_people_victoryEqualTo(Integer value) {
            addCriterion("word_people_victory =", value, "word_people_victory");
            return (Criteria) this;
        }

        public Criteria andWord_people_victoryNotEqualTo(Integer value) {
            addCriterion("word_people_victory <>", value, "word_people_victory");
            return (Criteria) this;
        }

        public Criteria andWord_people_victoryGreaterThan(Integer value) {
            addCriterion("word_people_victory >", value, "word_people_victory");
            return (Criteria) this;
        }

        public Criteria andWord_people_victoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("word_people_victory >=", value, "word_people_victory");
            return (Criteria) this;
        }

        public Criteria andWord_people_victoryLessThan(Integer value) {
            addCriterion("word_people_victory <", value, "word_people_victory");
            return (Criteria) this;
        }

        public Criteria andWord_people_victoryLessThanOrEqualTo(Integer value) {
            addCriterion("word_people_victory <=", value, "word_people_victory");
            return (Criteria) this;
        }

        public Criteria andWord_people_victoryIn(List<Integer> values) {
            addCriterion("word_people_victory in", values, "word_people_victory");
            return (Criteria) this;
        }

        public Criteria andWord_people_victoryNotIn(List<Integer> values) {
            addCriterion("word_people_victory not in", values, "word_people_victory");
            return (Criteria) this;
        }

        public Criteria andWord_people_victoryBetween(Integer value1, Integer value2) {
            addCriterion("word_people_victory between", value1, value2, "word_people_victory");
            return (Criteria) this;
        }

        public Criteria andWord_people_victoryNotBetween(Integer value1, Integer value2) {
            addCriterion("word_people_victory not between", value1, value2, "word_people_victory");
            return (Criteria) this;
        }

        public Criteria andWord_spy_victoryIsNull() {
            addCriterion("word_spy_victory is null");
            return (Criteria) this;
        }

        public Criteria andWord_spy_victoryIsNotNull() {
            addCriterion("word_spy_victory is not null");
            return (Criteria) this;
        }

        public Criteria andWord_spy_victoryEqualTo(Integer value) {
            addCriterion("word_spy_victory =", value, "word_spy_victory");
            return (Criteria) this;
        }

        public Criteria andWord_spy_victoryNotEqualTo(Integer value) {
            addCriterion("word_spy_victory <>", value, "word_spy_victory");
            return (Criteria) this;
        }

        public Criteria andWord_spy_victoryGreaterThan(Integer value) {
            addCriterion("word_spy_victory >", value, "word_spy_victory");
            return (Criteria) this;
        }

        public Criteria andWord_spy_victoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("word_spy_victory >=", value, "word_spy_victory");
            return (Criteria) this;
        }

        public Criteria andWord_spy_victoryLessThan(Integer value) {
            addCriterion("word_spy_victory <", value, "word_spy_victory");
            return (Criteria) this;
        }

        public Criteria andWord_spy_victoryLessThanOrEqualTo(Integer value) {
            addCriterion("word_spy_victory <=", value, "word_spy_victory");
            return (Criteria) this;
        }

        public Criteria andWord_spy_victoryIn(List<Integer> values) {
            addCriterion("word_spy_victory in", values, "word_spy_victory");
            return (Criteria) this;
        }

        public Criteria andWord_spy_victoryNotIn(List<Integer> values) {
            addCriterion("word_spy_victory not in", values, "word_spy_victory");
            return (Criteria) this;
        }

        public Criteria andWord_spy_victoryBetween(Integer value1, Integer value2) {
            addCriterion("word_spy_victory between", value1, value2, "word_spy_victory");
            return (Criteria) this;
        }

        public Criteria andWord_spy_victoryNotBetween(Integer value1, Integer value2) {
            addCriterion("word_spy_victory not between", value1, value2, "word_spy_victory");
            return (Criteria) this;
        }

        public Criteria andFractionIsNull() {
            addCriterion("fraction is null");
            return (Criteria) this;
        }

        public Criteria andFractionIsNotNull() {
            addCriterion("fraction is not null");
            return (Criteria) this;
        }

        public Criteria andFractionEqualTo(Integer value) {
            addCriterion("fraction =", value, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionNotEqualTo(Integer value) {
            addCriterion("fraction <>", value, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionGreaterThan(Integer value) {
            addCriterion("fraction >", value, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionGreaterThanOrEqualTo(Integer value) {
            addCriterion("fraction >=", value, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionLessThan(Integer value) {
            addCriterion("fraction <", value, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionLessThanOrEqualTo(Integer value) {
            addCriterion("fraction <=", value, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionIn(List<Integer> values) {
            addCriterion("fraction in", values, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionNotIn(List<Integer> values) {
            addCriterion("fraction not in", values, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionBetween(Integer value1, Integer value2) {
            addCriterion("fraction between", value1, value2, "fraction");
            return (Criteria) this;
        }

        public Criteria andFractionNotBetween(Integer value1, Integer value2) {
            addCriterion("fraction not between", value1, value2, "fraction");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}