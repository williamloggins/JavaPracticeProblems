public class Mileage
{
public static void main(String[] args)
{

double milesDriven;
double gallonsUsed;
double milesPerGallon;

System.out.print("This program will calculate milage.");

System.out.print("Enter miles driven: ");
milesDriven = Double.parseDouble(System.console().readLine());

System.out.print("Enter gallons used: ");
gallonsUsed = Double.parseDouble(System.console().readLine());

milesPerGallon = (double) milesDriven / gallonsUsed;
System.out.print("Miles per gallon is: " + milesPerGallon);

}
}