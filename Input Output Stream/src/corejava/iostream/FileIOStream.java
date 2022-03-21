package corejava.iostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {
	public static void main(String[] args) throws IOException {

		File f = new File("file1.txt");

		// FileIOStream
		// Write Output to file

		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("This is written using file Output Stream");
		dos.close();

		// Read Input from file
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str);
		dis.close();

	}
}
