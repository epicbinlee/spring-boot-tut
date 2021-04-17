package com.sbt.jcommander;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 多种命令启动类
 *
 * @author leebin
 * @date 2021/04/17 20:05
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.sbt.jcommander"})
public class MultiCommandApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiCommandApplication.class, args);
    }
}
