package thejourney;

import java.util.Scanner;


public class journeycalApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the speed and time to Calculate Distance");
	
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		
		journeyCalculator journeyCalculator=new journeyCalculator();
		
		double distance=journeyCalculator.calculateDistance(speed,time);
		System.out.println(distance);
		
					}
			}


