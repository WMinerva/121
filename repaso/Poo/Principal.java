package Poo;

public class Principal {
  public static void main(String[] args) {
    // Pizarra p1 = new Pizarra();
    // p1.mostrar();
    // Pizarra p2 = new Pizarra("3x4", "plastico", "blanco", 456);
    // p2.mostrar();
    // if (p1.getColor().equals(p2.getColor())) {
    // System.out.println("Igual color");
    // } else {
    // System.out.println("Diferente color");
    // }
    // System.out.println("===========");
    // Cuaderno c1 = new Cuaderno();
    // c1.mostrar();
    Polinomio p1 = new Polinomio();
    Polinomio p2 = new Polinomio(3, 4, 5, 6, 7, 8);
    p1.mostrar();
    p2.mostrar();
    Polinomio p3 = new Polinomio();
    Polinomio p4 = new Polinomio(3, 4, 5, 6, 7, 8);
    p3.mostrar();
    p4.mostrar();

  }

}
