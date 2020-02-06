/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;


public class JavaApplication14 {

    public static void main(String[] args) {
        Isbn a = new Isbn();
        
        
boolean wynik = a.sprawdzanie("5925325");

if(wynik = true){
   System.out.println("ISBN poprawny");
}
if (wynik = false){
      System.out.println("ISBN niepoprawny");
}
    
}
}
class Isbn{
    
     public boolean sprawdzanie( String isbn )
    {
        if ( isbn == null ) // sprawdzanie czy przeslano popr wartosci
        {
            return false;
        }

        isbn = isbn.replaceAll( "-", "" );  //usuwanie znakow niebÄ…dÄ…cych liczbami
        if ( isbn.length() != 13 ) // isbn w Polsce to 13 liczb - sprawdzenie 
        {
            return false;
        }

        try  // obs³ wyj¹tków  w przypadku blednych wartosci powyzej
        {
            int tot = 0;
            for ( int i = 0; i < 12; i++ )
            {
                int cyfry = Integer.parseInt( isbn.substring( i, i + 1 ) );
                tot += (i % 2 == 0) ? cyfry * 1 : cyfry * 3;
            }

            //checksum must be 0-9. If calculated as 10 then = 0
            int checksum = 10 - (tot % 10);
            if ( checksum == 10 )
            {
                checksum = 0;
            }

            return checksum == Integer.parseInt( isbn.substring( 12 ) );
        }
        catch ( NumberFormatException nfe )
        {
            //to catch invalid ISBNs that have non-numeric characters in them
            return false;
        }
    }
}


  