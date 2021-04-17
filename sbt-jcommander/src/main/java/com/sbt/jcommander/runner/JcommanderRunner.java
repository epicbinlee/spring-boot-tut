package com.sbt.jcommander.runner;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 启动器
 *
 * @author leebin
 * @date 2021/04/17 17:24
 */
@Slf4j
@Component
public class JcommanderRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("开始运行.");

        System.out.println(JSONObject.class);

        log.info("运行结束.");
    }
}
