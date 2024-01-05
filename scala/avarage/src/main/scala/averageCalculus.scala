package com.brc

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Path}
import scala.collection.immutable.TreeMap
import scala.jdk.CollectionConverters.CollectionHasAsScala

object averageCalculus {
  val filePath = Path.of("../../measurements.txt")


  def main(args: Array[String]): Unit = {
    val t0 = System.nanoTime()
    val file = Files.readAllLines(filePath, StandardCharsets.UTF_8).asScala
    val map = file.map { l =>
      val line = l.split(";")
      line(0) -> Array(line(1).toDouble)
    }.foldLeft(TreeMap.empty[String, Array[Double]]) { case (treeMap, (key, value)) =>
      treeMap + (key -> treeMap.get(key).map(_ ++ value).getOrElse(value))
    }

    val data = map.map { case (station, values) =>
      val min = values.min
      val max = values.max
      val mean = values.sum / values.length
      station -> s"${min}/${"%.1f".format(mean)}/${max}"
    }

    data.foreach { case (key, value) => println(s"$key -> $value") }
    val t1 = System.nanoTime()
    println(s"execution time : ${(t1 - t0) / 1.0e9}s")

  }
}
