package com.saroj.designpattaern.structural.Facade;

import java.sql.Connection;

public class MySqlHelper {

	public static Connection getMySqlDBConnection(){
		//get MySql DB connection using connection parameters
		System.out.println("MySQL Connection success");
		return null;
	}
	public void generateMySqlPDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("generate mysql PDF report success");
	}
	public void generateMySqlHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("generate mysql HTML report success");
	}
}
