package lima.kenner;

public class BasicSintax {

  // Variáveis e métodos: Convenção de nomenclatura em camelCase
  private String nomePessoa;

  // Constantes: Convenção de nomenclatura em MAIUSCULAS_SEPARADAS_POR_SUBLINHADO
  private static final int IDADE_PESSOA = 1;

  // Classes e interfaces: Convenção de nomenclatura em PascalCase
  private static class ValidadorIdade {

    public static boolean isMaiorIdade(int idade) {
      return idade >= 18;
    }
  }

  private void exibirInformacoes() {
    System.out.println("Nome: " + nomePessoa);

    boolean maiorIdade = ValidadorIdade.isMaiorIdade(IDADE_PESSOA);

    System.out.println("Maior de idade: " + maiorIdade);

  }

}
