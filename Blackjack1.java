package blackjack1;

import java.util.Scanner;

class Blackjack{

    public static void main(String[] args) 
    {
        int jatekos_random1 = 100;
        int jatekos_random2 = 100;

        while(jatekos_random1 >= 12 || jatekos_random2 >= 12  || jatekos_random1 < 3 || jatekos_random2 <3)
        {
            jatekos_random1 = (int)(Math.random()*100);
            jatekos_random2 = (int)(Math.random()*100);
        }
        
        int jatekos_osszes = jatekos_random1 + jatekos_random2;
        
        System.out.println("A lapod: "+jatekos_random1+" és a "+jatekos_random2);
        System.out.println("Kártyáid összege: "+jatekos_osszes);
 if(jatekos_osszes==21)
        {
            System.out.println("Játékos nyert!");
        }
 System.out.println();
        
        int oszto_random1 = 100;
        int oszto_random2 = 100;
        
        while(oszto_random1 >= 12 || oszto_random2 >= 12 || oszto_random1 < 3 || oszto_random2 < 3)
        {
            oszto_random1 = (int)(Math.random()*100);
            oszto_random2 = (int)(Math.random()*100);
        }
        
        int oszto_osszeg = oszto_random1 + oszto_random2;
        
        boolean eltakar = Math.random() < 0.5;
        
        if(eltakar==true)
        {
            System.out.println("Az osztó lapja: "+oszto_random1+" és egy rejtett lap");
            System.out.println("A kártya összege is rejtve van!");
            System.out.println();
        }
        else
        {
            System.out.println("Az osztó kártyája: "+oszto_random1+" és "+oszto_random2);
            System.out.println("Osztó kártyáinak összege: "+oszto_osszeg);
            System.out.println();
        if(oszto_osszeg==21)
            {
                 System.out.println("Osztó nyert!");
            }
        }

        String jatekos_pref;
        Scanner in = new Scanner(System.in);

        System.out.println("Ha tovább szeretnél menni írd be , hogy 'hit' ellenben 'stay' ");
        jatekos_pref = in.nextLine();

        while(jatekos_pref.equals("hit"))
        {
            int jatekos_random3 = 100;
            while(jatekos_random3 >= 12  || jatekos_random3 < 3)
            {
                jatekos_random3 = (int)(Math.random()*100);
            }
            jatekos_osszes = jatekos_osszes + jatekos_random3;
            System.out.println("Kártyáid: "+jatekos_random3);
            System.out.println("Kártyáid összege: "+jatekos_osszes);
     System.out.println();

            if(jatekos_osszes>21)
            {
                System.out.println("Az osztó nyert!");
                return;
            }
            else if(jatekos_osszes==21)
                {
                    System.out.println("Te nyertél!");
                    return;
                }
            System.out.println("Ha tovább szeretnél menni írd be , hogy 'hit' ellenben 'stay' ");
            jatekos_pref = in.nextLine();
        }
        
        if (jatekos_pref.equals("stay"))
        {
            System.out.println();
            System.out.println("Az osztó köre:");
            int oszto_random3 = 100;
            while(oszto_random3 >= 12 || oszto_random3 <3)
            {
                oszto_random3 = (int)(Math.random()*100);
            }

            System.out.println("A rejtett lapja a "+oszto_random2 +" volt");
            System.out.println("A kártyái összege: "+oszto_osszeg);
            System.out.println();

            if(oszto_osszeg>16)
            {
                System.out.println("Az osztó nem húz több lapot!");
            }
            else
            {
                while(oszto_osszeg<=16)
                {
                    oszto_osszeg = oszto_osszeg + oszto_random3;
                    System.out.println("Az osztó hit-el!");
                    System.out.println("A kártyája: "+oszto_random3);
                    System.out.println("A kártyái összege: "+oszto_osszeg);
                }
            }

            System.out.println();
            System.out.println("Az osztó kártyáinak az összege: "+oszto_osszeg);
            System.out.println("A kártyáid összege: "+jatekos_osszes);

            if((jatekos_osszes>oszto_osszeg && jatekos_osszes<21)||oszto_osszeg>21)
            {
                System.out.println("Te nyertél!");
            }
            else if((oszto_osszeg<21 && jatekos_osszes<oszto_osszeg)||jatekos_osszes>21)
                 {
                    System.out.println("Az osztó nyert!");
                 }
        }
    }
}