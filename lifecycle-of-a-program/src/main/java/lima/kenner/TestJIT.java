package lima.kenner;

public class TestJIT {
  public static void main(String[] args) {
    // Warm-up: Rodar o método muitas vezes para ativar o JIT
    for (int i = 0; i < 10; i++) {
      long inicio = System.nanoTime();
      calculoPesado();
      long fim = System.nanoTime();
      System.out.println("Rodada " + i + ": " + (fim - inicio) + " ns");
    }
  }

  // Método que será o "Hot Spot"
  public static double calculoPesado() {
    double result = 0;
    // Loop grande o suficiente para o processador sentir
    for (int i = 0; i < 2_000_000; i++) {
      result += Math.sqrt(i) * Math.sin(i);
    }
    return result;
  }
}