/**
 * 
 */
package cn.edu.sjtu.omnilab.cgi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author jianwen
 *
 */
public class TransportImageOverHttp {

	/**
	 * 
	 */
	public TransportImageOverHttp() {
		// TODO Auto-generated constructor stub
	}

	public void printHttpHead(String contType) {
		System.out.println("Content-type: " + contType);
	}
	
	public void printHttpBody() throws IOException {
		/* Read a file */
		File imgFile = new File("demo.jpg");
		int fileSize = (int)imgFile.length();
		byte[] buffer = new byte[fileSize];
		FileInputStream fileStream = new FileInputStream(imgFile);
		fileStream.read(buffer);
		
		/* Write to stdout*/
		PrintStream stdout = new PrintStream(System.out);
		stdout.write(buffer);
	}
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		TransportImageOverHttp transDemo = new TransportImageOverHttp();
		
		transDemo.printHttpHead("image/jpeg");
		System.out.println("");
		transDemo.printHttpBody();
	}

}
