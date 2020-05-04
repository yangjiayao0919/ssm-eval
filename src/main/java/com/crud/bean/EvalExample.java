package com.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class EvalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvalExample() {
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

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andSpaceNumIsNull() {
            addCriterion("space_num is null");
            return (Criteria) this;
        }

        public Criteria andSpaceNumIsNotNull() {
            addCriterion("space_num is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceNumEqualTo(Integer value) {
            addCriterion("space_num =", value, "spaceNum");
            return (Criteria) this;
        }

        public Criteria andSpaceNumNotEqualTo(Integer value) {
            addCriterion("space_num <>", value, "spaceNum");
            return (Criteria) this;
        }

        public Criteria andSpaceNumGreaterThan(Integer value) {
            addCriterion("space_num >", value, "spaceNum");
            return (Criteria) this;
        }

        public Criteria andSpaceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("space_num >=", value, "spaceNum");
            return (Criteria) this;
        }

        public Criteria andSpaceNumLessThan(Integer value) {
            addCriterion("space_num <", value, "spaceNum");
            return (Criteria) this;
        }

        public Criteria andSpaceNumLessThanOrEqualTo(Integer value) {
            addCriterion("space_num <=", value, "spaceNum");
            return (Criteria) this;
        }

        public Criteria andSpaceNumIn(List<Integer> values) {
            addCriterion("space_num in", values, "spaceNum");
            return (Criteria) this;
        }

        public Criteria andSpaceNumNotIn(List<Integer> values) {
            addCriterion("space_num not in", values, "spaceNum");
            return (Criteria) this;
        }

        public Criteria andSpaceNumBetween(Integer value1, Integer value2) {
            addCriterion("space_num between", value1, value2, "spaceNum");
            return (Criteria) this;
        }

        public Criteria andSpaceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("space_num not between", value1, value2, "spaceNum");
            return (Criteria) this;
        }

        public Criteria andGdpIsNull() {
            addCriterion("GDP is null");
            return (Criteria) this;
        }

        public Criteria andGdpIsNotNull() {
            addCriterion("GDP is not null");
            return (Criteria) this;
        }

        public Criteria andGdpEqualTo(Long value) {
            addCriterion("GDP =", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpNotEqualTo(Long value) {
            addCriterion("GDP <>", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpGreaterThan(Long value) {
            addCriterion("GDP >", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpGreaterThanOrEqualTo(Long value) {
            addCriterion("GDP >=", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpLessThan(Long value) {
            addCriterion("GDP <", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpLessThanOrEqualTo(Long value) {
            addCriterion("GDP <=", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpIn(List<Long> values) {
            addCriterion("GDP in", values, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpNotIn(List<Long> values) {
            addCriterion("GDP not in", values, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpBetween(Long value1, Long value2) {
            addCriterion("GDP between", value1, value2, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpNotBetween(Long value1, Long value2) {
            addCriterion("GDP not between", value1, value2, "gdp");
            return (Criteria) this;
        }

        public Criteria andCompanyNumIsNull() {
            addCriterion("company_num is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNumIsNotNull() {
            addCriterion("company_num is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNumEqualTo(Integer value) {
            addCriterion("company_num =", value, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumNotEqualTo(Integer value) {
            addCriterion("company_num <>", value, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumGreaterThan(Integer value) {
            addCriterion("company_num >", value, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_num >=", value, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumLessThan(Integer value) {
            addCriterion("company_num <", value, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumLessThanOrEqualTo(Integer value) {
            addCriterion("company_num <=", value, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumIn(List<Integer> values) {
            addCriterion("company_num in", values, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumNotIn(List<Integer> values) {
            addCriterion("company_num not in", values, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumBetween(Integer value1, Integer value2) {
            addCriterion("company_num between", value1, value2, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("company_num not between", value1, value2, "companyNum");
            return (Criteria) this;
        }

        public Criteria andSuperCompanyNumIsNull() {
            addCriterion("super_company_num is null");
            return (Criteria) this;
        }

        public Criteria andSuperCompanyNumIsNotNull() {
            addCriterion("super_company_num is not null");
            return (Criteria) this;
        }

        public Criteria andSuperCompanyNumEqualTo(Integer value) {
            addCriterion("super_company_num =", value, "superCompanyNum");
            return (Criteria) this;
        }

        public Criteria andSuperCompanyNumNotEqualTo(Integer value) {
            addCriterion("super_company_num <>", value, "superCompanyNum");
            return (Criteria) this;
        }

        public Criteria andSuperCompanyNumGreaterThan(Integer value) {
            addCriterion("super_company_num >", value, "superCompanyNum");
            return (Criteria) this;
        }

        public Criteria andSuperCompanyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("super_company_num >=", value, "superCompanyNum");
            return (Criteria) this;
        }

        public Criteria andSuperCompanyNumLessThan(Integer value) {
            addCriterion("super_company_num <", value, "superCompanyNum");
            return (Criteria) this;
        }

        public Criteria andSuperCompanyNumLessThanOrEqualTo(Integer value) {
            addCriterion("super_company_num <=", value, "superCompanyNum");
            return (Criteria) this;
        }

        public Criteria andSuperCompanyNumIn(List<Integer> values) {
            addCriterion("super_company_num in", values, "superCompanyNum");
            return (Criteria) this;
        }

        public Criteria andSuperCompanyNumNotIn(List<Integer> values) {
            addCriterion("super_company_num not in", values, "superCompanyNum");
            return (Criteria) this;
        }

        public Criteria andSuperCompanyNumBetween(Integer value1, Integer value2) {
            addCriterion("super_company_num between", value1, value2, "superCompanyNum");
            return (Criteria) this;
        }

        public Criteria andSuperCompanyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("super_company_num not between", value1, value2, "superCompanyNum");
            return (Criteria) this;
        }

        public Criteria andSchoolNumIsNull() {
            addCriterion("school_num is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNumIsNotNull() {
            addCriterion("school_num is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNumEqualTo(Integer value) {
            addCriterion("school_num =", value, "schoolNum");
            return (Criteria) this;
        }

        public Criteria andSchoolNumNotEqualTo(Integer value) {
            addCriterion("school_num <>", value, "schoolNum");
            return (Criteria) this;
        }

        public Criteria andSchoolNumGreaterThan(Integer value) {
            addCriterion("school_num >", value, "schoolNum");
            return (Criteria) this;
        }

        public Criteria andSchoolNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_num >=", value, "schoolNum");
            return (Criteria) this;
        }

        public Criteria andSchoolNumLessThan(Integer value) {
            addCriterion("school_num <", value, "schoolNum");
            return (Criteria) this;
        }

        public Criteria andSchoolNumLessThanOrEqualTo(Integer value) {
            addCriterion("school_num <=", value, "schoolNum");
            return (Criteria) this;
        }

        public Criteria andSchoolNumIn(List<Integer> values) {
            addCriterion("school_num in", values, "schoolNum");
            return (Criteria) this;
        }

        public Criteria andSchoolNumNotIn(List<Integer> values) {
            addCriterion("school_num not in", values, "schoolNum");
            return (Criteria) this;
        }

        public Criteria andSchoolNumBetween(Integer value1, Integer value2) {
            addCriterion("school_num between", value1, value2, "schoolNum");
            return (Criteria) this;
        }

        public Criteria andSchoolNumNotBetween(Integer value1, Integer value2) {
            addCriterion("school_num not between", value1, value2, "schoolNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNull() {
            addCriterion("people_num is null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNotNull() {
            addCriterion("people_num is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumEqualTo(Integer value) {
            addCriterion("people_num =", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotEqualTo(Integer value) {
            addCriterion("people_num <>", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThan(Integer value) {
            addCriterion("people_num >", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("people_num >=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThan(Integer value) {
            addCriterion("people_num <", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThanOrEqualTo(Integer value) {
            addCriterion("people_num <=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIn(List<Integer> values) {
            addCriterion("people_num in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotIn(List<Integer> values) {
            addCriterion("people_num not in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumBetween(Integer value1, Integer value2) {
            addCriterion("people_num between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("people_num not between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andSupportIsNull() {
            addCriterion("support is null");
            return (Criteria) this;
        }

        public Criteria andSupportIsNotNull() {
            addCriterion("support is not null");
            return (Criteria) this;
        }

        public Criteria andSupportEqualTo(Integer value) {
            addCriterion("support =", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotEqualTo(Integer value) {
            addCriterion("support <>", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportGreaterThan(Integer value) {
            addCriterion("support >", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportGreaterThanOrEqualTo(Integer value) {
            addCriterion("support >=", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportLessThan(Integer value) {
            addCriterion("support <", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportLessThanOrEqualTo(Integer value) {
            addCriterion("support <=", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportIn(List<Integer> values) {
            addCriterion("support in", values, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotIn(List<Integer> values) {
            addCriterion("support not in", values, "support");
            return (Criteria) this;
        }

        public Criteria andSupportBetween(Integer value1, Integer value2) {
            addCriterion("support between", value1, value2, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotBetween(Integer value1, Integer value2) {
            addCriterion("support not between", value1, value2, "support");
            return (Criteria) this;
        }

        public Criteria andFeverIsNull() {
            addCriterion("fever is null");
            return (Criteria) this;
        }

        public Criteria andFeverIsNotNull() {
            addCriterion("fever is not null");
            return (Criteria) this;
        }

        public Criteria andFeverEqualTo(Integer value) {
            addCriterion("fever =", value, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverNotEqualTo(Integer value) {
            addCriterion("fever <>", value, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverGreaterThan(Integer value) {
            addCriterion("fever >", value, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverGreaterThanOrEqualTo(Integer value) {
            addCriterion("fever >=", value, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverLessThan(Integer value) {
            addCriterion("fever <", value, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverLessThanOrEqualTo(Integer value) {
            addCriterion("fever <=", value, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverIn(List<Integer> values) {
            addCriterion("fever in", values, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverNotIn(List<Integer> values) {
            addCriterion("fever not in", values, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverBetween(Integer value1, Integer value2) {
            addCriterion("fever between", value1, value2, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverNotBetween(Integer value1, Integer value2) {
            addCriterion("fever not between", value1, value2, "fever");
            return (Criteria) this;
        }

        public Criteria andFacilitiesIsNull() {
            addCriterion("facilities is null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesIsNotNull() {
            addCriterion("facilities is not null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesEqualTo(Integer value) {
            addCriterion("facilities =", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNotEqualTo(Integer value) {
            addCriterion("facilities <>", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesGreaterThan(Integer value) {
            addCriterion("facilities >", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesGreaterThanOrEqualTo(Integer value) {
            addCriterion("facilities >=", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesLessThan(Integer value) {
            addCriterion("facilities <", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesLessThanOrEqualTo(Integer value) {
            addCriterion("facilities <=", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesIn(List<Integer> values) {
            addCriterion("facilities in", values, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNotIn(List<Integer> values) {
            addCriterion("facilities not in", values, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesBetween(Integer value1, Integer value2) {
            addCriterion("facilities between", value1, value2, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNotBetween(Integer value1, Integer value2) {
            addCriterion("facilities not between", value1, value2, "facilities");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
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