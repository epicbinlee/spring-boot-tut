package com.sbt.scala.scala

import com.sbt.scala.repository.DaoUtil

import java.util

/**
 * Scala调用方法
 *
 * @author leebin
 */
class ScalaClazz {
}

object ScalaClazz {
  private val path = "xx";

  def readData(): Unit = {
    val lines: util.List[String] = DaoUtil.readAndWrite(path)
    print(lines.size())
  }

}
