// This program will analyze locations input by the user. (Jade Park - 7/27/2021)

import java.util.Scanner;

public class LocationExpansionAnalysis { 
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   
   // declaring my variables
   StringBuilder firstLocation = new StringBuilder();
   int firstLocationDistance;
   StringBuilder secondLocation = new StringBuilder();
   int secondLocationDistance;
   StringBuilder thirdLocation = new StringBuilder();
   int thirdLocationDistance;
   StringBuilder fourthLocation = new StringBuilder();
   int fourthLocationDistance;
   
   // flag variable that will help control my loops
   boolean flag = false;
   
   // introduction to the user on what the program is about
   System.out.println("Welcome to Starr! This program will identify 4 possible office locations and determine their viability.");
   
      
   do {
   
      // first location input
      System.out.print("\nPlease enter your first potential office location: ");
      
      if (firstLocation.length() != 0) {
         // if firstLocation isn't empty because of a previous input, this clears the String and adds the new input
         firstLocation.replace(0, firstLocation.length(), input.nextLine());
      } else {
         // otherwise, the input is just added
         firstLocation.append(input.nextLine());
      }
      
      if (firstLocation.length() > 15) {
         System.out.println("INVALID INPUT! Please ensure your input's length is less or equal to 15 characters.");
         flag = false; 
      } else {
         flag = true;
      }
      
   } while (flag == false); // loops if user inputs something invalid
      
            
   do {
      
      System.out.print("Please enter the distance in miles from " + firstLocation + " to Starr headquarters (Chicago, IL): ");
      firstLocationDistance = input.nextInt();
      
      if (firstLocationDistance > 800 || firstLocationDistance < 100) {
         System.out.println("Please re-enter an acceptable distance that's <800 and >100 miles.");
         flag = false;
      } else {
         flag = true;
      }
      
   } while (flag == false);   
           
   
      // second
      
      do {
   
      // second location input
      System.out.print("\nPlease enter your second potential office location: ");
      secondLocation.append(input.nextLine());
      
      if (secondLocation.length() != 0) {
         // if secondLocation isn't empty because of a previous input, this clears the String and adds the new input
         secondLocation.replace(0, secondLocation.length(), input.nextLine());
      }
      
      if (secondLocation.length() > 15) {
         System.out.println("INVALID INPUT! Please ensure your input's length is less or equal to 15 characters.");
         flag = false; 
      } else {
         flag = true;
      }
      
   } while (flag == false); // loops if user inputs something invalid
      
            
   do {
      
      System.out.print("Please enter the distance in miles from " + secondLocation + " to Starr headquarters (Chicago, IL): ");
      secondLocationDistance = input.nextInt();
      
      if (secondLocationDistance > 800 || secondLocationDistance < 100) {
         System.out.println("Please re-enter an acceptable distance that's <800 and >100 miles.");
         flag = false;
      } else {
         flag = true;
      }
      
   } while (flag == false);
      
      

   
      // third
      do {
   
      // third location input
      System.out.print("\nPlease enter your third potential office location: ");
      thirdLocation.append(input.nextLine());
      
      if (thirdLocation.length() != 0) {
         // if thirdLocation isn't empty because of a previous input, this clears the String and adds the new input
         thirdLocation.replace(0, thirdLocation.length(), input.nextLine());
      }

      
      if (thirdLocation.length() > 15) {
         System.out.println("INVALID INPUT! Please ensure your input's length is less or equal to 15 characters.");
         flag = false; 
      } else {
         flag = true;
      }
      
   } while (flag == false); // loops if user inputs something invalid
      
            
   do {
      
      System.out.print("Please enter the distance in miles from " + thirdLocation + " to Starr headquarters (Chicago, IL): ");
      thirdLocationDistance = input.nextInt();
      
      if (thirdLocationDistance > 800 || thirdLocationDistance < 100) {
         System.out.println("Please re-enter an acceptable distance that's <800 and >100 miles.");
         flag = false;
      } else {
         flag = true;
      }
      
   } while (flag == false);
            
      // fourth
      System.out.print("Please enter your fourth potential office location: ");
      fourthLocation.append(input.nextLine());
      
      if (fourthLocation.length() != 0) {
         // if fourthLocation isn't empty because of a previous input, this clears the String and adds the new input
         fourthLocation.replace(0, fourthLocation.length(), input.nextLine());
      }

      
      if (fourthLocation.length() > 15) {
         System.out.println("INVALID INPUT! Please ensure your input's length is less or equal to 15 characters.");
         flag = false;
      }
   
      System.out.print("Please enter the distance in miles from " + fourthLocation +" to Starr headquarters (Chicago, IL): ");
      fourthLocationDistance = input.nextInt();
      
      if (fourthLocationDistance > 800 || fourthLocationDistance < 100) {
         System.out.println("Please re-enter an acceptable distance that's <800 and >100 miles.");
         flag = false;
      }

                

   
   System.out.println("Thank you! The system reads you input the cities " + firstLocation + ", " + secondLocation + ", " + thirdLocation + ", and " + fourthLocation + ".");
   
   }
}
