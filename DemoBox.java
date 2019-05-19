/**
 * @(#)Box.java
 *
 *
 * @author
 * @version 1.00 2019/5/19
 */

class Box
{
	double width, height, depth;
	Box(double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	}

	Box(){

		width=-1;
		height=-1;
		depth=-1;

		}

	Box(double wym){
		width=height=depth=wym;
	}

	double volume(){
		return width*height*depth;
	}

    }

public class DemoBox {


    public static void main(String[] args) {
      Box mybox1 = new Box(8.3,44.2,32.2);
	  Box mybox2 = new Box();
	  Box mycube = new Box(5);
	  Box mybox4 = new Box();

      	double vol;

      vol =mybox1.volume();
      System.out.println("pud³o l ma wielkosc: "+vol);

      vol =mybox2.volume();
      System.out.println("pud³o 2 ma wielkosc: "+vol);

      vol =mycube.volume();
      System.out.println("szescian ma wielkosc: "+vol);

	  mybox4.height=7.0;
	  vol =mybox4.volume();
	  System.out.println("Nowe pudelko: " +vol);

    }
}

//hermetyzacja, dziedziczenie, polimorfizm - tworz¹ programowanie obiektowe