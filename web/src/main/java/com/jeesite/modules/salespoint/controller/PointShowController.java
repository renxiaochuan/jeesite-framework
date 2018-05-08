package com.jeesite.modules.salespoint.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jeesite.modules.salespoint.service.IPointShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 网点儿Controller
 * @author 任晓川
 * @version 2018-05-2
 */
@Controller
@RequestMapping(value = "${adminPath}/point")
public class PointShowController {
    @Autowired
    private IPointShowService pointShowService;


    @ResponseBody
    @RequestMapping(value = "/index")
    public JSONObject pointShowIndex(@RequestParam(value = "cityCode" , required = false) String cityCode){
        JSONObject result = new JSONObject();

        try{
            result.put("data", pointShowService.getInfoSalePointList());
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
