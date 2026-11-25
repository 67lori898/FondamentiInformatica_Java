
import java.util.Scanner; 

public class QuadraticEquationTester{
    public static void main(String [] args){
        Scanner console =new Scanner(System.in);
        
        int coeffA; 
        int coeffB; 
        int coeffC; 
        QuadraticEquation myEquation= new QuadraticEquation(); 
      
        
        do{
         System.out.println("Inserisci il coefficiente del termine di secondo grado");
         coeffA=console.nextInt(); 


         System.out.println("Inserisci il coefficiente del termine di secondo grado");
         coeffB=console.nextInt(); 

         System.out.println("Inserisci il coefficiente del termine di secondo grado");
         coeffC=console.nextInt(); 

        }while(coeffA==0||coeffB==0);
            
        myEquation.setA(coeffA); 

        myEquation.setB(coeffB); 

        myEquation.setC(coeffC);

        if(myEquation.hasSolutions()){

        System.out.println(myEquation.getSolution1()); 

        System.out.println(myEquation.getSolution1()); 
        }
        else{
             System.out.println("L'equazione non ha soluzioni nei numeri reali"); 
        }

    }
}
