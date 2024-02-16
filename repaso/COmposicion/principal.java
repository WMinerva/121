package COmposicion;

import java.util.Scanner;

public class principal {
  public static void main(String[] args) {
  }

}

class Director {
  private String nombre;
  private int edad;

  public Director() {
    nombre = "Carlos";
    edad = 34;
  }

  public Director(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public void leer() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nombre: ");
    nombre = sc.next();
    System.out.print("Edad: ");
    edad = sc.nextInt();
  }

  public void mostrar() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getEdad() {
    return edad;
  }
}

class Institucion {
  private String nombre;
  private Director d;

  public Institucion() {
    d = new Director();
    nombre = "Juancito Pinto";
  }

  public void leer() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nombre: ");
    nombre = sc.next();
    d.leer();
  }

  public void mostrar() {
    System.out.println("Nombre: " + nombre);
    d.mostrar();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setD(Director d) {
    this.d = d;
  }

  public Director getD() {
    return d;
  }
}

class InstucionPrivada extends Institucion {
  private Double costo;

  public InstucionPrivada() {
    super();
    costo = 4000.50;
  }

  public void leer() {
    super.leer();
    Scanner sc = new Scanner(System.in);
    System.out.print("Costo: ");
    costo = sc.nextDouble();
  }

  public void mostrar() {
    super.mostrar();
    System.out.println("Costo: " + costo);
  }

  public Double getCosto() {
    return costo;
  }

  public void setCosto(Double costo) {
    this.costo = costo;
  }

}