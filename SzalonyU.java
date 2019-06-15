
 import java.util.*;
 import java.io.*;

public class SzalonyU {


    public static void main(String[] args)
	throws IOException{

 	FileReader fin = new FileReader("IMIONA.IN");
 	Scanner src = new Scanner (fin);

	String imie;
	TreeSet<String>LI=new TreeSet<String>();



	while(src.hasNext()){

	    imie=src.next();
	    imie=imie.replace("-","");
	    imie=imie.toLowerCase();

	    imie = imie.substring(0,1).toUpperCase()+ imie.substring(1);
	    LI.add(imie);



	}
	System.out.println(LI);
    }
}





