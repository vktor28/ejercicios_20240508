import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    /*
     * EJERCICIO TIENDA ZAPATERIA (primera parte)
Tienes una zapatería con tres categorías de zapatos: Elegante, Casual,
Deporte (una clase cada uno).

Todos tienen las mismas características: marca, modelo, material, talla
y precio. De momento, no hay propiedades
distintas.
En el programa principal, crear al menos dos instancias de cada categoría
(zapatos en concreto).
Se listan todos los zapatos con sus características.
Primero se pregunta al usuario qué tipo de zapato quiere comprar, del tipo:
"Que tipo de zapatos quieres comprar?\n1-ELEGANTES\n2-CASUAL\n3-DEPORTIVOS"

Luego se pregunta al usuario qué modelo quiere comprar. Lo que vale ese modelo,
se va sumando al gastoTotal, y se sigue preguntando qué modelo quiere comprar
hasta que escribe ‘salir’.

Cuando sale, se le da el gasto total y un mensaje de ‘hasta la próxima’.
El gasto total también se puede ir mostrando dentro del bucle mientras se va sumando.


    */
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);
    ArrayList <Elegante> elegantes = new ArrayList<>();
    ArrayList <Casual> casuals = new ArrayList<>();
    ArrayList <Deporte> deportivos = new ArrayList<>();

    elegantes.add(new Elegante("Armani", "EA4507", "Piel", 38,350));
    elegantes.add(new Elegante("Prada", "PN50", "Piel", 36.5,295));
    casuals.add(new Casual("Adidas", "Samba", "Piel", 44,94.95));
    casuals.add(new Casual("Reebok", "Club C", "Piel", 44,79));
    deportivos.add(new Deporte("Nike", "Revolution", "Reciclado", 43,45.49));
    deportivos.add(new Deporte("Asics", "METASPEED", "Reciclado", 43, 89.95));
    System.out.println("BIENVENIDO A NUESTRA ZAPATERÍA");
    System.out.println("\nEstos son los modelos que tenemos en Stock.");
    separador();
    verZapatos(elegantes, deportivos, casuals);
    separador();
    boolean active = true;
    double precioTotal=0;
    while (active) {
        
    
    System.out.println("¿Qué tipo de zapatos buscaba?");
    System.out.println("- 1.ELEGANTES\n- 2.CASUAL\n- 3.DEPORTE");
    int modelUserType = teclado.nextInt();
    teclado.nextLine();
    separador();
    System.out.println("Actualmente tenemos los siguientes modelos:");
    String modelTypeName="";
    
    if(modelUserType==1) {
        verZapatosElegantes(elegantes);
    }
    else if(modelUserType==2) {
        verZapatosCasuals(casuals);
    }
    else if (modelUserType==3) {
        verZapatosDeportivos(deportivos);
    }
    System.out.println("\n¿Qué marca le interesaría?");
    String modelUser = teclado.nextLine();
    if(modelUserType==1) {
        for(int i=0; i<elegantes.size(); i++){
            if(modelUser.equals(elegantes.get(i).getMarca())){
            precioTotal+=elegantes.get(i).getPrecio();
            }
        }
    }    if(modelUserType==2) {
        for(int i=0; i<casuals.size(); i++){
            if(modelUser.equals(casuals.get(i).getMarca())){
            precioTotal+=casuals.get(i).getPrecio();
            }
        }
    }
    if(modelUserType==3) {
        for(int i=0; i<deportivos.size(); i++){
            if(modelUser.equals(deportivos.get(i).getMarca())){
            precioTotal+=deportivos.get(i).getPrecio();
            }
        }
    }
    separador();
    System.out.println("-->Producto añadido a su cesta.");
    separador();
    System.out.println("Quieres comprar más zapatos?(SI/NO)");
    if (teclado.nextLine().equalsIgnoreCase("SI")) {
       
    } else {
        active=false;
        separador();
        System.out.println("Total Cesta: " + precioTotal + "€");
        System.out.println("\n//GRACIAS POR SU VISITA\n");
    }
}

    }
    public static void separador(){
        System.out.println("\n-------\n");
    }
    public static void verZapatos(ArrayList<Elegante> elegantes,  ArrayList<Deporte> deportivos, ArrayList<Casual> casuals){
        for(Elegante x: elegantes){
            System.out.println("-->" + x.getMarca() + " | Modelo: " + x.getModelo() + " | Matrial: " + x.getMaterial() + " | Talla: " + x.getTalla() + " | Precio: " + x.getPrecio() + "€" );
        }
        for(Casual x: casuals){
            System.out.println("-->" + x.getMarca() + " | Modelo: " + x.getModelo() + " | Matrial: " + x.getMaterial() + " | Talla: " + x.getTalla() + " | Precio: " + x.getPrecio() + "€" );
        }
        for(Deporte x: deportivos){
            System.out.println("-->" + x.getMarca() + " | Modelo: " + x.getModelo() + " | Matrial: " + x.getMaterial() + " | Talla: " + x.getTalla() + " | Precio: " + x.getPrecio() + "€" );
        }
    }
    public static void verZapatosElegantes(ArrayList<Elegante> elegantes){
        for(Elegante x: elegantes){
            System.out.println("-->" + x.getMarca() + " | Modelo: " + x.getModelo() + " | Matrial: " + x.getMaterial() + " | Talla: " + x.getTalla() + " | Precio: " + x.getPrecio() + "€" );
        }
    }
    public static void verZapatosCasuals(ArrayList<Casual> casuals){
        for(Casual x: casuals){
            System.out.println("-->" + x.getMarca() + " | Modelo: " + x.getModelo() + " | Matrial: " + x.getMaterial() + " | Talla: " + x.getTalla() + " | Precio: " + x.getPrecio() + "€" );
        }
    }
    public static void verZapatosDeportivos(ArrayList<Deporte> deportivos){
        for(Deporte x: deportivos){
            System.out.println("-->" + x.getMarca() + " | Modelo: " + x.getModelo() + " | Matrial: " + x.getMaterial() + " | Talla: " + x.getTalla() + " | Precio: " + x.getPrecio() + "€" );
        }
    }
}


