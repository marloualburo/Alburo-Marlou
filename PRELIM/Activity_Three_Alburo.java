import java.util.Scanner;
public class Activity_Three_Alburo{
   
   final static double c1Price = 109.00;
   final static double c2Price = 158.00;
   final static double c3Price = 250.00;
   final static double c4Price = 499.00;
   final static double c5Price = 699.00;
   final static double r1Price = 35.00;
   final static double r2Price = 50.00;
   final static double pesoToDollar = 56.00;
public static void main(String[] args){
   
   System.out.println("Alburo Chicken Menu: ");
   System.out.println("C1 = PHP 109.00            Add ons.");
   System.out.println("C2 = PHP 158.00            R1 = PHP 35.00");
   System.out.println("C3 = PHP 250.00            R2 = PHP 50.00");
   System.out.println("C4 = PHP 499.00");
   System.out.println("C5 = PHP 699.00\n");
   Scanner sc = new Scanner(System.in);
   
   /* Alburo Chicken Menu
      
      C1 = PHP 109.00
      C2 = PHP 158.00
      C3 = PHP 250.00
      C4 = PHP 499.00
      C5 = PHP 699.00
      
      Add ons.
      
      R1 = PHP 35.00
      R2 = PHP 50.00
   */
   
   
   System.out.println("Number of C1 Meal: ");
   int numOfC1Meal = sc.nextInt();
   
   System.out.println("Number of C2 Meal: ");
   int numOfC2Meal = sc.nextInt();
   
   System.out.println("Number of C3 Meal: ");
   int numOfC3Meal = sc.nextInt();
   
   System.out.println("Number of C4 Meal: ");
   int numOfC4Meal = sc.nextInt();
   
   System.out.println("Number of C5 Meal: ");
   int numOfC5Meal = sc.nextInt();

   System.out.println("Number of C1 Meal: " + numOfC1Meal);
   System.out.println("Number of C2 Meal: " + numOfC2Meal);
   System.out.println("Number of C3 Meal: " + numOfC3Meal);
   System.out.println("Number of C4 Meal: " + numOfC4Meal);
   System.out.println("Number of C5 Meal: " + numOfC5Meal);
   
   double c1MealTotalPrice = numOfC1Meal * c1Price;
   double c2MealTotalPrice = numOfC2Meal * c2Price;
   double c3MealTotalPrice = numOfC3Meal * c3Price;
   double c4MealTotalPrice = numOfC4Meal * c4Price;
   double c5MealTotalPrice = numOfC5Meal * c5Price;
   
   System.out.println("Total of C1 Meal Price: " + c1MealTotalPrice);
   System.out.println("Total of C2 Meal Price: " + c2MealTotalPrice);
   System.out.println("Total of C3 Meal Price: " + c3MealTotalPrice);
   System.out.println("Total of C4 Meal Price: " + c4MealTotalPrice);
   System.out.println("Total of C5 Meal Price: " + c5MealTotalPrice);
   
   
   



  }
}