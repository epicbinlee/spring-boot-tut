package com.sbt.log.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 测试日志
 *
 * @author leebin
 * @date 2021/04/19 09:36
 */
@Slf4j
@Component
public class LogRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("test");
        log.warn("test");
        log.error("test");
    }
}
