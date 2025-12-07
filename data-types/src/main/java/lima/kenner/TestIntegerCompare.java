package lima.kenner;

public class TestIntegerCompare {

  public static void main(String[] args) {
    /*
    Integer c = 1000; Integer d = 1000; c == d → FALSE

    Integer é objeto.

    == compara endereços de memória, não valores.

    Para valores fora do cache, o Java cria dois objetos diferentes, então:

    c != d → false.

    */
    int a = 1000;
    int b = 1000;
    System.out.println(a == b);

    /*
    int a = 1000; int b = 1000; a == b → TRUE

    Porque int é tipo primitivo.

    == compara valores, não referências.

    1000 == 1000 → true.

    */
    Integer c = 1000;
    Integer d = 1000;
    System.out.println(c == d);

    /*
    Integer e = 100; Integer f = 100; e == f → TRUE (pegadinha)

    A JVM mantém um cache de Integer para valores entre -128 e 127.

    Nesses casos, é sempre o mesmo objeto reutilizado.

    Então e e f apontam para o mesmo objeto, logo:

    e == f → true.

    */

    Integer e = 100;
    Integer f = 100;
    System.out.println(e == f);

  }
}
