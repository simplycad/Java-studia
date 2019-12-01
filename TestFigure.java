

public class TestFigure {


    public TestFigure() {
    }


    public static void main(String[] args) {

        Figure f= new Figure(10,10);
        Figure figref;
        figref=f;
        System.out.println("Pole= "+ figref.pole());
        Rectangle r= new Rectangle(5,9);
         figref=r;
         System.out.println("Pole= "+ figref.pole());

         Triangle t= new Triangle(5,9);
         figref=t;
         System.out.println("Pole= "+ figref.pole());

         Kolo k= new Kolo(6);
         figref=k;
         System.out.println("Pole= "+ figref.pole());

         Trapez g= new Trapez(6,7,8);
         figref=g;
         System.out.println("Pole= "+ figref.pole());
    }
}
class Figure{
	public Figure(double d ,double d2){
		dim1=d;
		dim2=d2;
	}
	double dim1;
	double dim2;
	double pole(){
	System.out.println("Pole figury ");
	return 0.0;
	}
}
class Rectangle extends Figure{
	Rectangle(double a, double b){
		super(a,b);
	}
	double pole(){
		System.out.println("Pole prostok¹ta: ");
		return dim1*dim2;
	}

}
class Triangle extends Figure{
	Triangle(double a, double b){
		super(a,b);
	}
	double pole(){
		System.out.println("Pole trojk¹ta: ");
		return (dim1*dim2)/2;
	}

}
class Kolo  extends Figure{
		Kolo(double a){
		super(a,a);
	}
	double pole(){
		System.out.println("Pole kola: ");
		return Math.PI*(dim1*dim1);
	}
}

class Trapez extends Figure{

	Trapez(double a,double b, double c){
		super(a,b);
		h=c;
	}
	double h;
	double pole(){
		System.out.println("Pole trapezu: ");
		return ((dim1+dim2)*h)/2;
	}
}