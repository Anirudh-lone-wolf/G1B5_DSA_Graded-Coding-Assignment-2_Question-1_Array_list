package com.glproject2AL.driver;
import java.util.ArrayList;
import java.util.Scanner;
import com.glproject2AL.solution.Solution;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of floors in the building:");
		int noOfFloors = sc.nextInt();

		ArrayList<Integer> sizeOfFloors = new ArrayList<>();
		for (int i = 0; i < noOfFloors; i++) {
			System.out.println("Enter the floor size given on day: " + (i + 1));
			int floorSize = sc.nextInt();

			if (floorSize <= 0) {
				System.out.println("The size of the floor has to be a positive integer. So, enter a valid floor size.");
				i--;
			} else if (floorSize > noOfFloors) {
				System.out.println("The floor size cannot be greater than the number of floors in the building. So, enter a valid floor size.");
				i--;
			} else if(sizeOfFloors.contains(floorSize)) {
				System.out.println("Floor sizes should be distinct. Enter a valid floor size");
				i--;
			}else {
				sizeOfFloors.add(floorSize);
			}
		}

		sc.close();

		System.out.println();

		Solution skyscraperConstruction = new Solution();
		skyscraperConstruction.arrangeFloors(noOfFloors, sizeOfFloors);

	}

}
