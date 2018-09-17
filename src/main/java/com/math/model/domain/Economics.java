package com.math.model.domain;

import javax.persistence.*;

@Entity
public class Economics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long eventId;

    Integer region;
    boolean crit1;
    boolean crit2;
    boolean crit3;
    Integer doubtterr;
    boolean success;
    boolean suicide;

    Integer attackType;
    Integer targetType;
    Integer weaponType;
    Integer property;
    Integer propextent;

    public Economics() {
    }

    public Economics(Integer region, boolean crit1, boolean crit2, boolean crit3, Integer doubtterr, boolean success
            , boolean suicide, Integer attackType, Integer targetType, Integer weaponType, Integer property
            , Integer propextent) {
        this.region = region;
        this.crit1 = crit1;
        this.crit2 = crit2;
        this.crit3 = crit3;
        this.doubtterr = doubtterr;
        this.success = success;
        this.suicide = suicide;
        this.attackType = attackType;
        this.targetType = targetType;
        this.weaponType = weaponType;
        this.property = property;
        this.propextent = propextent;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public boolean isCrit1() {
        return crit1;
    }

    public void setCrit1(boolean crit1) {
        this.crit1 = crit1;
    }

    public boolean isCrit2() {
        return crit2;
    }

    public void setCrit2(boolean crit2) {
        this.crit2 = crit2;
    }

    public boolean isCrit3() {
        return crit3;
    }

    public void setCrit3(boolean crit3) {
        this.crit3 = crit3;
    }

    public Integer getDoubtterr() {
        return doubtterr;
    }

    public void setDoubtterr(Integer doubtterr) {
        this.doubtterr = doubtterr;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuicide() {
        return suicide;
    }

    public void setSuicide(boolean suicide) {
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

    public Integer getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(Integer weaponType) {
        this.weaponType = weaponType;
    }

    public Integer getProperty() {
        return property;
    }

    public void setProperty(Integer property) {
        this.property = property;
    }

    public Integer getPropextent() {
        return propextent;
    }

    public void setPropextent(Integer propextent) {
        this.propextent = propextent;
    }
}
