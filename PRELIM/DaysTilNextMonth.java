import java.time.*;
public class DaysTilNextMonth{
   public static void main(String[] a){
   LocalDate day = LocalDate.now();
   int month = day.getDayOfMonth();
   int year = day.getYear();
   
   LocalDate currentDate = LocalDate.now();
   DateTimeFormatter customerFormatter = DateTimmerFormatter.ePattern("yyyy, mm, dd");
   String formattedDate currentDate.format(customFormatter);  
   
   System.out.println("Date Today: " + year );
   
 }
}