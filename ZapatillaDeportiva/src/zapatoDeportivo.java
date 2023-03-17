public class zapatoDeportivo {
   ///1ero los atributos
    private String color;
private int talla;
private String material;
private String Modelo;

//constructor vacip
    public zapatoDeportivo() {
    }

    //GEtAndSet///
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

   ///metodo para mostrar datos y Sout
    public  void mostrarDatos(){

        System.out.println("color"+getColor());
        System.out.println("talla"+getTalla());
        System.out.println("material"+getMaterial());
        System.out.println("modelo"+getModelo());
    }
}