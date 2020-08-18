package com.example.controller;

import com.example.DatasourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Nacos服务端信息放到WEB-INF/config.properties中配置，这样可以做到Nacos服务端信息也可以动态配置
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
    private DatasourceProperties datasourceProperties;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @ResponseBody
    public String hi(){
        return "hi, " + datasourceProperties;
    }

}
