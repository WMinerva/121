package POO;

import java.util.Vector;
import java.util.Scanner;

public class Producto {
  private int codigo, precio, stock;
  private String nombre;

  // constructor con parametros
  public Producto(int a, int b, int c, String d) {
    codigo = a;
    precio = b;
    stock = c;
    nombre = d;
  }

  // getters y setters
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void mostrar() {
    System.out.println("Codigo: " + codigo);
    System.out.println("Nombre: " + nombre);
    System.out.println("Precio: " + precio);
    System.out.println("Stock: " + stock);
  }
}
