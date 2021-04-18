package com.sbt.jcommander.runner;

import com.beust.jcommander.Parameters;
import com.maddenabbott.jcommander.controller.Command;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 启动命令2
 *
 * @author leebin
 * @date 2021/04/17 20:09
 */
@Slf4j
@Component
@Parameters(commandNames = {"cmd-two"})
public class CmdTwo implements Command {
    @Override
    public void run() throws Exception {
        log.info("cmd two");
    }
}
