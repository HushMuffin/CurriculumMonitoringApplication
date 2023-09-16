package proj2.prog2.samcis.slu;

import java.util.Scanner;

public class Ella {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String[] flavors = new String[3];
        flavors[0] = "okinawa";
        flavors[1] = "matcha";
        flavors[2] = "wintermelon";

        System.out.println("what is ur flavor");
        String input = kbd.nextLine();

        boolean result = false;


        for(int i= 0; i<flavors.length; i++){
            if(flavors[i].equalsIgnoreCase(input)) {
                result = true;
                break;
            }else{
                result = false;
            }
        }


        if(result == true) {
            System.out.println("dine in or takeout? ");
            String dito = kbd.nextLine();
            System.out.println("Your order is: " + input);
            System.out.println("=======================");
            System.out.println(dito);
        }
    }
}
