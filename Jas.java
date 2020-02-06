
package jas;


public class Jas {


    public static void main(String[] args) {
       
        
int N=100;
int przeniesienie=0;
int d;

int[] A = new int[N];
int[] B = new int[N];

Dzielenie a = new Dzielenie();
a.czytaj(A,N);
a.czytaj(B,N);

for(int i=0;i<N;i++){
	A[i]=A[i]+B[i]+przeniesienie;
	przeniesienie=A[i]/10;
	A[i]=A[i]%10;	
	}
		
for(int i=N-1;i>=0;i--){
d=przeniesienie*10+A[i];
	A[i]=d/2;	
	przeniesienie=d%2;
	}
	
System.out.println();
System.out.println("Malgosia ma : ");
		
Dzielenie b = new Dzielenie();
b.drukuj(A,N);		

        
    }
    
    
class Dzielenie
{

    void czytaj(int[] CL, int N){
    //int[] CL = new int[i];
    //
    //int[] CN =new int[i];
    String liczs;
    int dl = liczs.length(); 
    for(int i=0;i<dl;i++) {
            CL[i]=(int)liczs[dl-1-i]-48;
    }
    }


    void drukuj(int[] L, int n){
    int flaga=0;

    for(int i=n-1; i>0; i--){
    if(flaga==1)
        System.out.println(L[i]);
    else
        if(L[i]>0){
        flaga=1;
            System.out.println(L[i]);
            }
      }
    System.out.println(L[0]);
    }
    }

}





