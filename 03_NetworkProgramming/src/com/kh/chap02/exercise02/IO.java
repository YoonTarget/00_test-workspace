package com.kh.chap02.exercise02;

import java.io.FileWriter;
import java.io.IOException;

public class IO {
	
	public void output() {
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("test.txt");
			fw.write(97);
			fw.write(65);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
