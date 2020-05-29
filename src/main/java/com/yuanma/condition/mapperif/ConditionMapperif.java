package com.yuanma.condition.mapperif;


import com.yuanma.condition.entity.Conditionsentity;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface ConditionMapperif {

    @Insert("insert into userconditions(address,times,chanpin,conditions,way,operator,followpeople) values(#{Address},#{Times},#{Chanpin},#{Conditions},#{Way},#{Operator},#{Followpeople})")
    int insertMassage(Conditionsentity conditionsentity);


    @Select("select * from userconditions where address = #{address}")
    List<Conditionsentity> selectByAddress(String address);
}
