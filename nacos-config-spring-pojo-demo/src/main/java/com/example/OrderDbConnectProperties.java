package com.example;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Component;

/**
 * @NacosValue 和 @NacosPropertySource配合使用获取配置中心参数值
 */
@Component
public class OrderDbConnectProperties {
    @NacosValue(value = "${order.datasource.connect.url}")
    private String url;

    @NacosValue(value = "${order.datasource.connect.username}")
    private String username;

    @NacosValue(value = "${order.datasource.connect.password}")
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "OrderDbConnectProperties{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
