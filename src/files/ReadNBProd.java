package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadNBProd {

	public static void main(String[] args) {

		final int NBPORLINHA = 300;
		
		String strPathRead = "/home/nemo/Documentos/in.txt";
		String strPathWrite = "/home/nemo/Documentos/out.txt";
		File file = new File(strPathRead);
		Scanner sc = null;
		
		int column = 0;
		String strNB;
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPathWrite, true))) {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				Long lNB = Long.parseLong(sc.nextLine().trim());
				strNB = Long.toString(lNB);

				if (column == 0) bw.write(strNB + ",\"");
				bw.write(strNB);
				column++;
				if (column >= NBPORLINHA) {
					bw.write("\"");
					bw.newLine();
					column = 0;
				} else {
					bw.write(",");
				}
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(sc != null) sc.close();
		}
		System.out.println("End excution!");
	}
}
