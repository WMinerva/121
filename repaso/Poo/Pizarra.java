class Pizarra {
  private String tamaño, material, color;
  private int codigo;

  public Pizarra() {
    tamaño = "2x3";
    material = "acrilico y madera";
    color = "blanco";
    codigo = 123;
  }

  public Pizarra(String a, String b, String c, int d) {
    tamaño = a;
    material = b;
    color = c;
    codigo = d;
  }

  public void mostrar() {
    System.out.println("Tamaño: " + tamaño);
    System.out.println("Material: " + material);
    System.out.println("Color: " + color);
    System.out.println("Codigo: " + codigo);
  }

  public String getTamaño() {
    return tamaño;
  }

  public void setTamaño(String tamaño) {
    this.tamaño = tamaño;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
}

class Cuaderno {
  private String marca, tamaño;
  private double precio;

  public Cuaderno() {
    marca = "Norma";
    tamaño = "carta";
    precio = 5.00;
  }

  public Cuaderno(String a, String b, double c) {
    marca = a;
    tamaño = b;
    precio = c;
  }

  public void mostrar() {
    System.out.println("Marca: " + marca);
    System.out.println("Tamaño: " + tamaño);
    System.out.println("Precio: " + precio);
  }

}
