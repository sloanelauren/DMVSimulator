import java.util.Random;
public class DmvSimulator {
    public static void main(String[] args) {

        Random rand = new Random();
        int ticket = rand.nextInt(200);

        System.out.println("\nHello! Welcome to the DMV!");
        System.out.println("Here is your ticket number! Please wait until your number is called!");
        System.out.println(" -----------------");
        System.out.println("|       "+ ticket +"        |");
        System.out.println(" -----------------");

        int count = ticket + 1;
    while (count != ticket) {
             System.out.println(count);
             count ++;
         if (count == 201 ) {
            count = 1;
        } else if (ticket == count) {
            System.out.println(ticket);
            int magicnum = rand.nextInt(100) + 1;
            if(magicnum == 15) {
                System.out.println("Oh my favorite number! You have the correct paperwork. Thank you!");
            } else {
            System.out.println("We can't accept this paperwork, get to the back of the line or come back tomorrow. MUAHAHAHA");
            }
        }
        }
    }
}

