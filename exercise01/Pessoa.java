import java.text.DecimalFormat;

public class Pessoa { 
  private double peso;
  private double altura;

  public Pessoa() { 
    this.peso = 0;
    this.altura = 0;
  };

  public Pessoa(double peso, double altura) { 
    this.peso = peso;
    this.altura = altura;
  };
  
  public double GetPeso() { 
    return this.peso;
  };

  public double GetAltura() { 
    return this.altura;
  };
  
  public void SetPeso(double peso) { 
    if (peso <= 0) { 
      System.out.println("Peso inválido.");
      return;
    };

    this.peso = peso;
  };

  public void SetAltura(double altura) { 
    this.altura = altura;
  };

  public double CalcularIMC() {
    return this.peso / Math.pow(this.altura, 2);
  };

  public void AvaliarIMC(double imc) { 
    var df = new DecimalFormat("#.00");

    System.out.println("Peso   => " + df.format(this.peso));
    System.out.println("Altura => " + df.format(this.altura));
    System.out.println("IMC    => " + df.format(imc));

    if (imc < 18.5) 
      System.out.println("Pessoa abaixo do peso.");
    else if (imc >= 18.5 && imc < 25)
      System.out.println("Pessoa com peso normal.");
    else if (imc >= 25 && imc < 30)
      System.out.println("Pessoa com pré-obesidade.");
    else if (imc >= 30 && imc < 35)
      System.out.println("Pessoa com obesidade de grau 1.");
    else if (imc >= 35 && imc < 40)
      System.out.println("Pessoa com obesidade de grau 2.");
    else 
      System.out.println("Pessoa com obesidade de grau 3.");
  };
}
