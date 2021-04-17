package com.sbt.jcommander;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主方法
 *
 * @author leebin
 * @date 2021/04/17 17:20
 */
@Slf4j
//@Parameters(commandNames = {"hello cmd"})
@SpringBootApplication(scanBasePackages = {"com.sbt.jcommander"})
//public class JcommanderMainApplication implements Command {
public class JcommanderMainApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(JcommanderMainApplication.class);
        } catch (Exception e) {
            log.error("程序入口定位异常", e);
        }
    }

    //@Override
    //public void run() throws Exception {
    //    System.out.println("hello cmd");
    //}
}
