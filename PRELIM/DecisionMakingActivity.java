import java.util.Scanner;
class DecisionMakingActivity{
   
   public static void main(String[] a){
   
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Route to Moalboal");
   
   System.out.print("Is Barili Route 4.1 is obstructed? (Yes = 1 or No = 0) ");
   int isBariliRouteObstructed = sc.nextInt();
   
   if(isBariliRouteObstructed == 0)
      System.out.println("Default Route:");
      System.out.println("Mingla ... (Route1)");
      System.out.println("San Fer ... (Route2)");
      System.out.println("Carcar ... (Route3)");
      System.out.println("Dumanjug ... (Route4.1)");
      System.out.println("Alcantara ... (Route4.1.1)");
      System.out.println("Moalboal ... (Route4.1.2)");
      
       
   
 System.out.print("Is Dumanjug Route 4.2.1 obstructed? (Yes = 1 or No = 0) ");
   int isDomanjugObstructed = sc.nextInt();
   
   if(isDomanjugObstructed == 1)
      System.out.println("Recommended Route:");
      System.out.println("Mingla ... (Route1)");
      System.out.println("San Fer ... (Route2)");
      System.out.println("Carcar ... (Route3)");
      System.out.println("Sibonga ... (Route4.2)");
      System.out.println("Argao ... (Route5)");
      System.out.println("Ronda ... (Route5.1)");
      System.out.println("Moalboal ... (Route4.1.2)");

    }
 }
