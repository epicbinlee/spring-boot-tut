package com.sbt.jcommander;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author leebin
 * @date 2021/04/18 00:18
 */

@Slf4j
//@SpringBootTest
@SpringBootApplication(scanBasePackages = {"com.sbt.jcommander.comp"})
@RunWith(SpringRunner.class)
public class MainTest {
    @Test
    public void test() {
        log.error("测试代码是够被打印");
    }
}