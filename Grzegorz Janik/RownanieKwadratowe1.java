public
class RownanieKwadratowe1
{
  public static void main (String args[])
  {
    int parametrA = 1, parametrB = -1, parametrC = -6;

    System.out.println ("Parametry r�wnania:\n");
    System.out.println ("A: " + parametrA + " B: " + parametrB + " C: " + parametrC + "\n");

    if (parametrA == 0){
      System.out.println ("To nie jest r�wnanie kwadratowe: A = 0!");
    }
    else{
      double delta = parametrB * parametrB - 4 * parametrA * parametrC;
      if (delta < 0){
        System.out.println ("Delta < 0.");
        System.out.println ("To r�wnanie nie ma rozwi�zania w zbiorze liczb rzeczywistych");
      }
      else{
        double wynik;
        if (delta == 0){
          wynik = - parametrB / 2 * parametrA;
          System.out.println ("Rozwi�zanie: x = " + wynik);
        }
        else{
          wynik = (- parametrB + Math.sqrt(delta)) / 2 * parametrA;
          System.out.print ("Rozwi�zanie: x1 = " + wynik);
          wynik = (- parametrB - Math.sqrt(delta)) / 2 * parametrA;
          System.out.println (", x2 = " + wynik);
        }
      }
    }
  }
}
