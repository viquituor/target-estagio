public class SOMA {

  static int INDICE = 12;
  static int SOMA = 0;
  static int K = 1;

  public static void main(String[] args) {

    while (K < INDICE) {
      K = K + 1;
      SOMA = SOMA + K;
      System.out.println(SOMA);
    }
  }
}
