package com.example;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import org.springframework.stereotype.Component;

/**
 * Nacos服务端信息从WEB-INF/config.properties中读取
 */
@Component
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "${nacos.server-addr}", username = "${nacos.username=}", password = "${nacos.password}", namespace = "${nacos.config.namespace}"))
public class NacosConfiguration {
}
