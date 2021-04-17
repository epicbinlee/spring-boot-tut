package com.sbt.jcommander.comp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 测试
 *
 * @author leebin
 * @date 2021/04/18 00:40
 */
@Slf4j
@Component
public class TestComponent {
    public void test(){
        log.info("测试类.");
    }
}
