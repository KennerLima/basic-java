package lima.kenner;

public class TestLazyLoading {
  public static void main(String[] args) {
    System.out.println("1. Início do main");

    System.out.println("2. Declarando variável (sem instanciar)...");
    ClassePesada ref = null; // A classe NÃO deve ser carregada aqui

    System.out.println("3. Pausa de 2 segundos...");
    try { Thread.sleep(2000); } catch (Exception ignored) {}

    System.out.println("4. Acessando a classe pela primeira vez (Instanciando)...");
    new ClassePesada(); // AQUI deve ocorrer o carregamento e inicialização

    System.out.println("5. Instanciando segunda vez...");
    new ClassePesada(); // O bloco estático NÃO deve rodar de novo
  }
}

class ClassePesada {
  static {
    System.out.println("[JVM] >> ClassePesada: Bloco Estático Executado (Inicialização)");
  }

  public ClassePesada() {
    System.out.println("[JVM] >> ClassePesada: Construtor Executado");
  }
}
