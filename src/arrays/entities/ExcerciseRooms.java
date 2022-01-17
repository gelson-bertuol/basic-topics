package arrays.entities;

import java.util.Locale;
import java.util.Scanner;

public class ExcerciseRooms {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] room = new Room[10];
		System.out.print("How many rooms will be rented? ");
		int rented = sc.nextInt();
		System.out.println();
		
		for (int i=0; i<rented; i++) {
			sc.nextLine();
			System.out.println("Rent #"+ (i + 1) +":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int roomId = sc.nextInt();
			
			room[roomId] = new Room(name, email);
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		for (int i=0; i<room.length; i++) {
			if (room[i] != null) {
				System.out.println(i + ": " + room[i]);
			}
		}
		
		sc.close();
	}

}
