package corejava.iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferIOStream {
	public static void main(String[] args) throws IOException {
		File fb = new File("file2.txt");

		FileOutputStream ffos = new FileOutputStream(fb);
		BufferedOutputStream bos = new BufferedOutputStream(ffos);
		String s = "This is written using buffered Output Stream";
		byte b[] = s.getBytes();
		bos.write(b);
		bos.close();

		FileInputStream ffis = new FileInputStream(fb);
		try (BufferedInputStream bis = new BufferedInputStream(ffis)) {
			while (bis.available() > 0) {
				System.out.print((char) bis.read());
			}
		}

	}
}
