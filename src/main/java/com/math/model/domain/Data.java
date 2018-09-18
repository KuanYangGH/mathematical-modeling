package com.math.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Data {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long eventId;

    Integer iyear;
    Integer imonth;
    Integer iday;

    Integer country;
    Integer region;
    Integer specificity;
    Boolean vicinity;
    Boolean crit1;
    Boolean crit2;
    Boolean crit3;
    Boolean doubtterr;
    Boolean multiple;
    Boolean success;
    Boolean suicide;

    Integer attackType;
    Integer targetType;
    Integer natlty;
    String gname;
    Integer weaponType;
    Integer nkill;
    Integer nkillus;
    Integer nkillter;
    Integer nwound;
    Integer nwoundus;
    Integer nwoundte;
    Boolean property;
    Integer propextent;

    public Data() {
    }

    public Data(Integer iyear, Integer imonth, Integer iday, Integer country, Integer region
            , Integer specificity, Boolean vicinity, Boolean crit1, Boolean crit2, Boolean crit3
            , Boolean doubtterr, Boolean multiple, Boolean success, Boolean suicide, Integer attackType
            , Integer targetType, Integer natlty, String gname, Integer weaponType, Integer nkill
            , Integer nkillus, Integer nkillter, Integer nwound, Integer nwoundus, Integer nwoundte
            , Boolean property, Integer propextent) {
        this.iyear = iyear;
        this.imonth = imonth;
        this.iday = iday;
        this.country = country;
        this.region = region;
        this.specificity = specificity;
        this.vicinity = vicinity;
        this.crit1 = crit1;
        this.crit2 = crit2;
        this.crit3 = crit3;
        this.doubtterr = doubtterr;
        this.multiple = multiple;
        this.success = success;
        this.suicide = suicide;
        this.attackType = attackType;
        this.targetType = targetType;
        this.natlty = natlty;
        this.gname = gname;
        this.weaponType = weaponType;
        this.nkill = nkill;
        this.nkillus = nkillus;
        this.nkillter = nkillter;
        this.nwound = nwound;
        this.nwoundus = nwoundus;
        this.nwoundte = nwoundte;
        this.property = property;
        this.propextent = propextent;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Integer getIyear() {
        return iyear;
    }

    public void setIyear(Integer iyear) {
        this.iyear = iyear;
    }

    public Integer getImonth() {
        return imonth;
    }

    public void setImonth(Integer imonth) {
        this.imonth = imonth;
    }

    public Integer getIday() {
        return iday;
    }

    public void setIday(Integer iday) {
        this.iday = iday;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public Integer getSpecificity() {
        return specificity;
    }

    public void setSpecificity(Integer specificity) {
        this.specificity = specificity;
    }

    public Boolean getVicinity() {
        return vicinity;
    }

    public void setVicinity(Boolean vicinity) {
        this.vicinity = vicinity;
    }

    public Boolean getCrit1() {
        return crit1;
    }

    public void setCrit1(Boolean crit1) {
        this.crit1 = crit1;
    }

    public Boolean getCrit2() {
        return crit2;
    }

    public void setCrit2(Boolean crit2) {
        this.crit2 = crit2;
    }

    public Boolean getCrit3() {
        return crit3;
    }

    public void setCrit3(Boolean crit3) {
        this.crit3 = crit3;
    }

    public Boolean getDoubtterr() {
        return doubtterr;
    }

    public void setDoubtterr(Boolean doubtterr) {
        this.doubtterr = doubtterr;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuicide() {
        return suicide;
    }

    public void setSuicide(Boolean suicide) {
        this.suicide = suicide;
    }

    public Integer getAttackType() {
        return attackType;
    }

    public void setAttackType(Integer attackType) {
        this.attackType = attackType;
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public Integer getNatlty() {
        return natlty;
    }

    public void setNatlty(Integer natlty) {
        this.natlty = natlty;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Integer getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(Integer weaponType) {
        this.weaponType = weaponType;
    }

    public Integer getNkill() {
        return nkill;
    }

    public void setNkill(Integer nkill) {
        this.nkill = nkill;
    }

    public Integer getNkillus() {
        return nkillus;
    }

    public void setNkillus(Integer nkillus) {
        this.nkillus = nkillus;
    }

    public Integer getNkillter() {
        return nkillter;
    }

    public void setNkillter(Integer nkillter) {
        this.nkillter = nkillter;
    }

    public Integer getNwound() {
        return nwound;
    }

    public void setNwound(Integer nwound) {
        this.nwound = nwound;
    }

    public Integer getNwoundus() {
        return nwoundus;
    }

    public void setNwoundus(Integer nwoundus) {
        this.nwoundus = nwoundus;
    }

    public Integer getNwoundte() {
        return nwoundte;
    }

    public void setNwoundte(Integer nwoundte) {
        this.nwoundte = nwoundte;
    }

    public Boolean getProperty() {
        return property;
    }

    public void setProperty(Boolean property) {
        this.property = property;
    }

    public Integer getPropextent() {
        return propextent;
    }

    public void setPropextent(Integer propextent) {
        this.propextent = propextent;
    }
}
