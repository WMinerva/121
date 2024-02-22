package POO;

import java.util.Vector;
import java.util.Scanner;

public class principal {
  public static void main(String[] args) {
    Vector<Producto> A = new Vector<Producto>();
    Producto p1 = new Producto(1, 100, 10, "Producto 1");
    Producto p2 = new Producto(2, 200, 20, "Producto 2");
    Producto p3 = new Producto(3, 300, 30, "Producto 3");
    Producto p4 = new Producto(4, 400, 40, "Producto 4");
    Producto p5 = new Producto(5, 500, 50, "Producto 5");
    Producto p6 = new Producto(6, 600, 60, "Producto 6");
    Producto p7 = new Producto(7, 700, 70, "Producto 7");
    A.add(p1);
    A.add(p2);
    A.add(p3);
    A.add(p4);
    A.add(p5);
    A.add(p6);
    A.add(p7);
    // 1.
    System.out.println("======= ====== PRODUCTOS ========");
    mostrar(A);
    // 2. Mostrar los productos de mayor precio
    System.out.println("======= ====== ========");
    System.out.println("Producto de mayor precio");
    mayorPrecio(A);
    // 3.Implementar el vector Ventas
    Vector<Venta> B = new Vector<Venta>();
    Venta v1 = new Venta("Venta 1", 1, 10);
    Venta v2 = new Venta("Venta 2", 2, 20);
    Venta v3 = new Venta("Venta 3", 3, 30);
    Venta v4 = new Venta("Venta 4", 4, 40);
    Venta v5 = new Venta("Venta 5", 5, 50);
    Venta v6 = new Venta("Venta 6", 6, 60);
    Venta v7 = new Venta("Venta 7", 1, 70);
    Venta v8 = new Venta("Venta 8", 1, 80);
    B.add(v1);
    B.add(v2);
    B.add(v3);
    B.add(v4);
    B.add(v5);
    B.add(v6);
    B.add(v7);
    B.add(v8);
    // Mostrar los datos de las ventas
    System.out.println("======= ====== ========");
    System.out.println("Datos de las ventas");
    mostrarVentas(B);
    // 4.Mostrar los productos que no se vendieron
    System.out.println("======= ======NO VENDIDOS====== ========");
    noVendidos(A, B);
    // 5. Mostrar los productos que se vendieron mas de una vez

    System.out.println("======= ======MAS DE UNA VEZ====== ========");
    masDeUnaVez(A, B);
  }

  public static void masDeUnaVez(Vector<Producto> A, Vector<Venta> B) {
    int contador = 0;
    for (int i = 0; i < A.size(); i++) {
      for (int j = 0; j < B.size(); j++) {
        if (A.get(i).getCodigo() == B.get(j).getCodigo()) {
          contador++;
        }
      }
      if (contador > 1) {
        A.get(i).mostrar();
      }
      contador = 0;
    }
  }

  public static void noVendidos(Vector<Producto> A, Vector<Venta> B) {
    boolean vendido = false;
    for (int i = 0; i < A.size(); i++) {
      for (int j = 0; j < B.size(); j++) {
        if (A.get(i).getCodigo() == B.get(j).getCodigo()) {
          vendido = true;
        }
      }
      if (vendido == false) {
        A.get(i).mostrar();
      }
      vendido = false;
    }
  }

  public static void mostrar(Vector<Producto> A) {
    for (int i = 0; i < A.size(); i++) {
      A.elementAt(i).mostrar();
    }
  }

  public static void mayorPrecio(Vector<Producto> A) {
    int mayor = 0;
    for (int i = 0; i < A.size(); i++) {
      if (A.get(i).getPrecio() > mayor) {
        mayor = A.get(i).getPrecio();
      }
    }
    for (int i = 0; i < A.size(); i++) {
      if (A.get(i).getPrecio() == mayor) {
        A.get(i).mostrar();
      }
    }
  }

  public static void mostrarVentas(Vector<Venta> B) {
    for (int i = 0; i < B.size(); i++) {
      B.get(i).mostrarDatos();
    }
  }

}
