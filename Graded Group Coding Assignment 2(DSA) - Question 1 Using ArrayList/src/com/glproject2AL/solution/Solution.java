package com.glproject2AL.solution;

import java.util.ArrayList;

public class Solution {
	
	public ArrayList<Integer> arrangeFloorsList = new ArrayList<>();

	public void arrangeFloors(int floorSizeTobeAssembled, ArrayList<Integer> sizeOfFloors) {
		System.out.println("The order of construction is as follows\n");

		for (int j = 0; j < sizeOfFloors.size(); j++) {
			System.out.println("Day: " + (j + 1));

			if (sizeOfFloors.get(j) != floorSizeTobeAssembled) {
				System.out.println();
				arrangeFloorsList.add(sizeOfFloors.get(j));
			} 
			
			else {
				floorSizeTobeAssembled--;
				System.out.print(sizeOfFloors.get(j) + " ");
				while (!arrangeFloorsList.isEmpty() && floorSizeTobeAssembled == arrangeFloorsList.get(arrangeFloorsList.size() - 1)) {
					floorSizeTobeAssembled--;
					System.out.print(arrangeFloorsList.remove(arrangeFloorsList.size() - 1) + " ");
				}
				System.out.println();
			}
		}
	}

}
