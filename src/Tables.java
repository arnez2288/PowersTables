import java.util.*;

public class Tables {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean next = true;
        do {
        System.out.println("Learn your Squares and Cubes");
        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();
    	System.out.println("Number          Squared          Cubed");
    	System.out.println("=======         =======          ======\r\n"+ "");
    	
        int i = 1;
        
        while (i <= num) {

              System.out.print(i + "                 " + Math.pow(i, 2));
            System.out.println(i + "              " + Math.pow(i, 3));
 
            i++;
        }
        
        System.out.println("Continue (y/n)");
        sc.nextLine();
        String answ = sc.nextLine();
        
        if (answ.equalsIgnoreCase("n")) {
        	next= false;
        }
        }while(next);
         sc.close();
     }
}