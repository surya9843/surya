package divide;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) throws IOException
	{
		try {
		File file=new File("C:\\TextFolder\\sury.txt");
		FileReader fr=new FileReader(file);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("thank you");
	}
       
}
