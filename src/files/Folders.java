package files;

import java.io.File;
import java.util.Scanner;

public class Folders {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Busca todas as passas a partir do path
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//Busca os arquivos de uma pasta
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		//Cria uma subpasta
		boolean success = new File(strPath + "/subdir").mkdir();
		System.out.println("Diretory created successfully: " + success);
		
		sc.close();
	}
}
