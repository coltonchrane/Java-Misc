
/*
* Colton Chrane
* 11/12/2018
*pseudocode:
*Moving cars to street after checking the driveWay cars.
* While entering the license plates of each car in the driveway,
* If car license plate plate is positive add the car to driveway
* If car license plate is negative, removes the car from driveWay and add it to streetWay
* If car license plate is zero, stops the simulation that is enter to 0 to stop. 
* If the top of the driveWay is negative, remove it from driveway
* change the sign of license plate number from (-) to (+)
* Then push it the streetWay.
* If top of the driveWay is positive then stop moving the cars to streetWay using break; statement
* display results
 */
import java.util.*;
public class Driveway
{
	public static void main (String [] args)
	{
		Stack <Integer> streetWay = new Stack <Integer>();
		Stack <Integer> driveWay = new Stack <Integer>();


//Enter plates
		Scanner input= new Scanner (System.in);
		System.out.println("Enter license plate of cars in driveWay: ");
		int car= input.nextInt();
		while(car!=0)
		{
			driveWay.push(car);
			car=input.nextInt();
		}
		System.out.println("Drive Way and Street before cars moving to street:");
		System.out.println("Driveway: " + driveWay +"\n"+"StreetWay: " + streetWay +"\n\n");
//sort lists
		while(driveWay.size()>0)
		{
			if(driveWay.peek()<0)
			{
				int drivingCar = driveWay.pop();
				drivingCar=-1*drivingCar;
				streetWay.push(drivingCar);
			}
			else
			{
				break;
			}
		}
		System.out.println("Drive Way and Street after moving cars to street:");
		System.out.println("Driveway: " + driveWay +"\n"+"StreetWay: " + streetWay +"\n\n");
		while(streetWay.size()>0)
		{
			int streetCar = streetWay.pop();
			driveWay.push(streetCar);
		}
//results
		System.out.println("Drive Way and Street after moving cars from streetWay to driveWay:");
		System.out.println("Driveway: " + driveWay +"\n"+"StreetWay: " + streetWay +"\n\n");
	}
	}