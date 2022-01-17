package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteWithFileWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		String path = "/home/nemo/Documentos/out.txt";
		
		//Sobrescreve o arquivo se existir - recria o arquivo
		//try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

		//Faz um append no arquivo se ele existir - acrescenta os dados no arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
