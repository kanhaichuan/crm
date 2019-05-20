package com.example.crm.model;

import java.util.ArrayList;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNull() {
            addCriterion("dueDate is null");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNotNull() {
            addCriterion("dueDate is not null");
            return (Criteria) this;
        }

        public Criteria andDueDateEqualTo(String value) {
            addCriterion("dueDate =", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotEqualTo(String value) {
            addCriterion("dueDate <>", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThan(String value) {
            addCriterion("dueDate >", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThanOrEqualTo(String value) {
            addCriterion("dueDate >=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThan(String value) {
            addCriterion("dueDate <", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThanOrEqualTo(String value) {
            addCriterion("dueDate <=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLike(String value) {
            addCriterion("dueDate like", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotLike(String value) {
            addCriterion("dueDate not like", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIn(List<String> values) {
            addCriterion("dueDate in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotIn(List<String> values) {
            addCriterion("dueDate not in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateBetween(String value1, String value2) {
            addCriterion("dueDate between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotBetween(String value1, String value2) {
            addCriterion("dueDate not between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andContactsIdIsNull() {
            addCriterion("contactsId is null");
            return (Criteria) this;
        }

        public Criteria andContactsIdIsNotNull() {
            addCriterion("contactsId is not null");
            return (Criteria) this;
        }

        public Criteria andContactsIdEqualTo(String value) {
            addCriterion("contactsId =", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdNotEqualTo(String value) {
            addCriterion("contactsId <>", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdGreaterThan(String value) {
            addCriterion("contactsId >", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdGreaterThanOrEqualTo(String value) {
            addCriterion("contactsId >=", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdLessThan(String value) {
            addCriterion("contactsId <", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdLessThanOrEqualTo(String value) {
            addCriterion("contactsId <=", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdLike(String value) {
            addCriterion("contactsId like", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdNotLike(String value) {
            addCriterion("contactsId not like", value, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdIn(List<String> values) {
            addCriterion("contactsId in", values, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdNotIn(List<String> values) {
            addCriterion("contactsId not in", values, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdBetween(String value1, String value2) {
            addCriterion("contactsId between", value1, value2, "contactsId");
            return (Criteria) this;
        }

        public Criteria andContactsIdNotBetween(String value1, String value2) {
            addCriterion("contactsId not between", value1, value2, "contactsId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("priority like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("priority not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andRemindFlagIsNull() {
            addCriterion("remindFlag is null");
            return (Criteria) this;
        }

        public Criteria andRemindFlagIsNotNull() {
            addCriterion("remindFlag is not null");
            return (Criteria) this;
        }

        public Criteria andRemindFlagEqualTo(Integer value) {
            addCriterion("remindFlag =", value, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagNotEqualTo(Integer value) {
            addCriterion("remindFlag <>", value, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagGreaterThan(Integer value) {
            addCriterion("remindFlag >", value, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("remindFlag >=", value, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagLessThan(Integer value) {
            addCriterion("remindFlag <", value, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagLessThanOrEqualTo(Integer value) {
            addCriterion("remindFlag <=", value, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagIn(List<Integer> values) {
            addCriterion("remindFlag in", values, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagNotIn(List<Integer> values) {
            addCriterion("remindFlag not in", values, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagBetween(Integer value1, Integer value2) {
            addCriterion("remindFlag between", value1, value2, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andRemindFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("remindFlag not between", value1, value2, "remindFlag");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("startTime =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("startTime <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("startTime >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("startTime >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("startTime <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("startTime <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("startTime like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("startTime not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("startTime in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("startTime not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("startTime between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("startTime not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeIsNull() {
            addCriterion("repeatType is null");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeIsNotNull() {
            addCriterion("repeatType is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeEqualTo(String value) {
            addCriterion("repeatType =", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeNotEqualTo(String value) {
            addCriterion("repeatType <>", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeGreaterThan(String value) {
            addCriterion("repeatType >", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repeatType >=", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeLessThan(String value) {
            addCriterion("repeatType <", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeLessThanOrEqualTo(String value) {
            addCriterion("repeatType <=", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeLike(String value) {
            addCriterion("repeatType like", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeNotLike(String value) {
            addCriterion("repeatType not like", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeIn(List<String> values) {
            addCriterion("repeatType in", values, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeNotIn(List<String> values) {
            addCriterion("repeatType not in", values, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeBetween(String value1, String value2) {
            addCriterion("repeatType between", value1, value2, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeNotBetween(String value1, String value2) {
            addCriterion("repeatType not between", value1, value2, "repeatType");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeIsNull() {
            addCriterion("adviceType is null");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeIsNotNull() {
            addCriterion("adviceType is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeEqualTo(String value) {
            addCriterion("adviceType =", value, "adviceType");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeNotEqualTo(String value) {
            addCriterion("adviceType <>", value, "adviceType");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeGreaterThan(String value) {
            addCriterion("adviceType >", value, "adviceType");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("adviceType >=", value, "adviceType");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeLessThan(String value) {
            addCriterion("adviceType <", value, "adviceType");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeLessThanOrEqualTo(String value) {
            addCriterion("adviceType <=", value, "adviceType");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeLike(String value) {
            addCriterion("adviceType like", value, "adviceType");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeNotLike(String value) {
            addCriterion("adviceType not like", value, "adviceType");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeIn(List<String> values) {
            addCriterion("adviceType in", values, "adviceType");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeNotIn(List<String> values) {
            addCriterion("adviceType not in", values, "adviceType");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeBetween(String value1, String value2) {
            addCriterion("adviceType between", value1, value2, "adviceType");
            return (Criteria) this;
        }

        public Criteria andAdviceTypeNotBetween(String value1, String value2) {
            addCriterion("adviceType not between", value1, value2, "adviceType");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("createBy is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("createBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("createBy =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("createBy <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("createBy >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("createBy >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("createBy <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("createBy <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("createBy like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("createBy not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("createBy in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("createBy not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("createBy between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("createBy not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("createTime like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("createTime not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEditByIsNull() {
            addCriterion("editBy is null");
            return (Criteria) this;
        }

        public Criteria andEditByIsNotNull() {
            addCriterion("editBy is not null");
            return (Criteria) this;
        }

        public Criteria andEditByEqualTo(String value) {
            addCriterion("editBy =", value, "editBy");
            return (Criteria) this;
        }

        public Criteria andEditByNotEqualTo(String value) {
            addCriterion("editBy <>", value, "editBy");
            return (Criteria) this;
        }

        public Criteria andEditByGreaterThan(String value) {
            addCriterion("editBy >", value, "editBy");
            return (Criteria) this;
        }

        public Criteria andEditByGreaterThanOrEqualTo(String value) {
            addCriterion("editBy >=", value, "editBy");
            return (Criteria) this;
        }

        public Criteria andEditByLessThan(String value) {
            addCriterion("editBy <", value, "editBy");
            return (Criteria) this;
        }

        public Criteria andEditByLessThanOrEqualTo(String value) {
            addCriterion("editBy <=", value, "editBy");
            return (Criteria) this;
        }

        public Criteria andEditByLike(String value) {
            addCriterion("editBy like", value, "editBy");
            return (Criteria) this;
        }

        public Criteria andEditByNotLike(String value) {
            addCriterion("editBy not like", value, "editBy");
            return (Criteria) this;
        }

        public Criteria andEditByIn(List<String> values) {
            addCriterion("editBy in", values, "editBy");
            return (Criteria) this;
        }

        public Criteria andEditByNotIn(List<String> values) {
            addCriterion("editBy not in", values, "editBy");
            return (Criteria) this;
        }

        public Criteria andEditByBetween(String value1, String value2) {
            addCriterion("editBy between", value1, value2, "editBy");
            return (Criteria) this;
        }

        public Criteria andEditByNotBetween(String value1, String value2) {
            addCriterion("editBy not between", value1, value2, "editBy");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNull() {
            addCriterion("editTime is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("editTime is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(String value) {
            addCriterion("editTime =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(String value) {
            addCriterion("editTime <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(String value) {
            addCriterion("editTime >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(String value) {
            addCriterion("editTime >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(String value) {
            addCriterion("editTime <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(String value) {
            addCriterion("editTime <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLike(String value) {
            addCriterion("editTime like", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotLike(String value) {
            addCriterion("editTime not like", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<String> values) {
            addCriterion("editTime in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<String> values) {
            addCriterion("editTime not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(String value1, String value2) {
            addCriterion("editTime between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(String value1, String value2) {
            addCriterion("editTime not between", value1, value2, "editTime");
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