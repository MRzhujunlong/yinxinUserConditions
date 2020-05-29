package com.yuanma.condition.service;

import com.yuanma.condition.entity.Conditionsentity;
import com.yuanma.condition.mapperif.ConditionMapperif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConditionsImp implements ConditionsInterf {

    @Autowired
    private ConditionMapperif conditionMapperif;

    /**
     *  数据插入
     * */
    @Override
    public int insert(Conditionsentity conditionsentity) {
        System.out.println("获取数据："+conditionsentity.getAddress()+"---"+conditionsentity.getFollowpeople());
        try {
            int result = conditionMapperif.insertMassage(conditionsentity);
            return result;
        }catch (Exception e){
            return -500;
        }

    }

    /**
     * 获取数据
     * */
    @Override
    public List<Conditionsentity> selectByAddress(String address) {
        List<Conditionsentity> conditionsentityList = null;
        List<Conditionsentity> listcon = conditionMapperif.selectByAddress(address);
        if (listcon == null){
            return  conditionsentityList;
        }
        return listcon;
    }
}
