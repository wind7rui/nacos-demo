package com.example.controller;

import com.example.OrderDbConnectProperties;
import com.example.TradeDatasourceProperties;
import com.example.TradeDbConnectProperties;
import com.example.TradeDbProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 在Nacos控制台创建：
 * namespace：dev
 * data-id:com.example.trade.datasource.properties
 * group-id:Trade
 *
 * 配置项：
 * datasource.connect.url=jdbc:mysql://127.0.0.1:3306/trade
 * datasource.connect.username=admin
 * datasource.connect.password=admin
 */
@Controller
@RequestMapping
public class HelloController {

    @Autowired
    private TradeDatasourceProperties datasourceProperties;

    @Autowired
    private TradeDbProperties dbProperties;

    @Autowired
    private TradeDbConnectProperties dbConnectProperties;

    @Autowired
    private OrderDbConnectProperties orderDbConnectProperties;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @ResponseBody
    public String hi(){
        return "hi, " + datasourceProperties;
    }

    @RequestMapping(value = "/xml", method = RequestMethod.GET)
    @ResponseBody
    public String xml(){
        return "hi, " + dbProperties;
    }

    @RequestMapping(value = "/anno", method = RequestMethod.GET)
    @ResponseBody
    public String anno(){
        return "hi, " + dbConnectProperties;
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    @ResponseBody
    public String order(){
        return "hi, " + orderDbConnectProperties;
    }
}
