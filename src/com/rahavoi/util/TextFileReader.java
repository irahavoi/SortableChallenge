package com.rahavoi.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
	public void readFile(String path, TextFileHandler textLineHandler){
		try{
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String strLine;
			while((strLine = br.readLine()) != null){
				System.out.println(strLine);
			}
		} catch(IOException e){
			System.out.println("Error:" + e.getMessage());
		}
	}
}
