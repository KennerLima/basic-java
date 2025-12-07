package lima.kenner;

public class TestSilentOverflow {
    public static void main(String[] args) {

      Integer maxNumber = Integer.MAX_VALUE;

      System.out.println("O valor máximo de Integer é: " + maxNumber);

      System.out.println("O valor máximo de Integer mais 1 dá: " + (maxNumber + 1));

      /*
      Isso ocorre porque o valor excede o limite máximo de Integer,
      causando um overflow que resulta no valor mínimo de Integer.

      Quando um overflow ocorre, o valor "dá a volta" e começa novamente
      a partir do valor mínimo representável pelo tipo de dado.

      Antes:
      Binário: 01111111 11111111 11111111 11111111
      Inteiro: 2147483647

      Depois de adicionar 1 → ele vira:
      Binário: 10000000 00000000 00000000 00000000
      Inteiro: -2147483648

      O bit mais à esquerda é o bit de sinal, onde 0 indica positivo e 1 indica negativo.
      */
    }
}