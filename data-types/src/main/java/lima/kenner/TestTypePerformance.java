package lima.kenner;

public class TestTypePerformance {

  public static void main(String[] args) {
    final int ITERACOES = 10_000_000;

    // Teste com tipos primitivos
    long inicioPrimitivo = System.nanoTime();
    int somaPrimitivo = 0;
    for (int i = 0; i < ITERACOES; i++) {
      somaPrimitivo += i;
    }
    long fimPrimitivo = System.nanoTime();
    System.out.println("Soma com tipos primitivos: " + somaPrimitivo);
    System.out.println("Tempo com tipos primitivos: " + (fimPrimitivo - inicioPrimitivo) + " ns");

    // Teste com tipos wrapper
    long inicioWrapper = System.nanoTime();
    Integer somaWrapper = 0;
    for (int i = 0; i < ITERACOES; i++) {
      somaWrapper += i; // Autoboxing ocorre aqui
    }
    long fimWrapper = System.nanoTime();
    System.out.println("Soma com tipos wrapper: " + somaWrapper);
    System.out.println("Tempo com tipos wrapper: " + (fimWrapper - inicioWrapper) + " ns");
  }
}
