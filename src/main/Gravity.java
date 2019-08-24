/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;


import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
		double g = 9.8;
		Scanner scanInput = new Scanner(System.in);
		double time ;
		time=scanInput.nextDouble();
		double speed;
		double distance;
		speed = g*time;
		distance = 0.5*g*time*time;
		System.out.print("The speed of the object at" +time );
		System.out.print("seconds after its release is " + speed);
		System.out.print("and the distance the object has travelled in the" + time);
		System.out.print("seconds after the relase is" + distance);
	}
}
