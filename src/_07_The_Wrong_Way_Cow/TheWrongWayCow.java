/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import java.util.ArrayList;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
    	ArrayList <Integer> directionL = new ArrayList<>();
    	ArrayList <Integer> directionR = new ArrayList<>();
    	ArrayList <Integer> directionU = new ArrayList<>();
    	ArrayList <Integer> directionD = new ArrayList<>();
    	int leftCount = 0;
    	int rightCount = 0;
    	int upCount = 0;
    	int downCount = 0;
    	int count = 0;
    	for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[0].length; j++) {
				if (j == 8 && i == 4) {
					System.out.println("84");
				}
				if (field[i][j] == 'c' && i+2 < field.length && field[i+1][j] == 'o' &&  field[i+2][j] == 'w') {
					directionL.add(j);
					directionL.add(i);
					leftCount++;
					count++;
				}
				else if (field[i][j] == 'c' && i-2 >= 0 &&field[i-1][j] == 'o' && i-2 >= 0 && field[i-2][j] == 'w') {
					directionR.add(j);
					directionR.add(i);
					rightCount++;
					count++;
				}
				else if (field[i][j] == 'c' && j+2 < field[0].length && field[i][j+1] == 'o' &&  field[i][j+2] == 'w') {
					directionD.add(j);
					directionD.add(i);
					downCount++;
					count++;
				}
				else if (field[i][j] == 'c' && j-2 >= 0 && field[i][j-1] == 'o' && j-2 >= 0 && field[i][j-2] == 'w') {
					directionU.add(j);
					directionU.add(i);
					upCount++;
					count++;
				}
				
			//	int[] coord = new int[2];
			//	coord[0] = i;
			//	coord[1] = j;
			//	return coord;
			}
		}
    	if (leftCount == 1) {
			int[] coord = new int[2];
			coord[0] = directionL.get(0);
			coord[1] = directionL.get(1);
			System.out.println(coord[0] + "," + coord[1]);
			return coord;
		}
		else if (rightCount == 1) {
			int[] coord = new int[2];
			coord[0] = directionR.get(0);
			coord[1] = directionR.get(1);
			System.out.println(coord[0] + "," + coord[1]);
			return coord;
		}
		else if (upCount == 1) {
			int[] coord = new int[2];
			coord[0] = directionU.get(0);
			coord[1] = directionU.get(1);
			System.out.println(coord[0] + "," + coord[1]);
			return coord;
		}
		else if (downCount == 1) {
			int[] coord = new int[2];
			coord[0] = directionD.get(0);
			coord[1] = directionD.get(1);
			System.out.println(coord[0] + "," + coord[1]);
			return coord;
		}
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
        
        return null;
    }
}
