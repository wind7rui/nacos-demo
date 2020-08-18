package com.example;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.stereotype.Component;

@Component
@NacosPropertySource(dataId = "com.example.trade.datasource.properties", groupId = "Trade", autoRefreshed = true)
@NacosPropertySource(dataId = "com.example.order.datasource.properties", groupId = "Order", autoRefreshed = true)
@NacosPropertySource(dataId = "com.example.pay.datasource.properties", groupId = "Pay", autoRefreshed = true)
public class NacosConfiguration {
}
