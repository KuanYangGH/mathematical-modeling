package com.math.model.dao;

import com.math.model.domain.Data;
import com.math.model.domain.Economics;
import com.math.model.domain.Filtered;
import com.math.model.domain.TerroristAttack;
import com.math.model.repository.DataRepository;
import com.math.model.repository.EconomicsRepository;
import com.math.model.repository.FilteredRepository;
import com.math.model.repository.TerroristAttacksRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.*;
import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired
    DataRepository dataRepository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


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

    /**
     * 按照凶手进行匹配
     */
    public void ReadFiltered1(){
        List<Data> datas = dataRepository.findAll();

        Data maxData = new Data(2017,12,31,1004,12,5
                ,true,true,true,true,true
                ,true,true,true,9,22,1004
                ,"",13,1570,1360,500,8191
                ,151,200,true,4);

        Data minData = new Data(1998,1,1,4,1,1
                ,false,false,false,false,false
                ,false,false,false,1,1,4
                ,"",1,0,0,0,0
                ,0,0,false,0);

        List<List<Integer>> result = new ArrayList<>();
        List<String> ngnames = new ArrayList<>();
        Map<String,List<Data>> dataMap = new HashMap<>(1473);
        for(int i=0;i<datas.size();i++){
            String key = datas.get(i).getGname();
            if(dataMap.containsKey(key)){
                List<Data> value = dataMap.get(key);
                value.add(datas.get(i));
                dataMap.put(key, value);
            }
            else {
                List<Data> value = new ArrayList<>();
                value.add(datas.get(i));
                dataMap.put(key,value);
                ngnames.add(key);
            }
        }
        logger.error("dataMap.keySet().size():"+dataMap.keySet().size());
        List<String> strings = new ArrayList<>();
        for(String key:dataMap.keySet()){
            List<Data> value = dataMap.get(key);
            int len = value.size();
            logger.error("key:"+key+";value.size():"+len);
            strings.add(key+";"+len);
            if(len<=1){
                continue;
            }
            if(len<50){
                for(int i=0;i<len;i++){
                    for(int j=i+1;j<len;j++){
                        List<Integer> rel = generateVector(datas.get(i),minData,maxData);
                        rel.addAll(generateVector(datas.get(j),minData,maxData));
                        result.add(rel);
                    }
                }
            }
            else {
                int margin = len/50;
                for(int i=0;i<len;i+=margin){
                    for(int j=i+margin;j<len;j+=margin){
                        List<Integer> rel = generateVector(datas.get(i),minData,maxData);
                        rel.addAll(generateVector(datas.get(j),minData,maxData));
                        result.add(rel);
                    }
                }
            }

        }
        //不匹配对生成
        List<List<Integer>> nonmatchingResult = new ArrayList<>();
        for(int i=0;i<ngnames.size();i++){
            for(int j=i+1;j<ngnames.size();j++){
                List<Data> value1 = dataMap.get(ngnames.get(i));
                List<Data> value2 = dataMap.get(ngnames.get(j));
                List<Integer> rel = generateVector(value1.get(0),minData,maxData);
                rel.addAll(generateVector(value2.get(0),minData,maxData));
                nonmatchingResult.add(rel);
            }
        }


        try {
            //String savePath = "E:/gnameStatistics.txt";
            String savePath = "E:/matchingPairMatrix.txt";
            writeTxt2(result,savePath);
            String saveNonMatchingPath = "E:/nonMatchingPairMatrix.txt";
            writeTxt2(nonmatchingResult,saveNonMatchingPath);
            //writeStrings2Txt(strings,savePath);
        }
        catch (IOException e){
            System.out.println(e);
        }

    }

    public void ReadFiltered2(){
        List<Data> datas = dataRepository.findAll();

        Data maxData = new Data(2017,12,31,1004,12,5
                ,true,true,true,true,true
                ,true,true,true,9,22,1004
                ,"",13,1570,1360,500,8191
                ,151,200,true,4);

        Data minData = new Data(1998,1,1,4,1,1
                ,false,false,false,false,false
                ,false,false,false,1,1,4
                ,"",1,0,0,0,0
                ,0,0,false,0);

        List<List<Integer>> result = new ArrayList<>();
        for(Data data:datas){
            result.add(generateVector(data,minData,maxData));
        }
        try {
            String savePath = "";
            writeTxt2(result,savePath);
        }
        catch (IOException e){
            System.out.println(e);
        }

    }

    /**
     *
     * @param data
     * @param minData
     * @param maxData
     * @return
     */
    private List<Integer> generateVector(Data data,Data minData,Data maxData){
        List<Integer> rel = new ArrayList<>();
        //9个1/0
        rel.add(isTrue(data.getVicinity()));
        rel.add(isTrue(data.getCrit1()));
        rel.add(isTrue(data.getCrit2()));
        rel.add(isTrue(data.getCrit3()));
        rel.add(isTrue(data.getDoubtterr()));
        rel.add(isTrue(data.getMultiple()));
        rel.add(isTrue(data.getSuccess()));
        rel.add(isTrue(data.getSuicide()));
        rel.add(isTrue(data.getProperty()));
        //iyear imonth iday country region natlty
        rel.addAll(norm3(data.getIyear(),minData.getIyear(),maxData.getIyear(),1));
        rel.addAll(norm3(data.getImonth(),minData.getImonth(),maxData.getImonth(),1));
        rel.addAll(norm3(data.getIday(),minData.getIday(),maxData.getIday(),1));
        rel.addAll(norm3(data.getCountry(),minData.getCountry(),maxData.getCountry(),1));
        rel.addAll(norm3(data.getRegion(),minData.getRegion(),maxData.getRegion(),1));
        rel.addAll(norm3(data.getNatlty(),minData.getNatlty(),maxData.getNatlty(),1));
        //nkill nkillus nkillter nwound nwoundus nwoundte
        rel.addAll(nkillNorm(data.getNkill(),4));
        rel.addAll(norm3(data.getNkillus(),minData.getNkillus(),maxData.getNkillus(),2));
        rel.addAll(norm3(data.getNkillter(),minData.getNkillter(),maxData.getNkillter(),2));
        rel.addAll(nwoundNorm(data.getNwound(),4));
        rel.addAll(norm3(data.getNwoundus(),minData.getNwoundus(),maxData.getNwoundus(),2));
        rel.addAll(norm3(data.getNwoundte(),minData.getNwoundte(),maxData.getNwoundte(),2));
        // specificity attackType targetType propextent
        rel.addAll(norm2(data.getSpecificity(),minData.getSpecificity(),maxData.getSpecificity(),1));
        rel.addAll(norm2(data.getAttackType(),minData.getAttackType(),maxData.getAttackType(),1));
        rel.addAll(norm2(data.getTargetType(),minData.getTargetType(),maxData.getTargetType(),1));
        rel.addAll(norm2(data.getWeaponType(),minData.getWeaponType(),maxData.getWeaponType(),1));
        rel.addAll(norm2(data.getPropextent(),minData.getPropextent(),maxData.getPropextent(),1));
        return rel;
    }


    public void ReadFiltered3(){
        List<Filtered> filtereds = filteredRepository.findAll();
        Filtered maxFiltereds = new Filtered(2017,12,31,true,240,12,5
                ,true,true,true,true,true,true,9,22
                ,true,13,1570,4,true);
        Filtered minFiltereds = new Filtered(1998,1,1,false,1,1
                ,1,false,false,false,false,false,false
                ,1,1,false,1,0,1,false);

        List<List<Integer>> result = new ArrayList<>();
        for(Filtered filtered:filtereds){
            List<Integer> rel = new ArrayList<>();
            rel.add(isTrue(filtered.getExtended()));
            rel.addAll(norm2(filtered.getRegion(),minFiltereds.getRegion(),maxFiltereds.getRegion(),1));
            rel.addAll(norm2(filtered.getSpecificity(),minFiltereds.getSpecificity(),maxFiltereds.getSpecificity(),1));
            rel.add(isTrue(filtered.getVicinity()));
            rel.add(isTrue(filtered.getCrit1()));
            rel.add(isTrue(filtered.getCrit2()));
            rel.add(isTrue(filtered.getCrit3()));
            rel.add(isTrue(filtered.getSuccess()));
            rel.add(isTrue(filtered.getSuicide()));
            rel.add(filtered.getAttackType());
            rel.add(filtered.getTargetType());
            rel.add(isTrue(filtered.getClaimed()));
            rel.addAll(norm2(filtered.getWeaponType(),minFiltereds.getWeaponType(),maxFiltereds.getWeaponType(),1));
            List<Integer> nKills = norm2(filtered.getNkill(),minFiltereds.getNkill(),maxFiltereds.getNkill(),5);
            rel.addAll(nKills);

            List<Integer> propextents = norm2(filtered.getNkill(),minFiltereds.getNkill(),maxFiltereds.getNkill(),5);
            rel.addAll(propextents);

            rel.add((isTrue(filtered.getIshostkid())));
            result.add(rel);
        }
        try {
            String savePath = "E:/allMatrix.txt";
            writeTxt2(result,savePath);
        }
        catch (IOException e){
            System.out.println(e);
        }

    }

    private List<Integer> nkillNorm(int val, int weight){
        List<Integer> re =new ArrayList<>();
        for(int i=0;i<4;i++){
            re.add(0);
        }
        if(val<3){
            re.set(0,weight);
        }
        else if(val<10){
            re.set(1,weight);
        }
        else if(val<30){
            re.set(2,weight);
        }
        else {
            re.set(3,weight);
        }
        return re;
    }

    private List<Integer> nwoundNorm(int val, int weight){
        List<Integer> re =new ArrayList<>();
        for(int i=0;i<4;i++){
            re.add(0);
        }
        if(val<10){
            re.set(0,weight);
        }
        else if(val<50){
            re.set(1,weight);
        }
        else if(val<100){
            re.set(2,weight);
        }
        else {
            re.set(3,weight);
        }
        return re;
    }

    private double norm(int val, int min, int max){
        double margin = max-min;
        return (val-min)/margin;
    }

    private List<Integer> norm2(int val, int min, int max, int weight){
        double len = max-min+1;
        List<Integer> re =new ArrayList<>();
        for(int i=0;i<len;i++){
            re.add(0);
        }
//        logger.error("margin:"+margin);
//        logger.error("(val-min):"+(val-min));
//        logger.error("(val-min)/margin:"+((val-min)/margin));
//        logger.error("(int)((val-min)/margin):"+(int)((val-min)/margin));
        re.set(val-min,weight);
        return re;
    }


    private List<Integer> norm3(int val, int min, int max, int weight){
        double margin = (max-min)/4.0;
        List<Integer> re =new ArrayList<>();
        for(int i=0;i<5;i++){
            re.add(0);
        }
//        logger.error("margin:"+margin);
//        logger.error("(val-min):"+(val-min));
//        logger.error("(val-min)/margin:"+((val-min)/margin));
//        logger.error("(int)((val-min)/margin):"+(int)((val-min)/margin));
        re.set((int)((val-min)/margin),weight);
        return re;
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

    private void writeTxt2(List<List<Integer>> matrix, String savePath) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(savePath));
        for(List<Integer> row:matrix){
            for(Integer d:row){
                out.write(d+" ");
            }
            out.newLine();
        }
        out.close();
    }

    private void writeStrings2Txt(List<String> strings,String savePath) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(savePath));
        for(String s:strings){
            out.write(s);
            out.newLine();
        }
        out.close();
    }

}



