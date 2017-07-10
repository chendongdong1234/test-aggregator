package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test {
	
	public static void main(String args[]) throws Exception {
		File file = new File("D:\\acc\\nginx_error.log");// Text文件
		BufferedReader br = new BufferedReader(new FileReader(file));// 构造一个BufferedReader类来读取文件
		String s = null;
		String fileName = file.getName();
		String newFileName = "D:\\acc\\new\\new_" + fileName;

		File newFile = new File(newFileName);
		if (!newFile.exists()) {
			newFile.createNewFile();
		}else{
			newFile.delete();
			newFile.createNewFile();
		}
		while ((s = br.readLine()) != null) {// 使用readLine方法，一次读一行
			if (s.contains("Baiduspider") || s.contains("Googlebot") || s.contains("Sosospider")
					|| s.contains("YoudaoBot") || s.contains("Msnbot") || s.contains("YisouSpider")
					|| s.contains("EasouSpider") || s.contains("Sogou web spider")) {
				System.out.println(s);
				Test.write(newFileName, s);
			} else {
				continue;
			}
		}

		br.close();
	}

	public static void write(String file, String conent) {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
			out.write(conent + "\r\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}