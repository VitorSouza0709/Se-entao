import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    double Altura = sc.nextDouble();
    double massa = sc.nextDouble();
    double imc = massa / (Altura * Altura);
    System.out.printf("O seu IMC é de %f kg/m² %n", imc);
    
if(25 < imc && imc < 29.9) { 
  System.out.println("Você está acima do peso. ");
}
 if (30< imc && imc < 34.9)  {
   System.out.println("Você apresenta obesidade de Grau I");
 }
 if (35< imc && imc < 40) {
   System.out.println("Você apresenta obesidade de Grau II");
 }
 if (imc > 40) {
   System.out.println("Você apresenta obesidade de Grau III");
 }
 if (imc < 18.5 && imc < 24.9) {
   System.out.println("Você está com peso normal");
 }
  if (imc < 17 && imc < 18.4) {
    System.out.println("Você está abaixo do peso");
  }
  if (imc < 16.9) {
    System.out.println("Você está muito abaixo do peso");
  }
    
    sc.close();
  }

  
}