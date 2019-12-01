
public class TestPesel2 {


    public static void main(String[] args) {

    	String pesele[]={"08061404054", "86044104054", "8604104054", "17310912341"};

    	int wynik;

    	for(String pes:pesele){

    	wynik=	Pesel.spr(pes);
    	System.out.println("Cyfra kontrolna Pesel " + pes + " = " + wynik);
    	}

    }
}

class Pesel{
	static int spr(String pesel){


		int cyfra_k = 0;
		int tablica_cyfry[] = new int[11];
		int tablica_wag[] = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};


		if(pesel.length() != 11) cyfra_k = 11;
		else
			try {
			int sum = 0;
			for(int i = 0; i < pesel.length(); i++) {
				tablica_cyfry[i] = Integer.parseInt(pesel.substring(i, i + 1)); // funkcja sprawdzaj¹ca
				sum = sum + tablica_wag[i]*tablica_cyfry[i];
			}
			cyfra_k=sum%10;
		}
		catch(NumberFormatException e)
		{
			cyfra_k=13;
		}

		return cyfra_k;
	}
}


