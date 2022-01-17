package files.exercise_csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExerciseCSV {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> productList = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String strSourceFilePath = sc.nextLine();
		
		//Lê o arquivo fonte
		File pathSource = new File(strSourceFilePath);
		if (!pathSource.exists()) {
			System.out.println("File " + strSourceFilePath + " does not exist!");
			sc.close();
			System.exit(0);
		}
		try (BufferedReader br = new BufferedReader(new FileReader(strSourceFilePath))) {
			String line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				Product p = new Product(vect[0], Double.parseDouble(vect[1]), Integer.parseInt(vect[2]));
				productList.add(p);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		//Se não existe a pasta /out, cria
		String strSourceFolder = pathSource.getParent() + "/out";
		
		File pathOut = new File(strSourceFolder);
		if (!pathOut.exists()) {
			//Cria a subpasta
			new File(strSourceFolder).mkdir();
		}
		
		//Escreve no arquivo summary.csv
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(strSourceFolder + "/summary.csv"))) {
			for (Product p : productList) {
				String line = p.getName() + "," + String.format("%.2f", (p.getPrice() * p.getQuantity()));
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("End execution!");
	}
}
