import java.util.Scanner;

public class CalculadoraIMCView { 
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);    

    System.out.print("Digite o peso: ");
    double peso = sc.nextDouble();

    System.out.print("Digite a altura: ");
    double altura = sc.nextDouble();
    
    var pessoa = new Pessoa(peso, altura);

    double imc = pessoa.CalcularIMC();
    pessoa.AvaliarIMC(imc);

    System.out.println("Fim do programa.");
  };
}
