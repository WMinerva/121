import java.util.Scanner;
import java.util.Vector;

@SuppressWarnings("resource")

public class EjerUno {
  // Procedimiento y funciones aqui
  public static void llenado1(Vector<String> v, int n) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      v.add(sc.next());
    }
  }

  public static void llenado2(Vector<Integer> v, int n) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      v.add(sc.nextInt());
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Vector<String> A = new Vector<>();
    Vector<Integer> B = new Vector<>();
    // A.add("uno");
    // A.add("dos");
    // A.add("tres");
    // A.addElement("cuatro");
    // A.addElement("cinco");
    // System.out.println(A);
    // System.out.println(A.contains("xxx"));
    // A.insertElementAt("diez", 0);
    // System.out.println(A);
    // System.out.println("======= ======== =======");

    // Vector<Integer> B = new Vector<>();
    // B.add(1);
    // B.add(2);
    // B.add(3);
    // B.addElement(4);
    // B.addElement(5);
    // System.out.println(B);
    // System.out.println(B.contains(4));
    // B.insertElementAt(10, 0);
    // System.out.println(B);
    int n = sc.nextInt();
    // for (int i = 0; i < n; i++) {
    // A.add(sc.next());
    // }
    llenado1(A, n);
    llenado2(B, n);

    System.out.println(A);
    System.out.println(B);
    int x = sc.nextInt();
    if (!B.contains(x)) {
      B.add(x);
    }

    System.out.println(B);
  }

}
