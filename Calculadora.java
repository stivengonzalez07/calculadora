package calculadora;

/**
 * @author Dinousuario
 */
import java.util.Scanner;
public class Calculadora {


    public static void main(String[] args) {
        metodos operacion = new metodos();
        Scanner entrada = new Scanner(System.in);
        int n1, n2, resultado, opcion;
        double resultado2, n3;
        boolean opc = true;
        
        while(opc){
           System.out.println("XXXXXXxxxxxxxxxxxxxxxxxxxxxxxxxXXXXXX");
           System.out.println("XXXXXX   MENU DE OPERACIONES   XXXXXX");
           System.out.println("XXXXXXxxxxxxxXXXxxxxxxxXXXxxxxxXXXXXX");
           System.out.println("XXXXXXX 1. SUMAR               XXXXXX");
           System.out.println("XXXXXXX 2. RESTAR              XXXXXX");
           System.out.println("XXXXXXX 3. MULTIPLICAR         XXXXXX");
           System.out.println("XXXXXXX 4. DIVIDIR             XXXXXX");
           System.out.println("XXXXXXX 5. POTENCIAR           XXXXXX");
           System.out.println("XXXXXXX 6. RAIZ CUADRADA       XXXXXX");
           System.out.println("XXXXXXX 7. AREA RECTANGULO     XXXXXX");
           System.out.println("XXXXXXX 8. AREA CIRCUNFERENCIA XXXXXX");
           System.out.println("XXXXXXX 9. LIBRE               XXXXXX");
           System.out.println("XXXXXXX 0. SALIR               XXXXXX");
           System.out.println("XXXXXXX SELECCIONE UNA OPCIÒN  XXXXXX");
           
           opcion = entrada.nextInt();
           
           if (opcion == 0){
               System.out.println("Cerrando...");
           break;
           } else {
               switch (opcion) {
                case 1 :
                       System.out.println("Ingrese el primer numero");
                       n1 = entrada.nextInt();
                       System.out.println("Ingrese el segundo numero");
                       n2 = entrada.nextInt();
                       resultado= operacion.sumar(n1,n2);
                       System.out.println("El resultado de la suma es: "+resultado);
                       break;
                       
                case 2: 
                       System.out.println("Ingrese el primer numero");
                       n1 = entrada.nextInt();
                       System.out.println("Ingrese el segundo numero");
                       n2 = entrada.nextInt();
                       resultado= operacion.restar(n1,n2);
                       System.out.println("El resultado de la resta es: "+resultado);
                       break;
                       
                case 3 : 
                       System.out.println("Ingrese el primer numero");
                       n1 = entrada.nextInt();
                       System.out.println("Ingrese el segundo numero");
                       n2 = entrada.nextInt();
                       resultado= operacion.multiplicar(n1,n2);
                       System.out.println("El resultado de la multiplicacion es: "+resultado);
                       break;
                       
                case 4 : 
                       System.out.println("Ingrese el primer numero");
                       n1 = entrada.nextInt();
                       System.out.println("Ingrese el segundo numero");
                       n2 = entrada.nextInt();
                       resultado= operacion.dividir(n1,n2);
                       System.out.println("El resultado de la divicion es: "+resultado);
                       break;
                       
                case 5 : 
                       System.out.println("Ingrese el primer numero");
                       n1 = entrada.nextInt();
                       System.out.println("Ingrese el segundo numero");
                       n2 = entrada.nextInt();
                       resultado= operacion.potenciar(n1,n2);
                       System.out.println("El resultado de la potenciacion es: "+resultado);
                       break;
                       
                case 6 : //raiz cuadrada
                       System.out.println("Ingrese el numero");
                       n3 = entrada.nextDouble();
                       resultado2= operacion.raizcuadrada(n3);
                       System.out.println("El resultado de la raiz es: "+resultado2);
                       break;
                case 7 : //AreaRectangulo
                       System.out.println("Ingrese la base");
                       n1 = entrada.nextInt();
                       System.out.println("Ingrese la altura");
                       n2 = entrada.nextInt();
                       resultado= operacion.AreaRectangulo(n1,n2);
                       System.out.println("El area del rectangulo es: "+resultado);
                       break;
                       
                case 8 : //area de una circunferencia
                    
                       System.out.println("Ingrese el radio");
                       n3 = entrada.nextDouble();
                       resultado2= operacion.Areacircunferencia(n3);
                       System.out.println("El area del circulo es: "+resultado2);
                       break;
                    
                    
                default:
                    System.out.println("Escoja una opcion valida...");
                       
                       
                   }                  
               }
           }
        } 
    } 
    

