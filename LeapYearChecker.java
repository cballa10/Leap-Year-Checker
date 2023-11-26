import java.util.Scanner;

public class LeapYearChecker {
public static void LeapYear(){
  int year;

//creating scanner object
Scanner input = new Scanner(System.in);

//ask users to enter year
System.out.println("Enter year");
  year = input.nextInt();

//checking if the year entered is a leap year
boolean isLeapYear = false;

if (year % 4 == 0) {
 isLeapYear = true;
}

//display the result
if (isLeapYear) {
System.out.println("The year entered, "  + year + " ,is a leap year. ");
} else {
System.out.println("The year entered, "  + year + " ,is not a leap year.");
}

}

public static void main(String [] args){
//calling the method
LeapYear();

}

}