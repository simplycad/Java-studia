/*Napisz klas� Osoba, kt�ra b�dzie
 *1- tworzy� obiekty klasy Osoba o polach
 *imie nazwisko i nr pesel.
 *2 - b�dzie sprawdza� poprawno�� nr pesel
 *i w razie b�edu pomija� go,
 *zaproponuj co wtedy ma by� wpisane jako pesel
 *
 */

public class TestOsoby {

        public static void main(String[] args) {
        Osoba[] osoby = new Osoba[20];

        Osoba o0=new Osoba("Jan", "Kowalski", "86041404054");
        osoby[0]=o0;

		Osoba o1=new Osoba("Adam", "Wi�niewski", "83110960414");
        osoby[1]=o1;

        Osoba o2=new Osoba("Anna", "Karenina", "17310912341");
        osoby[2]=o2;

        Osoba o3=new Osoba("Olga", "Noblowska", "76041404055");
        osoby[3]=o3;

        Osoba o4=new Osoba("Andrzej", "J�drzejowski", "86041404055");
        osoby[4]=o4;


        for(int i=0; i<5;i++)
        System.out.println(osoby[i].imie+" "+osoby[i].nazwisko+" "+osoby[i].pesel);





    }
}

