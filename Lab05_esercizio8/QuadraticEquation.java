
public class QuadraticEquation {

    int a;
    int b;
    int c;
    double delt;
    double sol1;
    double sol2;

    public QuadraticEquation() {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    //metodi di accesso (getter)

    /*
       Restituisce la prima soluzione dell'equazione
       quadratica.
    */
    public double getSolution1() {

        if (a == 0) {
            return Double.NaN;
        }

        // Formula ridotta se b è pari
        if (b % 2 == 0) {

            this.delt = Math.pow(b / 2.0, 2) - a * c;

            if (this.delt >= 0) {
                this.sol1 = (-b / 2.0 + Math.sqrt(this.delt)) / a;
                return this.sol1;
            }

        } else {

            this.delt = Math.pow(b, 2) - 4 * a * c;

            if (this.delt >= 0) {
                this.sol1 = (-b + Math.sqrt(this.delt)) / (2.0 * a);
                return this.sol1;
            }
        }

        return Double.NaN;
    }


    /*
       Restituisce la seconda soluzione dell'equazione
       quadratica.
    */
    public double getSolution2() {

        if (a == 0) {
            return Double.NaN;
        }

        // Formula ridotta se b è pari
        if (b % 2 == 0) {

            this.delt = Math.pow(b / 2.0, 2) - a * c;

            if (this.delt >= 0) {
                this.sol2 = (-b / 2.0 - Math.sqrt(this.delt)) / a;
                return this.sol2;
            }

        } else {

            this.delt = Math.pow(b, 2) - 4 * a * c;

            if (this.delt >= 0) {
                this.sol2 = (-b - Math.sqrt(this.delt)) / (2.0 * a);
                return this.sol2;
            }
        }

        return Double.NaN;
    }
    //metodi modificatori
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public void setC(int c){
       this.c=c; 
    }

    /*
       Restituisce false se l'equazione non ha soluzioni reali.
    */
    public boolean hasSolutions() {
         
        if (this.a == 0 || this.b == 0) {
         return false;
        }

        if (this.b % 2 == 0) {
            this.delt = Math.pow(b / 2.0, 2) - a * c;
        } else {
            this.delt = Math.pow(b, 2) - 4 * a * c;
        }

        return this.delt >= 0;
    }


}
