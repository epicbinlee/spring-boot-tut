package com.sbt.scala.repository;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 数据读写
 *
 * @author leebin
 * @date 2021/04/23 19:40
 */
@Component
public interface DataReaderWriter {
    /**
     * 读取数据
     */
    List<String> readData(String path);

    /**
     * 写入数据
     */
    void writeData(String path);
}
