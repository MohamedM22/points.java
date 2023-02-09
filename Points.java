public class Points {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.1 to access the link).

        int points = 0;

        System.out.println("Harry was caught wandering the halls. -50 points for Gryffindor");
        
        points -= 50;
        System.out.println("Harry was being cheeky in class. -3 points for Gryffindor");
       
        points -=3;
        System.out.println("Hermione got full marks on Lockhart's quiz. 30 points for Gryffindor");
       
        points += 30; 
        System.out.println("Ron won the underground chess game. 100 points for Gryffindor");
   
        points += 100;
        System.out.println("Harry defeated Quirrell. 60 points for Gryffindor");
     
        points += 60;   
        System.out.println(points);
        // Compare your result to what's on Learn the Part.
        
    }
}

