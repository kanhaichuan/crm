package com.example.crm.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andDeptIdIsNull() {
            addCriterion("deptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("deptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("deptId =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("deptId <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("deptId >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("deptId >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("deptId <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("deptId <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("deptId like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("deptId not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("deptId in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("deptId not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("deptId between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("deptId not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andLoginActIsNull() {
            addCriterion("loginAct is null");
            return (Criteria) this;
        }

        public Criteria andLoginActIsNotNull() {
            addCriterion("loginAct is not null");
            return (Criteria) this;
        }

        public Criteria andLoginActEqualTo(String value) {
            addCriterion("loginAct =", value, "loginAct");
            return (Criteria) this;
        }

        public Criteria andLoginActNotEqualTo(String value) {
            addCriterion("loginAct <>", value, "loginAct");
            return (Criteria) this;
        }

        public Criteria andLoginActGreaterThan(String value) {
            addCriterion("loginAct >", value, "loginAct");
            return (Criteria) this;
        }

        public Criteria andLoginActGreaterThanOrEqualTo(String value) {
            addCriterion("loginAct >=", value, "loginAct");
            return (Criteria) this;
        }

        public Criteria andLoginActLessThan(String value) {
            addCriterion("loginAct <", value, "loginAct");
            return (Criteria) this;
        }

        public Criteria andLoginActLessThanOrEqualTo(String value) {
            addCriterion("loginAct <=", value, "loginAct");
            return (Criteria) this;
        }

        public Criteria andLoginActLike(String value) {
            addCriterion("loginAct like", value, "loginAct");
            return (Criteria) this;
        }

        public Criteria andLoginActNotLike(String value) {
            addCriterion("loginAct not like", value, "loginAct");
            return (Criteria) this;
        }

        public Criteria andLoginActIn(List<String> values) {
            addCriterion("loginAct in", values, "loginAct");
            return (Criteria) this;
        }

        public Criteria andLoginActNotIn(List<String> values) {
            addCriterion("loginAct not in", values, "loginAct");
            return (Criteria) this;
        }

        public Criteria andLoginActBetween(String value1, String value2) {
            addCriterion("loginAct between", value1, value2, "loginAct");
            return (Criteria) this;
        }

        public Criteria andLoginActNotBetween(String value1, String value2) {
            addCriterion("loginAct not between", value1, value2, "loginAct");
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

        public Criteria andLoginPwdIsNull() {
            addCriterion("loginPwd is null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNotNull() {
            addCriterion("loginPwd is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdEqualTo(String value) {
            addCriterion("loginPwd =", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotEqualTo(String value) {
            addCriterion("loginPwd <>", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThan(String value) {
            addCriterion("loginPwd >", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThanOrEqualTo(String value) {
            addCriterion("loginPwd >=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThan(String value) {
            addCriterion("loginPwd <", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThanOrEqualTo(String value) {
            addCriterion("loginPwd <=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLike(String value) {
            addCriterion("loginPwd like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotLike(String value) {
            addCriterion("loginPwd not like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIn(List<String> values) {
            addCriterion("loginPwd in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotIn(List<String> values) {
            addCriterion("loginPwd not in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdBetween(String value1, String value2) {
            addCriterion("loginPwd between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotBetween(String value1, String value2) {
            addCriterion("loginPwd not between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expireTime is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expireTime is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(String value) {
            addCriterion("expireTime =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(String value) {
            addCriterion("expireTime <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(String value) {
            addCriterion("expireTime >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(String value) {
            addCriterion("expireTime >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(String value) {
            addCriterion("expireTime <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(String value) {
            addCriterion("expireTime <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLike(String value) {
            addCriterion("expireTime like", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotLike(String value) {
            addCriterion("expireTime not like", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<String> values) {
            addCriterion("expireTime in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<String> values) {
            addCriterion("expireTime not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(String value1, String value2) {
            addCriterion("expireTime between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(String value1, String value2) {
            addCriterion("expireTime not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNull() {
            addCriterion("lockStatus is null");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNotNull() {
            addCriterion("lockStatus is not null");
            return (Criteria) this;
        }

        public Criteria andLockStatusEqualTo(String value) {
            addCriterion("lockStatus =", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotEqualTo(String value) {
            addCriterion("lockStatus <>", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThan(String value) {
            addCriterion("lockStatus >", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThanOrEqualTo(String value) {
            addCriterion("lockStatus >=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThan(String value) {
            addCriterion("lockStatus <", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThanOrEqualTo(String value) {
            addCriterion("lockStatus <=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLike(String value) {
            addCriterion("lockStatus like", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotLike(String value) {
            addCriterion("lockStatus not like", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusIn(List<String> values) {
            addCriterion("lockStatus in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotIn(List<String> values) {
            addCriterion("lockStatus not in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusBetween(String value1, String value2) {
            addCriterion("lockStatus between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotBetween(String value1, String value2) {
            addCriterion("lockStatus not between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andAllowIpsIsNull() {
            addCriterion("allowIps is null");
            return (Criteria) this;
        }

        public Criteria andAllowIpsIsNotNull() {
            addCriterion("allowIps is not null");
            return (Criteria) this;
        }

        public Criteria andAllowIpsEqualTo(String value) {
            addCriterion("allowIps =", value, "allowIps");
            return (Criteria) this;
        }

        public Criteria andAllowIpsNotEqualTo(String value) {
            addCriterion("allowIps <>", value, "allowIps");
            return (Criteria) this;
        }

        public Criteria andAllowIpsGreaterThan(String value) {
            addCriterion("allowIps >", value, "allowIps");
            return (Criteria) this;
        }

        public Criteria andAllowIpsGreaterThanOrEqualTo(String value) {
            addCriterion("allowIps >=", value, "allowIps");
            return (Criteria) this;
        }

        public Criteria andAllowIpsLessThan(String value) {
            addCriterion("allowIps <", value, "allowIps");
            return (Criteria) this;
        }

        public Criteria andAllowIpsLessThanOrEqualTo(String value) {
            addCriterion("allowIps <=", value, "allowIps");
            return (Criteria) this;
        }

        public Criteria andAllowIpsLike(String value) {
            addCriterion("allowIps like", value, "allowIps");
            return (Criteria) this;
        }

        public Criteria andAllowIpsNotLike(String value) {
            addCriterion("allowIps not like", value, "allowIps");
            return (Criteria) this;
        }

        public Criteria andAllowIpsIn(List<String> values) {
            addCriterion("allowIps in", values, "allowIps");
            return (Criteria) this;
        }

        public Criteria andAllowIpsNotIn(List<String> values) {
            addCriterion("allowIps not in", values, "allowIps");
            return (Criteria) this;
        }

        public Criteria andAllowIpsBetween(String value1, String value2) {
            addCriterion("allowIps between", value1, value2, "allowIps");
            return (Criteria) this;
        }

        public Criteria andAllowIpsNotBetween(String value1, String value2) {
            addCriterion("allowIps not between", value1, value2, "allowIps");
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