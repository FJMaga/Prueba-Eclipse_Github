
import java.util.Scanner;
public class EjercicioBucles {
static Scanner leer = new Scanner(System.in);
static int valor;
public static void main(String[] args) {
// TODO code application logic here
do{
System.out.println("Opciones Disponibles:");
System.out.println("1.- Binario");
System.out.println("2.- Operaciones");
System.out.println("3.- Opción");
System.out.println("4.- Exit");
valor=leer.nextInt();
switch(valor){
case 1:
System.out.println("Introduce número 1");
int z = leer.nextInt();
System.out.println(binario(z));
break;
case 2:
System.out.println("Introduce número 1");
double x = leer.nextDouble();
System.out.println("Introduce número 2");
double y = leer.nextDouble();
System.out.println("Introduce operación");
String ope = leer.next();
System.out.println(x + ope + y + " " + " = " +
operaciones(x,y,ope));
break;
case 3:break;
case 4:
System.out.println("Adiós");
break;
default:
System.out.println("No ha introducido un valor válido");
}
}while(valor!=4);
}
public static double operaciones(double x1, double y1, String ope1){
double resultado=0;
switch(ope1){
case "+":
resultado=x1+y1;
break;
case "-":
resultado=x1-y1;
break;
case "*":
resultado=x1*y1;
break;
case "/":
resultado=x1/y1;
break;
case "%":
resultado=x1%y1;
break;
}
return resultado;
}
public static String binario(int x1){
int cociente=x1;
String resultado="";
do{
resultado = cociente%2+resultado;
cociente = cociente/2;
}while(cociente!=1);
return resultado = 1+resultado;
}
}
