package com.example.crm.model;

import java.util.ArrayList;
import java.util.List;

public class TransactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionExample() {
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

        public Criteria andAmountOfMoneyIsNull() {
            addCriterion("amountOfMoney is null");
            return (Criteria) this;
        }

        public Criteria andAmountOfMoneyIsNotNull() {
            addCriterion("amountOfMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAmountOfMoneyEqualTo(Long value) {
            addCriterion("amountOfMoney =", value, "amountOfMoney");
            return (Criteria) this;
        }

        public Criteria andAmountOfMoneyNotEqualTo(Long value) {
            addCriterion("amountOfMoney <>", value, "amountOfMoney");
            return (Criteria) this;
        }

        public Criteria andAmountOfMoneyGreaterThan(Long value) {
            addCriterion("amountOfMoney >", value, "amountOfMoney");
            return (Criteria) this;
        }

        public Criteria andAmountOfMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("amountOfMoney >=", value, "amountOfMoney");
            return (Criteria) this;
        }

        public Criteria andAmountOfMoneyLessThan(Long value) {
            addCriterion("amountOfMoney <", value, "amountOfMoney");
            return (Criteria) this;
        }

        public Criteria andAmountOfMoneyLessThanOrEqualTo(Long value) {
            addCriterion("amountOfMoney <=", value, "amountOfMoney");
            return (Criteria) this;
        }

        public Criteria andAmountOfMoneyIn(List<Long> values) {
            addCriterion("amountOfMoney in", values, "amountOfMoney");
            return (Criteria) this;
        }

        public Criteria andAmountOfMoneyNotIn(List<Long> values) {
            addCriterion("amountOfMoney not in", values, "amountOfMoney");
            return (Criteria) this;
        }

        public Criteria andAmountOfMoneyBetween(Long value1, Long value2) {
            addCriterion("amountOfMoney between", value1, value2, "amountOfMoney");
            return (Criteria) this;
        }

        public Criteria andAmountOfMoneyNotBetween(Long value1, Long value2) {
            addCriterion("amountOfMoney not between", value1, value2, "amountOfMoney");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateIsNull() {
            addCriterion("expectedClosingDate is null");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateIsNotNull() {
            addCriterion("expectedClosingDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateEqualTo(String value) {
            addCriterion("expectedClosingDate =", value, "expectedClosingDate");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateNotEqualTo(String value) {
            addCriterion("expectedClosingDate <>", value, "expectedClosingDate");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateGreaterThan(String value) {
            addCriterion("expectedClosingDate >", value, "expectedClosingDate");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateGreaterThanOrEqualTo(String value) {
            addCriterion("expectedClosingDate >=", value, "expectedClosingDate");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateLessThan(String value) {
            addCriterion("expectedClosingDate <", value, "expectedClosingDate");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateLessThanOrEqualTo(String value) {
            addCriterion("expectedClosingDate <=", value, "expectedClosingDate");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateLike(String value) {
            addCriterion("expectedClosingDate like", value, "expectedClosingDate");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateNotLike(String value) {
            addCriterion("expectedClosingDate not like", value, "expectedClosingDate");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateIn(List<String> values) {
            addCriterion("expectedClosingDate in", values, "expectedClosingDate");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateNotIn(List<String> values) {
            addCriterion("expectedClosingDate not in", values, "expectedClosingDate");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateBetween(String value1, String value2) {
            addCriterion("expectedClosingDate between", value1, value2, "expectedClosingDate");
            return (Criteria) this;
        }

        public Criteria andExpectedClosingDateNotBetween(String value1, String value2) {
            addCriterion("expectedClosingDate not between", value1, value2, "expectedClosingDate");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customerId =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customerId <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customerId >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customerId >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customerId <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customerId <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customerId like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customerId not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customerId in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customerId not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customerId between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customerId not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andStageIsNull() {
            addCriterion("stage is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("stage is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(String value) {
            addCriterion("stage =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(String value) {
            addCriterion("stage <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(String value) {
            addCriterion("stage >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(String value) {
            addCriterion("stage >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(String value) {
            addCriterion("stage <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(String value) {
            addCriterion("stage <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLike(String value) {
            addCriterion("stage like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotLike(String value) {
            addCriterion("stage not like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<String> values) {
            addCriterion("stage in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<String> values) {
            addCriterion("stage not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(String value1, String value2) {
            addCriterion("stage between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(String value1, String value2) {
            addCriterion("stage not between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPossibilityIsNull() {
            addCriterion("possibility is null");
            return (Criteria) this;
        }

        public Criteria andPossibilityIsNotNull() {
            addCriterion("possibility is not null");
            return (Criteria) this;
        }

        public Criteria andPossibilityEqualTo(Integer value) {
            addCriterion("possibility =", value, "possibility");
            return (Criteria) this;
        }

        public Criteria andPossibilityNotEqualTo(Integer value) {
            addCriterion("possibility <>", value, "possibility");
            return (Criteria) this;
        }

        public Criteria andPossibilityGreaterThan(Integer value) {
            addCriterion("possibility >", value, "possibility");
            return (Criteria) this;
        }

        public Criteria andPossibilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("possibility >=", value, "possibility");
            return (Criteria) this;
        }

        public Criteria andPossibilityLessThan(Integer value) {
            addCriterion("possibility <", value, "possibility");
            return (Criteria) this;
        }

        public Criteria andPossibilityLessThanOrEqualTo(Integer value) {
            addCriterion("possibility <=", value, "possibility");
            return (Criteria) this;
        }

        public Criteria andPossibilityIn(List<Integer> values) {
            addCriterion("possibility in", values, "possibility");
            return (Criteria) this;
        }

        public Criteria andPossibilityNotIn(List<Integer> values) {
            addCriterion("possibility not in", values, "possibility");
            return (Criteria) this;
        }

        public Criteria andPossibilityBetween(Integer value1, Integer value2) {
            addCriterion("possibility between", value1, value2, "possibility");
            return (Criteria) this;
        }

        public Criteria andPossibilityNotBetween(Integer value1, Integer value2) {
            addCriterion("possibility not between", value1, value2, "possibility");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activityId is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activityId is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(String value) {
            addCriterion("activityId =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(String value) {
            addCriterion("activityId <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(String value) {
            addCriterion("activityId >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("activityId >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(String value) {
            addCriterion("activityId <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(String value) {
            addCriterion("activityId <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLike(String value) {
            addCriterion("activityId like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotLike(String value) {
            addCriterion("activityId not like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<String> values) {
            addCriterion("activityId in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<String> values) {
            addCriterion("activityId not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(String value1, String value2) {
            addCriterion("activityId between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(String value1, String value2) {
            addCriterion("activityId not between", value1, value2, "activityId");
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

        public Criteria andContactSummaryIsNull() {
            addCriterion("contactSummary is null");
            return (Criteria) this;
        }

        public Criteria andContactSummaryIsNotNull() {
            addCriterion("contactSummary is not null");
            return (Criteria) this;
        }

        public Criteria andContactSummaryEqualTo(String value) {
            addCriterion("contactSummary =", value, "contactSummary");
            return (Criteria) this;
        }

        public Criteria andContactSummaryNotEqualTo(String value) {
            addCriterion("contactSummary <>", value, "contactSummary");
            return (Criteria) this;
        }

        public Criteria andContactSummaryGreaterThan(String value) {
            addCriterion("contactSummary >", value, "contactSummary");
            return (Criteria) this;
        }

        public Criteria andContactSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("contactSummary >=", value, "contactSummary");
            return (Criteria) this;
        }

        public Criteria andContactSummaryLessThan(String value) {
            addCriterion("contactSummary <", value, "contactSummary");
            return (Criteria) this;
        }

        public Criteria andContactSummaryLessThanOrEqualTo(String value) {
            addCriterion("contactSummary <=", value, "contactSummary");
            return (Criteria) this;
        }

        public Criteria andContactSummaryLike(String value) {
            addCriterion("contactSummary like", value, "contactSummary");
            return (Criteria) this;
        }

        public Criteria andContactSummaryNotLike(String value) {
            addCriterion("contactSummary not like", value, "contactSummary");
            return (Criteria) this;
        }

        public Criteria andContactSummaryIn(List<String> values) {
            addCriterion("contactSummary in", values, "contactSummary");
            return (Criteria) this;
        }

        public Criteria andContactSummaryNotIn(List<String> values) {
            addCriterion("contactSummary not in", values, "contactSummary");
            return (Criteria) this;
        }

        public Criteria andContactSummaryBetween(String value1, String value2) {
            addCriterion("contactSummary between", value1, value2, "contactSummary");
            return (Criteria) this;
        }

        public Criteria andContactSummaryNotBetween(String value1, String value2) {
            addCriterion("contactSummary not between", value1, value2, "contactSummary");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeIsNull() {
            addCriterion("nextContactTime is null");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeIsNotNull() {
            addCriterion("nextContactTime is not null");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeEqualTo(String value) {
            addCriterion("nextContactTime =", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeNotEqualTo(String value) {
            addCriterion("nextContactTime <>", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeGreaterThan(String value) {
            addCriterion("nextContactTime >", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeGreaterThanOrEqualTo(String value) {
            addCriterion("nextContactTime >=", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeLessThan(String value) {
            addCriterion("nextContactTime <", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeLessThanOrEqualTo(String value) {
            addCriterion("nextContactTime <=", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeLike(String value) {
            addCriterion("nextContactTime like", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeNotLike(String value) {
            addCriterion("nextContactTime not like", value, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeIn(List<String> values) {
            addCriterion("nextContactTime in", values, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeNotIn(List<String> values) {
            addCriterion("nextContactTime not in", values, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeBetween(String value1, String value2) {
            addCriterion("nextContactTime between", value1, value2, "nextContactTime");
            return (Criteria) this;
        }

        public Criteria andNextContactTimeNotBetween(String value1, String value2) {
            addCriterion("nextContactTime not between", value1, value2, "nextContactTime");
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