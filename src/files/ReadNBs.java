package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadNBs {

	public static void main(String[] args) {

		final int NBPORLINHA = 300;
		final boolean NUMERICO = true;
		final boolean PRODUCAO = true;
		
		String strPathRead = "/home/nemo/Documentos/in.txt";
		String strPathWrite = "/home/nemo/Documentos/out.txt";
		File file = new File(strPathRead);
		Scanner sc = null;
		
		int column = 0;
		String strNB;
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPathWrite, true))) {
			sc = new Scanner(file);
			
			if (!PRODUCAO) {
				int i =1;
				for (; i <= NBPORLINHA; i++) {
					bw.write(String.format("%010d",  i) + ",");
				}
				bw.write(String.format("%010d", i));
				bw.newLine();
			}
			
			while (sc.hasNextLine()) {
				if (NUMERICO) {
					Long lNB = Long.parseLong(sc.nextLine().trim());
					strNB = Long.toString(lNB);
				} else {
					strNB = sc.nextLine().trim();
				}
				if (column == 0) bw.write(strNB + ",");
				bw.write(strNB);
				column++;
				if (column >= NBPORLINHA) {
					bw.newLine();
					column = 0;
				} else {
					bw.write(",");
				}
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		System.out.println("End excution!");
	}
}
