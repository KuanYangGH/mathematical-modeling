package com.math.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TerroristAttack {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    Long eventId;
    /**
     *攻击类型
     * attacktype1
     */
    Boolean assassination;
    Boolean armedAssault;
    Boolean bombingExplosion;
    /**
     * 4,5,6
     */
    Boolean hijacking;
    Boolean facilityInfrastructureAttack;
    Boolean unarmedAssault;
    Boolean attackUnknown;

    /**
     * 攻击成功
     */
    Boolean success;
    /**
     * 自杀式袭击
     */
    Boolean suicide;

    /**
     * 武器类型
     * weapontype1
     */


    /**
     * 1/2/3
     */
    Boolean bioChemicalRadioactiveWeapon;
    Boolean nuclear;
    Boolean firearms;
    Boolean explosives;
    Boolean fakeWeapons;
    Boolean incendiary;
    Boolean melee;
    Boolean traffic;
    Boolean sabotageEquipment;
    /**
     * 12/13
     */
    Boolean otherWeaponOrTypeUnknown;

    /**
     * 受害者类型
     * targtype1
     */
    Boolean business;
    /**
     * 2/7
     */
    Boolean government;
    Boolean police;
    Boolean military;
    Boolean abortionRelated;
    Boolean airportsAircraft;
    Boolean educationalInstitution;
    Boolean foodOrWaterSupply;
    Boolean journalistsMedia;
    /**
     * 11/12/13/17/20
     */
    Boolean targTypeOthers;
    Boolean privateCitizensAndProperty;
    Boolean religiousFiguresInstitutions;
    Boolean telecommunications;
    Boolean Tourists;
    Boolean transportation;
    Boolean utilities;


    /**
     * region
     * 地区
     */
    Boolean northAmerica;
    Boolean midAmerica;
    Boolean southAmerica;
    Boolean eastAsia;
    Boolean southeastAsia;
    Boolean southAsia;
    Boolean centralAsia;
    Boolean easternEurope;
    Boolean westernEurope;
    Boolean middleEastNorthAfrica;
    Boolean subSaharanAfrica;
    Boolean australia;

    /**
     * 入选标准
     */

    Boolean crit1;
    Boolean crit2;
    Boolean crit3;
    /**
     * 疑似恐怖主义
     */
    Boolean doubtterr;


    //result
    Boolean high;
    Boolean mid;
    Boolean low;
    Boolean noLoss;
    Boolean unknown;


    public TerroristAttack() {
    }

    public TerroristAttack(Boolean assassination, Boolean armedAssault, Boolean bombingExplosion, Boolean hijacking
            , Boolean facilityInfrastructureAttack, Boolean unarmedAssault, Boolean attackUnknown, Boolean success
            , Boolean suicide, Boolean bioChemicalRadioactiveWeapon, Boolean nuclear, Boolean firearms
            , Boolean explosives, Boolean fakeWeapons, Boolean incendiary, Boolean melee, Boolean traffic
            , Boolean sabotageEquipment, Boolean otherWeaponOrTypeUnknown, Boolean business, Boolean government
            , Boolean police, Boolean military, Boolean abortionRelated, Boolean airportsAircraft
            , Boolean educationalInstitution, Boolean foodOrWaterSupply, Boolean journalistsMedia
            , Boolean targTypeOthers, Boolean privateCitizensAndProperty, Boolean religiousFiguresInstitutions
            , Boolean telecommunications, Boolean tourists, Boolean transportation, Boolean utilities
            , Boolean northAmerica, Boolean midAmerica, Boolean southAmerica, Boolean eastAsia, Boolean southeastAsia
            , Boolean southAsia, Boolean centralAsia, Boolean easternEurope, Boolean westernEurope
            , Boolean middleEastNorthAfrica, Boolean subSaharanAfrica, Boolean australia, Boolean crit1, Boolean crit2
            , Boolean crit3, Boolean doubtterr, Boolean high, Boolean mid, Boolean low, Boolean noLoss, Boolean unknown) {
        this.assassination = assassination;
        this.armedAssault = armedAssault;
        this.bombingExplosion = bombingExplosion;
        this.hijacking = hijacking;
        this.facilityInfrastructureAttack = facilityInfrastructureAttack;
        this.unarmedAssault = unarmedAssault;
        this.attackUnknown = attackUnknown;
        this.success = success;
        this.suicide = suicide;
        this.bioChemicalRadioactiveWeapon = bioChemicalRadioactiveWeapon;
        this.nuclear = nuclear;
        this.firearms = firearms;
        this.explosives = explosives;
        this.fakeWeapons = fakeWeapons;
        this.incendiary = incendiary;
        this.melee = melee;
        this.traffic = traffic;
        this.sabotageEquipment = sabotageEquipment;
        this.otherWeaponOrTypeUnknown = otherWeaponOrTypeUnknown;
        this.business = business;
        this.government = government;
        this.police = police;
        this.military = military;
        this.abortionRelated = abortionRelated;
        this.airportsAircraft = airportsAircraft;
        this.educationalInstitution = educationalInstitution;
        this.foodOrWaterSupply = foodOrWaterSupply;
        this.journalistsMedia = journalistsMedia;
        this.targTypeOthers = targTypeOthers;
        this.privateCitizensAndProperty = privateCitizensAndProperty;
        this.religiousFiguresInstitutions = religiousFiguresInstitutions;
        this.telecommunications = telecommunications;
        Tourists = tourists;
        this.transportation = transportation;
        this.utilities = utilities;
        this.northAmerica = northAmerica;
        this.midAmerica = midAmerica;
        this.southAmerica = southAmerica;
        this.eastAsia = eastAsia;
        this.southeastAsia = southeastAsia;
        this.southAsia = southAsia;
        this.centralAsia = centralAsia;
        this.easternEurope = easternEurope;
        this.westernEurope = westernEurope;
        this.middleEastNorthAfrica = middleEastNorthAfrica;
        this.subSaharanAfrica = subSaharanAfrica;
        this.australia = australia;
        this.crit1 = crit1;
        this.crit2 = crit2;
        this.crit3 = crit3;
        this.doubtterr = doubtterr;
        this.high = high;
        this.mid = mid;
        this.low = low;
        this.noLoss = noLoss;
        this.unknown = unknown;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Boolean getAssassination() {
        return assassination;
    }

    public Boolean getHigh() {
        return high;
    }

    public void setHigh(Boolean high) {
        this.high = high;
    }

    public Boolean getMid() {
        return mid;
    }

    public void setMid(Boolean mid) {
        this.mid = mid;
    }

    public Boolean getLow() {
        return low;
    }

    public void setLow(Boolean low) {
        this.low = low;
    }

    public Boolean getNoLoss() {
        return noLoss;
    }

    public void setNoLoss(Boolean noLoss) {
        this.noLoss = noLoss;
    }

    public Boolean getUnknown() {
        return unknown;
    }

    public void setUnknown(Boolean unknown) {
        this.unknown = unknown;
    }

    public void setAssassination(Boolean assassination) {
        this.assassination = assassination;
    }

    public Boolean getArmedAssault() {
        return armedAssault;
    }

    public void setArmedAssault(Boolean armedAssault) {
        this.armedAssault = armedAssault;
    }

    public Boolean getBombingExplosion() {
        return bombingExplosion;
    }

    public void setBombingExplosion(Boolean bombingExplosion) {
        this.bombingExplosion = bombingExplosion;
    }

    public Boolean getHijacking() {
        return hijacking;
    }

    public void setHijacking(Boolean hijacking) {
        this.hijacking = hijacking;
    }

    public Boolean getFacilityInfrastructureAttack() {
        return facilityInfrastructureAttack;
    }

    public void setFacilityInfrastructureAttack(Boolean facilityInfrastructureAttack) {
        this.facilityInfrastructureAttack = facilityInfrastructureAttack;
    }

    public Boolean getUnarmedAssault() {
        return unarmedAssault;
    }

    public void setUnarmedAssault(Boolean unarmedAssault) {
        this.unarmedAssault = unarmedAssault;
    }

    public Boolean getAttackUnknown() {
        return attackUnknown;
    }

    public void setAttackUnknown(Boolean attackUnknown) {
        this.attackUnknown = attackUnknown;
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

    public Boolean getBioChemicalRadioactiveWeapon() {
        return bioChemicalRadioactiveWeapon;
    }

    public void setBioChemicalRadioactiveWeapon(Boolean bioChemicalRadioactiveWeapon) {
        this.bioChemicalRadioactiveWeapon = bioChemicalRadioactiveWeapon;
    }

    public Boolean getNuclear() {
        return nuclear;
    }

    public void setNuclear(Boolean nuclear) {
        this.nuclear = nuclear;
    }

    public Boolean getFirearms() {
        return firearms;
    }

    public void setFirearms(Boolean firearms) {
        this.firearms = firearms;
    }

    public Boolean getExplosives() {
        return explosives;
    }

    public void setExplosives(Boolean explosives) {
        this.explosives = explosives;
    }

    public Boolean getFakeWeapons() {
        return fakeWeapons;
    }

    public void setFakeWeapons(Boolean fakeWeapons) {
        this.fakeWeapons = fakeWeapons;
    }

    public Boolean getIncendiary() {
        return incendiary;
    }

    public void setIncendiary(Boolean incendiary) {
        this.incendiary = incendiary;
    }

    public Boolean getMelee() {
        return melee;
    }

    public void setMelee(Boolean melee) {
        this.melee = melee;
    }

    public Boolean getTraffic() {
        return traffic;
    }

    public void setTraffic(Boolean traffic) {
        this.traffic = traffic;
    }

    public Boolean getSabotageEquipment() {
        return sabotageEquipment;
    }

    public void setSabotageEquipment(Boolean sabotageEquipment) {
        this.sabotageEquipment = sabotageEquipment;
    }

    public Boolean getOtherWeaponOrTypeUnknown() {
        return otherWeaponOrTypeUnknown;
    }

    public void setOtherWeaponOrTypeUnknown(Boolean otherWeaponOrTypeUnknown) {
        this.otherWeaponOrTypeUnknown = otherWeaponOrTypeUnknown;
    }

    public Boolean getBusiness() {
        return business;
    }

    public void setBusiness(Boolean business) {
        this.business = business;
    }

    public Boolean getGovernment() {
        return government;
    }

    public void setGovernment(Boolean government) {
        this.government = government;
    }

    public Boolean getPolice() {
        return police;
    }

    public void setPolice(Boolean police) {
        this.police = police;
    }

    public Boolean getMilitary() {
        return military;
    }

    public void setMilitary(Boolean military) {
        this.military = military;
    }

    public Boolean getAbortionRelated() {
        return abortionRelated;
    }

    public void setAbortionRelated(Boolean abortionRelated) {
        this.abortionRelated = abortionRelated;
    }

    public Boolean getAirportsAircraft() {
        return airportsAircraft;
    }

    public void setAirportsAircraft(Boolean airportsAircraft) {
        this.airportsAircraft = airportsAircraft;
    }

    public Boolean getEducationalInstitution() {
        return educationalInstitution;
    }

    public void setEducationalInstitution(Boolean educationalInstitution) {
        this.educationalInstitution = educationalInstitution;
    }

    public Boolean getFoodOrWaterSupply() {
        return foodOrWaterSupply;
    }

    public void setFoodOrWaterSupply(Boolean foodOrWaterSupply) {
        this.foodOrWaterSupply = foodOrWaterSupply;
    }

    public Boolean getJournalistsMedia() {
        return journalistsMedia;
    }

    public void setJournalistsMedia(Boolean journalistsMedia) {
        this.journalistsMedia = journalistsMedia;
    }

    public Boolean getTargTypeOthers() {
        return targTypeOthers;
    }

    public void setTargTypeOthers(Boolean targTypeOthers) {
        this.targTypeOthers = targTypeOthers;
    }

    public Boolean getPrivateCitizensAndProperty() {
        return privateCitizensAndProperty;
    }

    public void setPrivateCitizensAndProperty(Boolean privateCitizensAndProperty) {
        this.privateCitizensAndProperty = privateCitizensAndProperty;
    }

    public Boolean getReligiousFiguresInstitutions() {
        return religiousFiguresInstitutions;
    }

    public void setReligiousFiguresInstitutions(Boolean religiousFiguresInstitutions) {
        this.religiousFiguresInstitutions = religiousFiguresInstitutions;
    }

    public Boolean getTelecommunications() {
        return telecommunications;
    }

    public void setTelecommunications(Boolean telecommunications) {
        this.telecommunications = telecommunications;
    }

    public Boolean getTourists() {
        return Tourists;
    }

    public void setTourists(Boolean tourists) {
        Tourists = tourists;
    }

    public Boolean getTransportation() {
        return transportation;
    }

    public void setTransportation(Boolean transportation) {
        this.transportation = transportation;
    }

    public Boolean getUtilities() {
        return utilities;
    }

    public void setUtilities(Boolean utilities) {
        this.utilities = utilities;
    }

    public Boolean getNorthAmerica() {
        return northAmerica;
    }

    public void setNorthAmerica(Boolean northAmerica) {
        this.northAmerica = northAmerica;
    }

    public Boolean getMidAmerica() {
        return midAmerica;
    }

    public void setMidAmerica(Boolean midAmerica) {
        this.midAmerica = midAmerica;
    }

    public Boolean getSouthAmerica() {
        return southAmerica;
    }

    public void setSouthAmerica(Boolean southAmerica) {
        this.southAmerica = southAmerica;
    }

    public Boolean getEastAsia() {
        return eastAsia;
    }

    public void setEastAsia(Boolean eastAsia) {
        this.eastAsia = eastAsia;
    }

    public Boolean getSoutheastAsia() {
        return southeastAsia;
    }

    public void setSoutheastAsia(Boolean southeastAsia) {
        this.southeastAsia = southeastAsia;
    }

    public Boolean getSouthAsia() {
        return southAsia;
    }

    public void setSouthAsia(Boolean southAsia) {
        this.southAsia = southAsia;
    }

    public Boolean getCentralAsia() {
        return centralAsia;
    }

    public void setCentralAsia(Boolean centralAsia) {
        this.centralAsia = centralAsia;
    }

    public Boolean getEasternEurope() {
        return easternEurope;
    }

    public void setEasternEurope(Boolean easternEurope) {
        this.easternEurope = easternEurope;
    }

    public Boolean getWesternEurope() {
        return westernEurope;
    }

    public void setWesternEurope(Boolean westernEurope) {
        this.westernEurope = westernEurope;
    }

    public Boolean getMiddleEastNorthAfrica() {
        return middleEastNorthAfrica;
    }

    public void setMiddleEastNorthAfrica(Boolean middleEastNorthAfrica) {
        this.middleEastNorthAfrica = middleEastNorthAfrica;
    }

    public Boolean getSubSaharanAfrica() {
        return subSaharanAfrica;
    }

    public void setSubSaharanAfrica(Boolean subSaharanAfrica) {
        this.subSaharanAfrica = subSaharanAfrica;
    }

    public Boolean getAustralia() {
        return australia;
    }

    public void setAustralia(Boolean australia) {
        this.australia = australia;
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
}
