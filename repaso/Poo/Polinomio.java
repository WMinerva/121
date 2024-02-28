public class Polinomio {
  // polinomio de 3 terminos
  // 4x^3 -5x^2 + 6
  private int nterm;
  private int p[] = new int[100];

  public Polinomio() {
    nterm = 3;
    p[1] = 4;
    p[2] = 3;
    p[3] = -5;
    p[4] = 2;
    p[5] = 6;
    p[6] = 0;
  }

  // polinomio de 2 terminos
  public Polinomio(int a, int b, int c, int d, int e, int f) {
    nterm = 2;
    p[1] = a;
    p[2] = b;
    p[3] = c;
    p[4] = d;
  }

  public void mostrar() {
    for (int i = 1; i <= nterm; i++) {
      System.out.print(p[i * 2 - 1] + "x^" + p[i * 2]);
    }
    System.out.println();
  }

}
