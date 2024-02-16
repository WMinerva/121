package Estructurado;

//generar 0, 1, 0, 1,...
public class generarCerosUnos {
  public static void main(String[] args) {
    int n = 11;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.print("1");
      } else {
        System.out.print("0");
      }
      if (i < n) {
        System.out.print(", ");
      } else {
        System.out.println(" ");
      }
    }

    System.out.println(" ");
    // generar 1, 1, 2, 2, 3, 3, 4, 4, ...
    for (int i = 1; i <= n / 2; i++) {
      System.out.print(i + ", " + i + ", ");
    }

  }

}
