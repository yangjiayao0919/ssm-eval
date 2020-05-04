package com.crud.bean;

public class Eval {
    private Integer id;

    private String city;

    private Integer spaceNum;

    private Long gdp;

    private Integer companyNum;

    private Integer superCompanyNum;

    private Integer schoolNum;

    private Integer peopleNum;

    private Integer support;

    private Integer fever;

    private Integer facilities;

    private Integer area;

    private Integer score;

    public Eval() {
    }

    public Eval(Integer id, String city, Integer spaceNum, Long gdp, Integer companyNum, Integer superCompanyNum, Integer schoolNum, Integer peopleNum, Integer support, Integer fever, Integer facilities, Integer area, Integer score) {
        this.id = id;
        this.city = city;
        this.spaceNum = spaceNum;
        this.gdp = gdp;
        this.companyNum = companyNum;
        this.superCompanyNum = superCompanyNum;
        this.schoolNum = schoolNum;
        this.peopleNum = peopleNum;
        this.support = support;
        this.fever = fever;
        this.facilities = facilities;
        this.area = area;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getSpaceNum() {
        return spaceNum;
    }

    public void setSpaceNum(Integer spaceNum) {
        this.spaceNum = spaceNum;
    }

    public Long getGdp() {
        return gdp;
    }

    public void setGdp(Long gdp) {
        this.gdp = gdp;
    }

    public Integer getCompanyNum() {
        return companyNum;
    }

    public void setCompanyNum(Integer companyNum) {
        this.companyNum = companyNum;
    }

    public Integer getSuperCompanyNum() {
        return superCompanyNum;
    }

    public void setSuperCompanyNum(Integer superCompanyNum) {
        this.superCompanyNum = superCompanyNum;
    }

    public Integer getSchoolNum() {
        return schoolNum;
    }

    public void setSchoolNum(Integer schoolNum) {
        this.schoolNum = schoolNum;
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getFever() {
        return fever;
    }

    public void setFever(Integer fever) {
        this.fever = fever;
    }

    public Integer getFacilities() {
        return facilities;
    }

    public void setFacilities(Integer facilities) {
        this.facilities = facilities;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}