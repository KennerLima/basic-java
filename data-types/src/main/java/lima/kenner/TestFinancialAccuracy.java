package lima.kenner;

public class TestFinancialAccuracy {

  public static void main(String[] args) {

    double valor1 = 0.1;
    double valor2 = 0.2;
    double somaDouble = valor1 + valor2;

    System.out.println("Usando double:");
    System.out.println("0.1 + 0.2 = " + somaDouble);
    System.out.println("Comparação com 0.3: " + (somaDouble == 0.3));

    java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("0.1");
    java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal("0.2");
    java.math.BigDecimal somaBigDecimal = bigDecimal1.add(bigDecimal2);

    System.out.println("\nUsando BigDecimal:");
    System.out.println("0.1 + 0.2 = " + somaBigDecimal);
    System.out.println("Comparação com 0.3: " + somaBigDecimal.equals(new java.math.BigDecimal("0.3")));
  }
}
