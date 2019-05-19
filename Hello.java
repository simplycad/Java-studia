/**
 * @(#)Program1.java
 *
 *
 * @author
 * @version 1.00 2019/5/19
 */

public class Program1 {


    public Program1() {
    }

    public static void main(String[] args) {
	int liczba = 97;

    	System.out.println("Hello world"); //System - klasa, println - metoda
		System.out.println("Liczba ma wartoœæ "+liczba);

		liczba=liczba*2;

		System.out.println("Nowa wartoœæ liczby");
		System.out.println(liczba);
		main2();
    }

     public static void main2() {
    	double liczby[]={10.1, 11.2, 12.3, 13.4, 14.5};
    	double wynik=0;
    	for(double x: liczby)
    		wynik+=x;

    	System.out.println("œrednia liczb wynosi "+wynik/5);
    	}
}

