package com.saroj.designpattaern.structural.Facade;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection(){
		//get Oracle DB connection using connection parameters
		System.out.println("Oracle Connection success");
		return null;
	}
	public void generateOraclePDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("generate Oracle PDF report success");
	}
	public void generateOracleHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("generate Oracle HTML report success");
	}

}
