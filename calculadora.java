import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("===Calculadora básica===");

        System.out.println("===Selecione: 1-Somar 2-Subtração 3-Multiplicar 4-Dividir===");
        System.out.println("Digite:" );
          var Calculo = scanner.nextInt();
            if(Calculo == 1){
             System.out.println("Calculo de SOMA" );
          }
          if(Calculo == 2){
             System.out.println("Calculo de SUBTRAÇÃO");
          }
          if(Calculo == 3){
             System.out.println("Calculo de MULTIPLICAÇÃO");
          }
          if(Calculo == 4){
             System.out.println("Calculo de DIVISÃO");
          }

          System.out.println("Digite os numeros");
          System.out.println("Primeiro Numero:");
           int N1 = scanner.nextInt();
          System.out.println("Segundo Numero:");
           int N2 = scanner.nextInt();

         
        
          if(Calculo == 1){
             int SOMA = N1 + N2;
             System.out.println( N1 + "+" + N2);
             System.out.println("Resultado:" + SOMA);
          }
          if(Calculo == 2){
             int SUB = N1 - N2;
             System.out.println( N1 + "-" + N2);
              System.out.println("Resultado:" + SUB);
          }
          if(Calculo == 3){
             int MULT = N1 * N2;
             System.out.println( N1 + "x" + N2);
              System.out.println("Resultado:" + MULT);
          }
          if(Calculo == 4){
             int DIV = N1 / N2;
             System.out.println( N1 + "/" + N2);
              System.out.println("Resultado:" + DIV);
          }
          
          

          
    }
}
