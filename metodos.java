package calculadora;
/* @author Dinousuario
 */
class metodos {

    int sumar(int n1, int n2) {
        int resultado = 0;
        resultado = n1+n2;
        return resultado;
    }

    int restar(int n1, int n2) {
        int resultado = 0;
        resultado = n1-n2;
        return resultado;
    }

    int multiplicar(int n1, int n2) {
        int resultado = 0;
        resultado = n1*n2;
        return resultado;
    }

    int dividir(int n1, int n2) {
        int resultado = 0;
        resultado = n1/n2;
        return resultado;
    }

    int potenciar(int n1, int n2) {
        int resultado = 0;
        resultado = (int)Math.pow(n1,n2);
        return resultado;
    }

    double raizcuadrada(double n3) {
        double resultado2 = 0;
        resultado2 = (double)Math.sqrt(n3);
        return resultado2;
    }

    int AreaRectangulo(int n1, int n2) {
        int resultado = 0;
        resultado = n1*n2;
        return resultado;    }

    
    double Areacircunferencia(double n3) {
        double resultado2 = 0;
        resultado2 = (Math.PI * Math.pow(n3, 2)); 
        return resultado2;
    }
    
}
