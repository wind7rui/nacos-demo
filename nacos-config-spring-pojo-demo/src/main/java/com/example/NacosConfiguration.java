package com.example;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySources;
import org.springframework.stereotype.Component;

@Component
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848", username = "nacos", password = "nacos", namespace = "dev"))
@NacosPropertySource(dataId = "com.example.trade.datasource.properties", groupId = "Trade", autoRefreshed = true)
@NacosPropertySource(dataId = "com.example.order.datasource.properties", groupId = "Order", autoRefreshed = true)
@NacosPropertySource(dataId = "com.example.pay.datasource.properties", groupId = "Pay", autoRefreshed = true)

/*@NacosPropertySources({
        @NacosPropertySource(dataId = "com.example.order.datasource.properties", groupId = "Order", autoRefreshed = true),
        @NacosPropertySource(dataId = "com.example.pay.datasource.properties", groupId = "Pay", autoRefreshed = true)
})*/
public class NacosConfiguration {
}
