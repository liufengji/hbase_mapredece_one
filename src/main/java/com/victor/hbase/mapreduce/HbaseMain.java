package com.victor.hbase.mapreduce;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.util.ToolRunner;

public class HbaseMain {

	public static void main(String[] args) throws Exception {

		Configuration conf = HBaseConfiguration.create();
		int status = ToolRunner.run(conf, new Fruit2FruitMRRunner(), args);
		System.exit(status);
	}

}
