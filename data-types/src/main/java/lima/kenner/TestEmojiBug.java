package lima.kenner;

public class TestEmojiBug {

  public static void main(String[] args) {
    String texto = "💩";
    System.out.println("Tamanho (length): " + texto.length());
    System.out.println("É apenas 1 caractere? " + (texto.length() == 1));

    int codePointCount = texto.codePointCount(0, texto.length());
    System.out.println("Número de pontos de código (code points): " + codePointCount);
    System.out.println("É apenas 1 ponto de código? " + (codePointCount == 1));
  }
}
