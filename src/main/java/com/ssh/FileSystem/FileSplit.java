package com.ssh.FileSystem;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileSplit {
	public static void main(String[] args) throws IOException {
		long timer = System.currentTimeMillis();
		int bufferSize = 20*1024*1024;//设读取文件的缓存为20MB 
		File file = new File("");
		FileInputStream fileInputStream = null;
		//建立缓冲文本输入流  
		BufferedInputStream bufferedInputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader input = null;
		try {
			fileInputStream = new FileInputStream(file);
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			inputStreamReader = new InputStreamReader(bufferedInputStream);
			input = new BufferedReader(inputStreamReader, bufferSize);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int splitNum = 112-1;//要分割的块数减一
		int fileLines =2366983;//输入文件的行数  
		long perSplitLines = fileLines/splitNum;//每个块的行数
		for (int i = 0; i < splitNum; i++) {
			//分割   
            //每个块建立一个输出 
			FileWriter  output = new FileWriter("/home/haoqiong/part" + i + ".txt");
			String line = null;
			//逐行读取，逐行输出  
			for (long lineCounter = 0; lineCounter < perSplitLines && (line = input.readLine()) != null; lineCounter++) {
				output.append(line+"\r");
			}
			output.flush();
			output.close();
			output = null;
		}
		input.close();
		timer = System.currentTimeMillis() - timer;
		System.out.println("处理时间" + timer);
	}
}
