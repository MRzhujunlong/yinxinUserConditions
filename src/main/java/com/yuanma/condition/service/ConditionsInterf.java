package com.yuanma.condition.service;

import com.yuanma.condition.entity.Conditionsentity;

import java.util.List;

public interface ConditionsInterf {

    int insert(Conditionsentity conditionsentity);

    List<Conditionsentity> selectByAddress(String address);
}
