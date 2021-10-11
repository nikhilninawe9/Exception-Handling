package Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ReadWrite {
	void readFile() throws FileNotFoundException {
		FileInputStream f = new FileInputStream("C:\\Users\\Ansh041217\\Desktop\\SAC.txt");
	}
}

public class Throws1 {

	public static void main(String[] args) {
		ReadWrite r = new ReadWrite();
		try {
			r.readFile();// we must try catch the method which throws by method..
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
