package com.example.crm.model;

import java.util.ArrayList;
import java.util.List;

public class TaskRemarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskRemarkExample() {
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

        public Criteria andNotePersonIsNull() {
            addCriterion("notePerson is null");
            return (Criteria) this;
        }

        public Criteria andNotePersonIsNotNull() {
            addCriterion("notePerson is not null");
            return (Criteria) this;
        }

        public Criteria andNotePersonEqualTo(String value) {
            addCriterion("notePerson =", value, "notePerson");
            return (Criteria) this;
        }

        public Criteria andNotePersonNotEqualTo(String value) {
            addCriterion("notePerson <>", value, "notePerson");
            return (Criteria) this;
        }

        public Criteria andNotePersonGreaterThan(String value) {
            addCriterion("notePerson >", value, "notePerson");
            return (Criteria) this;
        }

        public Criteria andNotePersonGreaterThanOrEqualTo(String value) {
            addCriterion("notePerson >=", value, "notePerson");
            return (Criteria) this;
        }

        public Criteria andNotePersonLessThan(String value) {
            addCriterion("notePerson <", value, "notePerson");
            return (Criteria) this;
        }

        public Criteria andNotePersonLessThanOrEqualTo(String value) {
            addCriterion("notePerson <=", value, "notePerson");
            return (Criteria) this;
        }

        public Criteria andNotePersonLike(String value) {
            addCriterion("notePerson like", value, "notePerson");
            return (Criteria) this;
        }

        public Criteria andNotePersonNotLike(String value) {
            addCriterion("notePerson not like", value, "notePerson");
            return (Criteria) this;
        }

        public Criteria andNotePersonIn(List<String> values) {
            addCriterion("notePerson in", values, "notePerson");
            return (Criteria) this;
        }

        public Criteria andNotePersonNotIn(List<String> values) {
            addCriterion("notePerson not in", values, "notePerson");
            return (Criteria) this;
        }

        public Criteria andNotePersonBetween(String value1, String value2) {
            addCriterion("notePerson between", value1, value2, "notePerson");
            return (Criteria) this;
        }

        public Criteria andNotePersonNotBetween(String value1, String value2) {
            addCriterion("notePerson not between", value1, value2, "notePerson");
            return (Criteria) this;
        }

        public Criteria andNoteContentIsNull() {
            addCriterion("noteContent is null");
            return (Criteria) this;
        }

        public Criteria andNoteContentIsNotNull() {
            addCriterion("noteContent is not null");
            return (Criteria) this;
        }

        public Criteria andNoteContentEqualTo(String value) {
            addCriterion("noteContent =", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentNotEqualTo(String value) {
            addCriterion("noteContent <>", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentGreaterThan(String value) {
            addCriterion("noteContent >", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentGreaterThanOrEqualTo(String value) {
            addCriterion("noteContent >=", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentLessThan(String value) {
            addCriterion("noteContent <", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentLessThanOrEqualTo(String value) {
            addCriterion("noteContent <=", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentLike(String value) {
            addCriterion("noteContent like", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentNotLike(String value) {
            addCriterion("noteContent not like", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentIn(List<String> values) {
            addCriterion("noteContent in", values, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentNotIn(List<String> values) {
            addCriterion("noteContent not in", values, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentBetween(String value1, String value2) {
            addCriterion("noteContent between", value1, value2, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentNotBetween(String value1, String value2) {
            addCriterion("noteContent not between", value1, value2, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteTimeIsNull() {
            addCriterion("noteTime is null");
            return (Criteria) this;
        }

        public Criteria andNoteTimeIsNotNull() {
            addCriterion("noteTime is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTimeEqualTo(String value) {
            addCriterion("noteTime =", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotEqualTo(String value) {
            addCriterion("noteTime <>", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeGreaterThan(String value) {
            addCriterion("noteTime >", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("noteTime >=", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeLessThan(String value) {
            addCriterion("noteTime <", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeLessThanOrEqualTo(String value) {
            addCriterion("noteTime <=", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeLike(String value) {
            addCriterion("noteTime like", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotLike(String value) {
            addCriterion("noteTime not like", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeIn(List<String> values) {
            addCriterion("noteTime in", values, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotIn(List<String> values) {
            addCriterion("noteTime not in", values, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeBetween(String value1, String value2) {
            addCriterion("noteTime between", value1, value2, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotBetween(String value1, String value2) {
            addCriterion("noteTime not between", value1, value2, "noteTime");
            return (Criteria) this;
        }

        public Criteria andEditPersonIsNull() {
            addCriterion("editPerson is null");
            return (Criteria) this;
        }

        public Criteria andEditPersonIsNotNull() {
            addCriterion("editPerson is not null");
            return (Criteria) this;
        }

        public Criteria andEditPersonEqualTo(String value) {
            addCriterion("editPerson =", value, "editPerson");
            return (Criteria) this;
        }

        public Criteria andEditPersonNotEqualTo(String value) {
            addCriterion("editPerson <>", value, "editPerson");
            return (Criteria) this;
        }

        public Criteria andEditPersonGreaterThan(String value) {
            addCriterion("editPerson >", value, "editPerson");
            return (Criteria) this;
        }

        public Criteria andEditPersonGreaterThanOrEqualTo(String value) {
            addCriterion("editPerson >=", value, "editPerson");
            return (Criteria) this;
        }

        public Criteria andEditPersonLessThan(String value) {
            addCriterion("editPerson <", value, "editPerson");
            return (Criteria) this;
        }

        public Criteria andEditPersonLessThanOrEqualTo(String value) {
            addCriterion("editPerson <=", value, "editPerson");
            return (Criteria) this;
        }

        public Criteria andEditPersonLike(String value) {
            addCriterion("editPerson like", value, "editPerson");
            return (Criteria) this;
        }

        public Criteria andEditPersonNotLike(String value) {
            addCriterion("editPerson not like", value, "editPerson");
            return (Criteria) this;
        }

        public Criteria andEditPersonIn(List<String> values) {
            addCriterion("editPerson in", values, "editPerson");
            return (Criteria) this;
        }

        public Criteria andEditPersonNotIn(List<String> values) {
            addCriterion("editPerson not in", values, "editPerson");
            return (Criteria) this;
        }

        public Criteria andEditPersonBetween(String value1, String value2) {
            addCriterion("editPerson between", value1, value2, "editPerson");
            return (Criteria) this;
        }

        public Criteria andEditPersonNotBetween(String value1, String value2) {
            addCriterion("editPerson not between", value1, value2, "editPerson");
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

        public Criteria andEditFlagIsNull() {
            addCriterion("editFlag is null");
            return (Criteria) this;
        }

        public Criteria andEditFlagIsNotNull() {
            addCriterion("editFlag is not null");
            return (Criteria) this;
        }

        public Criteria andEditFlagEqualTo(Integer value) {
            addCriterion("editFlag =", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagNotEqualTo(Integer value) {
            addCriterion("editFlag <>", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagGreaterThan(Integer value) {
            addCriterion("editFlag >", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("editFlag >=", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagLessThan(Integer value) {
            addCriterion("editFlag <", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagLessThanOrEqualTo(Integer value) {
            addCriterion("editFlag <=", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagIn(List<Integer> values) {
            addCriterion("editFlag in", values, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagNotIn(List<Integer> values) {
            addCriterion("editFlag not in", values, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagBetween(Integer value1, Integer value2) {
            addCriterion("editFlag between", value1, value2, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("editFlag not between", value1, value2, "editFlag");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("taskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("taskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("taskId =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("taskId <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("taskId >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("taskId >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("taskId <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("taskId <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("taskId like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("taskId not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("taskId in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("taskId not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("taskId between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("taskId not between", value1, value2, "taskId");
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