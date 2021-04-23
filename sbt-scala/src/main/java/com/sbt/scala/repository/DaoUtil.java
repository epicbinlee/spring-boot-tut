package com.sbt.scala.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * 转换类
 *
 * @author leebin
 * @date 2021/04/23 19:42
 */
@Slf4j
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DaoUtil {
    public static DaoUtil DAO_UTIL;

    public DataReaderWriter dataReaderWriter;
    @PostConstruct
    private void init() {
        DAO_UTIL = this;
        DAO_UTIL.dataReaderWriter = this.dataReaderWriter;
    }

    /**
     * 使用方法
     */
    public static List<String> readAndWrite(String path) {
        final List<String> lines = DAO_UTIL.dataReaderWriter.readData(path);
        log.info("打印行数, {}", lines.size());
        return lines;
    }
}
