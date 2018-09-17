package com.math.model.domain;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filtered {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long eventId;

    Integer iyear;
    Integer imonth;
    Integer iday;

    Boolean extended;
    Integer country;
    Integer region;
    Integer specificity;
    Boolean vicinity;
    Boolean crit1;
    Boolean crit2;
    Boolean crit3;
    Boolean success;
    Boolean suicide;

    Integer attackType;
    Integer targetType;
    Boolean claimed;
    Integer weaponType;
    Integer nkill;
    Integer propextent;
    Boolean ishostkid;


    public Filtered() {
    }

    public Filtered(Integer iyear, Integer imonth, Integer iday, Boolean extended, Integer country, Integer region
            , Integer specificity, Boolean vicinity, Boolean crit1, Boolean crit2, Boolean crit3, Boolean success
            , Boolean suicide, Integer attackType, Integer targetType, Boolean claimed, Integer weaponType
            , Integer nkill, Integer propextent, Boolean ishostkid) {
        this.iyear = iyear;
        this.imonth = imonth;
        this.iday = iday;
        this.extended = extended;
        this.country = country;
        this.region = region;
        this.specificity = specificity;
        this.vicinity = vicinity;
        this.crit1 = crit1;
        this.crit2 = crit2;
        this.crit3 = crit3;
        this.success = success;
        this.suicide = suicide;
        this.attackType = attackType;
        this.targetType = targetType;
        this.claimed = claimed;
        this.weaponType = weaponType;
        this.nkill = nkill;
        this.propextent = propextent;
        this.ishostkid = ishostkid;
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

    public Boolean getExtended() {
        return extended;
    }

    public void setExtended(Boolean extended) {
        this.extended = extended;
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

    public Boolean getClaimed() {
        return claimed;
    }

    public void setClaimed(Boolean claimed) {
        this.claimed = claimed;
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

    public Integer getPropextent() {
        return propextent;
    }

    public void setPropextent(Integer propextent) {
        this.propextent = propextent;
    }


    public Boolean getIshostkid() {
        return ishostkid;
    }

    public void setIshostkid(Boolean ishostkid) {
        this.ishostkid = ishostkid;
    }
}
