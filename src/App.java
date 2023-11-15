import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int val= 0;
        int poäng = 0;
        while(val!=1)
        {
            System.out.println("Vad är bästa programerings språket:  \n 1.Java  \n 2.C++ \n 3. Python   " );
            System.out.println("ange val(siffra): ");
            val= scan.nextInt();
            if(val==1)
            {
                System.out.println("Rätt svar!" + poäng++);
                System.out.println( poäng);

            }
            else if(val==2)
            {
                System.out.println("ingen vet vad c++ är");
            }
            else if(val==3)
            {
                System.out.println("nej nej");
            }
            else
            {
                System.out.println("du skulle välja 1 till 3");
            }

        
    }
      
    while(val!=2){
        System.out.println("Vad är den största staden i sverige:  \n 1.Göteborg \n 2.Stockholm \n 3. Malmö   " );
        System.out.println("ange val(siffra): ");
        val= scan.nextInt();
         if(val==1)
        {
            System.out.println("Nej ingen chans" );
           

        }
        else if(val==2)
        {
            System.out.println("Stockholm är rätt svar!");
        }
        else if(val==3)
        {
            System.out.println("💀💀💀");
        }
        else
        {
            System.out.println("DU VET VÄL");
        }

        
    }
}
}