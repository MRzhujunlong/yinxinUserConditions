package com.yuanma.condition.controller;

import com.yuanma.condition.Utils.ManagerUtil;
import com.yuanma.condition.entity.Conditionsentity;
import com.yuanma.condition.service.ConditionsImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private ConditionsImp conditionsImp;

    @RequestMapping("/insert")
    @ResponseBody
    public ManagerUtil InsertMassage(Conditionsentity conditionsentity){
        int result = conditionsImp.insert(conditionsentity);
        if (result > 0){
            return ManagerUtil.ok("更新成功");
        }
        return ManagerUtil.error("更新失败");
    }

    @RequestMapping("/select")
    @ResponseBody
    public List<Conditionsentity> select(String address){
        System.out.println(address+";;;;;;;");
        List<Conditionsentity> list = conditionsImp.selectByAddress(address);
        System.out.println(list.get(0).getFollowpeople());

        return  list;
    }


}
