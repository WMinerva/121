package POO;

public class Venta {
  private String nombre;
  private int codigo, cantidad;

  public Venta(String nombre, int codigo, int cantidad) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.cantidad = cantidad;
  }

  // constructor por defecto
  public Venta() {
    this.nombre = "";
    this.codigo = 0;
    this.cantidad = 0;
  }

  // getter y setter
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  // mostar datos
  public void mostrarDatos() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Código: " + codigo);
    System.out.println("Cantidad: " + cantidad);
  }

}
