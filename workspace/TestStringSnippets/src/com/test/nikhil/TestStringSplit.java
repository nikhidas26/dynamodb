package com.test.nikhil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TestStringSplit {
	
	public static void main(String[] args) {
		File file = new File("/Users/nikhil_das23/Desktop/Hadoop-Edureka/assignment-week-3---patents/patent.txt");
		
		
		
		
		
		BufferedReader reader = null;
		try {
			 reader = new BufferedReader(new FileReader("/Users/nikhil_das23/Desktop/Hadoop-Edureka/assignment-week-3---patents/patent.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
//				System.out.println(line);	
				
				String[] asd = line.split(" ");
				System.out.print("Patent id : " + asd[0] + ",");
				System.out.print("Sub patent id : " + asd[1]);
				System.out.println();
			}
			
		} catch(IOException e) {
			System.err.println("Exception : " + e.getMessage()); 
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
			}
		}
	}
	
}
