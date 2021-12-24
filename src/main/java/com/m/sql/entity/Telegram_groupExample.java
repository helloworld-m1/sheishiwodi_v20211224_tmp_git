package com.m.sql.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Telegram_groupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Telegram_groupExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("groupId is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("groupId is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("groupId =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("groupId <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("groupId >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("groupId >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("groupId <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("groupId <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("groupId like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("groupId not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("groupId in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("groupId not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("groupId between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("groupId not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andFirstJoinTimeIsNull() {
            addCriterion("firstJoinTime is null");
            return (Criteria) this;
        }

        public Criteria andFirstJoinTimeIsNotNull() {
            addCriterion("firstJoinTime is not null");
            return (Criteria) this;
        }

        public Criteria andFirstJoinTimeEqualTo(Date value) {
            addCriterion("firstJoinTime =", value, "firstJoinTime");
            return (Criteria) this;
        }

        public Criteria andFirstJoinTimeNotEqualTo(Date value) {
            addCriterion("firstJoinTime <>", value, "firstJoinTime");
            return (Criteria) this;
        }

        public Criteria andFirstJoinTimeGreaterThan(Date value) {
            addCriterion("firstJoinTime >", value, "firstJoinTime");
            return (Criteria) this;
        }

        public Criteria andFirstJoinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("firstJoinTime >=", value, "firstJoinTime");
            return (Criteria) this;
        }

        public Criteria andFirstJoinTimeLessThan(Date value) {
            addCriterion("firstJoinTime <", value, "firstJoinTime");
            return (Criteria) this;
        }

        public Criteria andFirstJoinTimeLessThanOrEqualTo(Date value) {
            addCriterion("firstJoinTime <=", value, "firstJoinTime");
            return (Criteria) this;
        }

        public Criteria andFirstJoinTimeIn(List<Date> values) {
            addCriterion("firstJoinTime in", values, "firstJoinTime");
            return (Criteria) this;
        }

        public Criteria andFirstJoinTimeNotIn(List<Date> values) {
            addCriterion("firstJoinTime not in", values, "firstJoinTime");
            return (Criteria) this;
        }

        public Criteria andFirstJoinTimeBetween(Date value1, Date value2) {
            addCriterion("firstJoinTime between", value1, value2, "firstJoinTime");
            return (Criteria) this;
        }

        public Criteria andFirstJoinTimeNotBetween(Date value1, Date value2) {
            addCriterion("firstJoinTime not between", value1, value2, "firstJoinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNull() {
            addCriterion("joinTime is null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNotNull() {
            addCriterion("joinTime is not null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeEqualTo(Date value) {
            addCriterion("joinTime =", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotEqualTo(Date value) {
            addCriterion("joinTime <>", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThan(Date value) {
            addCriterion("joinTime >", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("joinTime >=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThan(Date value) {
            addCriterion("joinTime <", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThanOrEqualTo(Date value) {
            addCriterion("joinTime <=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIn(List<Date> values) {
            addCriterion("joinTime in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotIn(List<Date> values) {
            addCriterion("joinTime not in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeBetween(Date value1, Date value2) {
            addCriterion("joinTime between", value1, value2, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotBetween(Date value1, Date value2) {
            addCriterion("joinTime not between", value1, value2, "joinTime");
            return (Criteria) this;
        }

        public Criteria andFinishGameIsNull() {
            addCriterion("finishGame is null");
            return (Criteria) this;
        }

        public Criteria andFinishGameIsNotNull() {
            addCriterion("finishGame is not null");
            return (Criteria) this;
        }

        public Criteria andFinishGameEqualTo(Integer value) {
            addCriterion("finishGame =", value, "finishGame");
            return (Criteria) this;
        }

        public Criteria andFinishGameNotEqualTo(Integer value) {
            addCriterion("finishGame <>", value, "finishGame");
            return (Criteria) this;
        }

        public Criteria andFinishGameGreaterThan(Integer value) {
            addCriterion("finishGame >", value, "finishGame");
            return (Criteria) this;
        }

        public Criteria andFinishGameGreaterThanOrEqualTo(Integer value) {
            addCriterion("finishGame >=", value, "finishGame");
            return (Criteria) this;
        }

        public Criteria andFinishGameLessThan(Integer value) {
            addCriterion("finishGame <", value, "finishGame");
            return (Criteria) this;
        }

        public Criteria andFinishGameLessThanOrEqualTo(Integer value) {
            addCriterion("finishGame <=", value, "finishGame");
            return (Criteria) this;
        }

        public Criteria andFinishGameIn(List<Integer> values) {
            addCriterion("finishGame in", values, "finishGame");
            return (Criteria) this;
        }

        public Criteria andFinishGameNotIn(List<Integer> values) {
            addCriterion("finishGame not in", values, "finishGame");
            return (Criteria) this;
        }

        public Criteria andFinishGameBetween(Integer value1, Integer value2) {
            addCriterion("finishGame between", value1, value2, "finishGame");
            return (Criteria) this;
        }

        public Criteria andFinishGameNotBetween(Integer value1, Integer value2) {
            addCriterion("finishGame not between", value1, value2, "finishGame");
            return (Criteria) this;
        }

        public Criteria andBotAdminIsNull() {
            addCriterion("botAdmin is null");
            return (Criteria) this;
        }

        public Criteria andBotAdminIsNotNull() {
            addCriterion("botAdmin is not null");
            return (Criteria) this;
        }

        public Criteria andBotAdminEqualTo(Boolean value) {
            addCriterion("botAdmin =", value, "botAdmin");
            return (Criteria) this;
        }

        public Criteria andBotAdminNotEqualTo(Boolean value) {
            addCriterion("botAdmin <>", value, "botAdmin");
            return (Criteria) this;
        }

        public Criteria andBotAdminGreaterThan(Boolean value) {
            addCriterion("botAdmin >", value, "botAdmin");
            return (Criteria) this;
        }

        public Criteria andBotAdminGreaterThanOrEqualTo(Boolean value) {
            addCriterion("botAdmin >=", value, "botAdmin");
            return (Criteria) this;
        }

        public Criteria andBotAdminLessThan(Boolean value) {
            addCriterion("botAdmin <", value, "botAdmin");
            return (Criteria) this;
        }

        public Criteria andBotAdminLessThanOrEqualTo(Boolean value) {
            addCriterion("botAdmin <=", value, "botAdmin");
            return (Criteria) this;
        }

        public Criteria andBotAdminIn(List<Boolean> values) {
            addCriterion("botAdmin in", values, "botAdmin");
            return (Criteria) this;
        }

        public Criteria andBotAdminNotIn(List<Boolean> values) {
            addCriterion("botAdmin not in", values, "botAdmin");
            return (Criteria) this;
        }

        public Criteria andBotAdminBetween(Boolean value1, Boolean value2) {
            addCriterion("botAdmin between", value1, value2, "botAdmin");
            return (Criteria) this;
        }

        public Criteria andBotAdminNotBetween(Boolean value1, Boolean value2) {
            addCriterion("botAdmin not between", value1, value2, "botAdmin");
            return (Criteria) this;
        }

        public Criteria andJoinFrequencyIsNull() {
            addCriterion("joinFrequency is null");
            return (Criteria) this;
        }

        public Criteria andJoinFrequencyIsNotNull() {
            addCriterion("joinFrequency is not null");
            return (Criteria) this;
        }

        public Criteria andJoinFrequencyEqualTo(Integer value) {
            addCriterion("joinFrequency =", value, "joinFrequency");
            return (Criteria) this;
        }

        public Criteria andJoinFrequencyNotEqualTo(Integer value) {
            addCriterion("joinFrequency <>", value, "joinFrequency");
            return (Criteria) this;
        }

        public Criteria andJoinFrequencyGreaterThan(Integer value) {
            addCriterion("joinFrequency >", value, "joinFrequency");
            return (Criteria) this;
        }

        public Criteria andJoinFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinFrequency >=", value, "joinFrequency");
            return (Criteria) this;
        }

        public Criteria andJoinFrequencyLessThan(Integer value) {
            addCriterion("joinFrequency <", value, "joinFrequency");
            return (Criteria) this;
        }

        public Criteria andJoinFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("joinFrequency <=", value, "joinFrequency");
            return (Criteria) this;
        }

        public Criteria andJoinFrequencyIn(List<Integer> values) {
            addCriterion("joinFrequency in", values, "joinFrequency");
            return (Criteria) this;
        }

        public Criteria andJoinFrequencyNotIn(List<Integer> values) {
            addCriterion("joinFrequency not in", values, "joinFrequency");
            return (Criteria) this;
        }

        public Criteria andJoinFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("joinFrequency between", value1, value2, "joinFrequency");
            return (Criteria) this;
        }

        public Criteria andJoinFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("joinFrequency not between", value1, value2, "joinFrequency");
            return (Criteria) this;
        }

        public Criteria andKickOutFrequencyIsNull() {
            addCriterion("kickOutFrequency is null");
            return (Criteria) this;
        }

        public Criteria andKickOutFrequencyIsNotNull() {
            addCriterion("kickOutFrequency is not null");
            return (Criteria) this;
        }

        public Criteria andKickOutFrequencyEqualTo(Integer value) {
            addCriterion("kickOutFrequency =", value, "kickOutFrequency");
            return (Criteria) this;
        }

        public Criteria andKickOutFrequencyNotEqualTo(Integer value) {
            addCriterion("kickOutFrequency <>", value, "kickOutFrequency");
            return (Criteria) this;
        }

        public Criteria andKickOutFrequencyGreaterThan(Integer value) {
            addCriterion("kickOutFrequency >", value, "kickOutFrequency");
            return (Criteria) this;
        }

        public Criteria andKickOutFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("kickOutFrequency >=", value, "kickOutFrequency");
            return (Criteria) this;
        }

        public Criteria andKickOutFrequencyLessThan(Integer value) {
            addCriterion("kickOutFrequency <", value, "kickOutFrequency");
            return (Criteria) this;
        }

        public Criteria andKickOutFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("kickOutFrequency <=", value, "kickOutFrequency");
            return (Criteria) this;
        }

        public Criteria andKickOutFrequencyIn(List<Integer> values) {
            addCriterion("kickOutFrequency in", values, "kickOutFrequency");
            return (Criteria) this;
        }

        public Criteria andKickOutFrequencyNotIn(List<Integer> values) {
            addCriterion("kickOutFrequency not in", values, "kickOutFrequency");
            return (Criteria) this;
        }

        public Criteria andKickOutFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("kickOutFrequency between", value1, value2, "kickOutFrequency");
            return (Criteria) this;
        }

        public Criteria andKickOutFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("kickOutFrequency not between", value1, value2, "kickOutFrequency");
            return (Criteria) this;
        }

        public Criteria andMaxOfPeopleIsNull() {
            addCriterion("MaxOfPeople is null");
            return (Criteria) this;
        }

        public Criteria andMaxOfPeopleIsNotNull() {
            addCriterion("MaxOfPeople is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOfPeopleEqualTo(Integer value) {
            addCriterion("MaxOfPeople =", value, "maxOfPeople");
            return (Criteria) this;
        }

        public Criteria andMaxOfPeopleNotEqualTo(Integer value) {
            addCriterion("MaxOfPeople <>", value, "maxOfPeople");
            return (Criteria) this;
        }

        public Criteria andMaxOfPeopleGreaterThan(Integer value) {
            addCriterion("MaxOfPeople >", value, "maxOfPeople");
            return (Criteria) this;
        }

        public Criteria andMaxOfPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaxOfPeople >=", value, "maxOfPeople");
            return (Criteria) this;
        }

        public Criteria andMaxOfPeopleLessThan(Integer value) {
            addCriterion("MaxOfPeople <", value, "maxOfPeople");
            return (Criteria) this;
        }

        public Criteria andMaxOfPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("MaxOfPeople <=", value, "maxOfPeople");
            return (Criteria) this;
        }

        public Criteria andMaxOfPeopleIn(List<Integer> values) {
            addCriterion("MaxOfPeople in", values, "maxOfPeople");
            return (Criteria) this;
        }

        public Criteria andMaxOfPeopleNotIn(List<Integer> values) {
            addCriterion("MaxOfPeople not in", values, "maxOfPeople");
            return (Criteria) this;
        }

        public Criteria andMaxOfPeopleBetween(Integer value1, Integer value2) {
            addCriterion("MaxOfPeople between", value1, value2, "maxOfPeople");
            return (Criteria) this;
        }

        public Criteria andMaxOfPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("MaxOfPeople not between", value1, value2, "maxOfPeople");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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