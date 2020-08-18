package com.example;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.stereotype.Component;

/**
 * 在Nacos控制台创建：
 * namespace：dev
 * data-id:com.example.trade.datasource.properties
 * group-id:Trade
 *
 * 配置项：
 * useCache=true
 */
@Component
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848", username = "nacos", password = "nacos", namespace = "dev"))
@NacosPropertySource(dataId = "com.example.trade.datasource.properties", groupId = "Trade", autoRefreshed = true)
public class NacosConfiguration {
}
