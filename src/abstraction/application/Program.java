package abstraction.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import abstraction.entities.Circle;
import abstraction.entities.Rectangle;
import abstraction.entities.Shape;
import abstraction.entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> listShapes = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Shape #" + i + " data:");

			System.out.print("Rectangle or Circle (r/c)? ");
			char cShape = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			
			sc.nextLine();
			Color color = Color.valueOf(sc.nextLine());
			
			if (cShape == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				listShapes.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				listShapes.add(new Circle(color, radius));
			}
		}

		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape s : listShapes) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		sc.close();
	}
}
