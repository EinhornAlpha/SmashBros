package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) {
		File in = new File("");
		File out = new File("");

		try {
			int bytes = (int) (in.length() / 2);

			FileInputStream inStream = new FileInputStream(in);
			FileOutputStream outStream = new FileOutputStream(out);

			for (int i = 0; i < bytes; i++) {
				char c0 = (char) inStream.read();
				char c1 = (char) inStream.read();
				int i0 = charToInt(c0);
				int i1 = charToInt(c1);
				int b = i0 << 4 | i1;
				outStream.write(b);
			}

			inStream.close();
			outStream.close();
		} catch (

		Exception e) {

		}
	}

	public static int charToInt(char c) {
		switch (c) {
		case '0':
			return 0;
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		case 'a':
			return 10;
		case 'b':
			return 11;
		case 'c':
			return 12;
		case 'd':
			return 13;
		case 'e':
			return 14;
		case 'f':
			return 15;
		default:
			return 0;
		}
	}
}
