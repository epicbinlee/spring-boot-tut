package com.sbt.scala;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主要的入口
 *
 * @author leebin
 * @date 2021/04/22 19:16
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.sbt.scala"})
public class ScalaApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(ScalaApplication.class, args);
        } catch (Exception e) {
            log.error("异常定位.", e);
        }
    }
}
