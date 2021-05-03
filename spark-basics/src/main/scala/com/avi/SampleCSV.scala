package com.avi

import org.apache.spark.sql.SparkSession

object SampleCSV {
  def main(args:Array[String]):Unit={
    
    val spark=SparkSession.builder().appName("SparkApp").master("local[*]").getOrCreate()
    
    val input=spark.read.format("csv").option("header", true).load("input/input.csv")
    
    input.show()
  }
}