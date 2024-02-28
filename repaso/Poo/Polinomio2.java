public class Polinomio2 {
  private int nterm;
  private int p[][] = new int[100][3];

  // 4x^3-5x^2+6
  public Polinomio2() {
    nterm = 3;
    p[0][0] = 4;
    p[0][1] = 3;
    p[1][0] = -5;
    p[1][1] = 2;
    p[2][0] = 6;
    p[2][1] = 0;
  }

  public Polinomio2(int a, int b, int c, int d, int e, int f) {
    nterm = 2;
    p[0][0] = a;
    p[0][1] = b;
    p[1][0] = c;
    p[1][1] = d;
  }

  public void mostrar() {
    for (int i = 0; i < nterm; i++) {
    }
    System.out.println();
  }
}
