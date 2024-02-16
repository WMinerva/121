package Estructurado;

public class Poo {

  public static void main(String[] args) {
    Fruta A = new Fruta();
    A.mostrar();
  }

}

class Fruta {
  private String nombre, color;
  private int precio;

  Fruta() {
    nombre = "manzana";
    color = "rojo";
    precio = 2;
  }

  Fruta(String nombre, String color, int precio) {
    this.nombre = nombre;
    this.color = color;
    this.precio = precio;
  }

  public void mostrar() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Color: " + color);
    System.out.println("Precio: " + precio);
  }
}