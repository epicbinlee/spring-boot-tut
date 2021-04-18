package com.sbt.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 测试log入口类
 *
 * @author leebin
 * @date 2021/04/18 22:16
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.sbt.log"})
public class SbtLogMainApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(SbtLogMainApplication.class, args);
        } catch (Exception e) {
            log.error("全局定位异常.", e);
        }
    }
}
