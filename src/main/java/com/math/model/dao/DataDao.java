package com.math.model.dao;

import com.math.model.domain.Economics;
import com.math.model.domain.Filtered;
import com.math.model.domain.TerroristAttack;
import com.math.model.repository.EconomicsRepository;
import com.math.model.repository.FilteredRepository;
import com.math.model.repository.TerroristAttacksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yangkuan
 */
@Component
public class DataDao {

    @Autowired
    TerroristAttacksRepository terroristAttacksRepository;

    @Autowired
    EconomicsRepository economicsRepository;

    @Autowired
    FilteredRepository filteredRepository;


    public List<TerroristAttack> convertData(){
        List<Economics> economicsList = economicsRepository.findAll();
        List<TerroristAttack> terroristAttacks = new ArrayList<>();
        for(Economics economics:economicsList){
            terroristAttacks.add(convert(economics));
        }
        return terroristAttacks;
    }

    private TerroristAttack convert(Economics economics){
        TerroristAttack terroristAttack = new TerroristAttack();
        //
        terroristAttack.setEventId(economics.getEventId());
        terroristAttack.setSuccess(economics.isSuccess());
        terroristAttack.setSuicide(economics.isSuicide());
        //
        terroristAttack.setCrit1(economics.isCrit1());
        terroristAttack.setCrit2(economics.isCrit2());
        terroristAttack.setCrit3(economics.isCrit3());

        if(economics.getDoubtterr()!=null&&economics.getDoubtterr().equals(1)){
            terroristAttack.setDoubtterr(true);
        }
        //attack type
        switch (economics.getAttackType()){
            case 1:
                terroristAttack.setAssassination(true);
                break;
            case 2:
                terroristAttack.setArmedAssault(true);
                break;
            case 3:
                terroristAttack.setBombingExplosion(true);
                break;
            case 4:
                terroristAttack.setHijacking(true);
                break;
            case 5:
                terroristAttack.setHijacking(true);
                break;
            case 6:
                terroristAttack.setHijacking(true);
                break;
            case 7:
                terroristAttack.setFacilityInfrastructureAttack(true);
                break;
            case 8:
                terroristAttack.setUnarmedAssault(true);
                break;
            case 9:
                terroristAttack.setAttackUnknown(true);
                break;
        }
        //target type
        switch (economics.getTargetType()){
            case 1:
                terroristAttack.setBusiness(true);
                break;
            case 2:
                terroristAttack.setGovernment(true);
                break;
            case 7:
                terroristAttack.setGovernment(true);
                break;
            case 3:
                terroristAttack.setPolice(true);
                break;
            case 4:
                terroristAttack.setMilitary(true);
                break;
            case 5:
                terroristAttack.setAbortionRelated(true);
                break;
            case 6:
                terroristAttack.setAirportsAircraft(true);
                break;
            case 8:
                terroristAttack.setEducationalInstitution(true);
                break;
            case 9:
                terroristAttack.setFoodOrWaterSupply(true);
                break;
            case 10:
                terroristAttack.setJournalistsMedia(true);
                break;
            case 11:
                terroristAttack.setTargTypeOthers(true);
                break;
            case 12:
                terroristAttack.setTargTypeOthers(true);
                break;
            case 13:
                terroristAttack.setTargTypeOthers(true);
                break;
            case 14:
                terroristAttack.setPrivateCitizensAndProperty(true);
                break;
            case 15:
                terroristAttack.setReligiousFiguresInstitutions(true);
                break;
            case 16:
                terroristAttack.setTelecommunications(true);
                break;
            case 17:
                terroristAttack.setTargTypeOthers(true);
                break;
            case 18:
                terroristAttack.setTourists(true);
                break;
            case 19:
                terroristAttack.setTransportation(true);
                break;
            case 20:
                terroristAttack.setTargTypeOthers(true);
                break;
        }

        //region
        switch (economics.getRegion()){
            case 1:
                terroristAttack.setNorthAmerica(true);
                break;
            case 2:
                terroristAttack.setMidAmerica(true);
                break;
            case 3:
                terroristAttack.setSouthAmerica(true);
                break;
            case 4:
                terroristAttack.setEastAsia(true);
                break;
            case 5:
                terroristAttack.setSoutheastAsia(true);
                break;
            case 6:
                terroristAttack.setSouthAsia(true);
                break;
            case 7:
                terroristAttack.setCentralAsia(true);
                break;
            case 8:
                terroristAttack.setEasternEurope(true);
                break;
            case 9:
                terroristAttack.setWesternEurope(true);
                break;
            case 10:
                terroristAttack.setMiddleEastNorthAfrica(true);
                break;
            case 11:
                terroristAttack.setSubSaharanAfrica(true);
                break;
            case 12:
                terroristAttack.setAustralia(true);
                break;
        }

        if(economics.getProperty().equals(0)){
            terroristAttack.setNoLoss(true);
        }
        else if(economics.getProperty().equals(1)){
            if(economics.getProperty().equals(1)){
                terroristAttack.setHigh(true);
            }
            else if(economics.getProperty().equals(2)){
                terroristAttack.setMid(true);
            }
            else if(economics.getProperty().equals(3)){
                terroristAttack.setLow(true);
            }
            else {
                terroristAttack.setUnknown(true);
            }
        }
        else {
            terroristAttack.setUnknown(true);
        }

        return terroristAttack;
    }


    public void ReadFiltered(){
        List<Filtered> filtereds = filteredRepository.findAll();
        Filtered maxFiltereds = new Filtered(2017,12,31,true,240,12,5
                ,true,true,true,true,true,true,9,22
                ,true,13,1570,4,true);
        Filtered minFiltereds = new Filtered(1998,1,1,false,1,1
                ,1,false,false,false,false,false,false
                ,1,1,false,1,0,1,false);

        List<double[]> result = new ArrayList<>();
        for(Filtered filtered:filtereds){
            double[] rel = new double[17];
            rel[0] = norm(isTrue(filtered.getExtended()),0,1);
            rel[1] = norm(filtered.getCountry(),minFiltereds.getCountry(),maxFiltereds.getCountry());
            rel[2] = norm(filtered.getRegion(),minFiltereds.getRegion(),maxFiltereds.getRegion());
            rel[3] = norm(filtered.getSpecificity(),minFiltereds.getSpecificity(),maxFiltereds.getSpecificity());
            rel[4] = norm(isTrue(filtered.getVicinity()),0,1);
            rel[5] = norm(isTrue(filtered.getCrit1()),0,1);
            rel[6] = norm(isTrue(filtered.getCrit2()),0,1);
            rel[7] = norm(isTrue(filtered.getCrit3()),0,1);
            rel[8] = norm(isTrue(filtered.getSuccess()),0,1);
            rel[9] = norm(isTrue(filtered.getSuicide()),0,1);
            rel[10] = norm(filtered.getAttackType(),minFiltereds.getAttackType(),maxFiltereds.getAttackType());
            rel[11] = norm(filtered.getTargetType(),minFiltereds.getTargetType(),maxFiltereds.getTargetType());
            rel[12] =norm(isTrue(filtered.getClaimed()),0,1);
            rel[13] = norm(filtered.getWeaponType(),minFiltereds.getWeaponType(),maxFiltereds.getWeaponType());
            rel[14] = norm(filtered.getNkill(),minFiltereds.getNkill(),maxFiltereds.getNkill());
            rel[15] = norm(filtered.getPropextent(),minFiltereds.getPropextent(),maxFiltereds.getPropextent());
            rel[16] =norm(isTrue(filtered.getIshostkid()),0,1);
            result.add(rel);
        }
        try {
            writeTxt(result);
        }
        catch (IOException e){
            System.out.println(e);
        }

    }

    private double norm(int val, int min, int max){
        double margin = max-min;
        return (val-min)/margin;
    }

    private Integer isTrue(Boolean b){
        if(b!=null&&b){
            return 1;
        }
        return 0;
    }

    private void writeTxt(List<double[]> matrix) throws IOException {
        String fileName = "E:/matrix.txt";
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        for(double[] row:matrix){
            for(double d:row){
                out.write(d+" ");
            }
            out.newLine();
        }
        out.close();
    }

}



