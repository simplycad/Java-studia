
import java.util.*;

public class UDtest {


    public UDtest() {
    }


    public static void main(String[] args) {

	int p,q;
	p=23;
	q=14;

	UD ulamek1=new UD(p,q);
	ulamek1.rozwin();
    }
}

    class UD{

    int p,q;
	UD(int l, int m)	{

    p=l;
    q=m;

    }
    void rozwin(){
	int cyfra, reszta;

	ArrayList<Integer>cyfry=new ArrayList<Integer>();
	ArrayList<Integer>reszty=new ArrayList<Integer>();

	cyfra=p/q;
	reszta=p%q;

	System.out.print(cyfra+".");;

	if(reszta==0) System.out.print(0);
	else{
		boolean koniec=false, okres=false;

	while(!koniec&& !okres){
		reszty.add(reszta);
		reszta=reszta*10;
		cyfra=reszta/q;
		cyfry.add(cyfra);
		reszta=reszta%q;

		if(reszta==0){

			koniec=true;
			for(int i=0; i<cyfry.size(); i++)
				System.out.print(cyfry.get(i));
				System.out.println(" ");
		}

				if(reszty.contains(reszta)){
					okres=true;

				int index=reszty.indexOf(reszta);

				for(int i=0; i<index; i++)System.out.print(cyfry.get(i));
				System.out.print("( ");

				for(int i=index; i<cyfry.size(); i++)
					System.out.print(cyfry.get(i));
					System.out.println(" )");



		}
	}
	}

    }

}
