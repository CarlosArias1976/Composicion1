/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion1;
import java.util.*;

/*
 *
 * @author carlo
 */
class Pagina{
    //ATRIBUTOS DE INSTANCIA
    private String contenido;
    private int numero;
    //CONSTRUCCTOR CON PARAMETROS

    public Pagina(String contenido, int numero) {
        this.contenido = contenido;
        this.numero = numero;
    }
    //METODOS DE INSTANCIA

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
class Libro{
    //ATRIBUTOS
    private String titulo;
    private long isbn;
    private String autor;
    private int anioPublicacion;
    //ATRIBUTOS REPRESENTANDO LA RELACIÓN DE COMPOSICIÓN
    private Pagina[] paginas;
    private int numeroPaginas;

    //CONSTRUCTOR
    public Libro(String titulo, long isbn, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        
        //RESERVAMOS ESPACIO EN MEMORIA PARA EL OBJETO "array"
        this.paginas=new Pagina[999];
        //RESERVAMOS ESPACIO EN MEMORIA PARA LAS Páginas
        for(int i=0;i<999;i++){
            this.paginas[i]=new Pagina("",0);
        }
        this.numeroPaginas=0;
    }
    //METODO DE INSTANCIA
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public long getIsbn() {
        return this.isbn;
    }

    public void setIsbn(long nuevo_Isbn) {
        this.isbn = nuevo_Isbn;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String nuevo_autor) {
        this.autor =nuevo_autor;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int nuevo_anioPublicacion) {
        this.anioPublicacion =nuevo_anioPublicacion;
    }
    //MÉTODOS PARA TRABAJAR CON LA CLASE DE COMPOSICIÓN
    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }
    public void AñadirPagina(Pagina nueva_Pagina){
        if(this.numeroPaginas<999){
            this.paginas[this.numeroPaginas]=nueva_Pagina;
            this.numeroPaginas++;
        }
    }
    
    public Pagina getPaginaNumero(int numero_Pagina){
        for(int i=0;i<this.numeroPaginas;i++){
            if(this.paginas[i].getNumero()==numero_Pagina){
                return this.paginas[i];
            }
        }
        return null;
    }
      
     
    public void CorreccionBaseDatos(){
        for(int i=0;i<this.numeroPaginas;i++){
            System.out.println(paginas[i].getContenido());
            System.out.println("Pagina número: "+paginas[i].getNumero());
        }
    }
}
    
    

public class Composicion1 {
   
    public static void main(String[] args) {
        // DECLARACION Y DEFINICION DE OBJETOS
        LogoAutomotriz abrir = new LogoAutomotriz();
        abrir.setVisible(true);
        
        
        System.out.println("UNIVERDIDAD DE LAS FUERZAS ARMADAS ");
        System.out.println("                ESPE               ");
        System.out.println("           SEDE LATACUNGA          ");
        System.out.println("PROGRAMACION");
        System.out.println("DOCENTE: ING LUIS GUERRA");
        System.out.println("ALUMNO: CARLOS ARIAS");
        System.out.println("Ejercicio28 AriasGalloCarlosAnibal Automotriz [7450]");
        
        
        Libro Controles_Instrumentos = new Libro("Arranque y apagado del motor",1234345296,"Chevrolet",2020);        
        Pagina pagina1=new Pagina("Asegurese de que todos los interruptores estén en la posicion desactivada",4);
        Pagina pagina2=new Pagina("Gire interruptor de arranque a posicion ON verifique Luces y Combustible normal",5);
        
        //PASAMOS AL OBJETO LibroLOS OBJETOS DEL TIPO Pagina
        System.out.println("El libro: "+Controles_Instrumentos.getTitulo());
        System.out.println("Isbn: "+Controles_Instrumentos.getIsbn());
        System.out.println("Autor: "+Controles_Instrumentos.getAutor());
        System.out.println("Fecha Publicación: "+
                Controles_Instrumentos.getAnioPublicacion());
        Controles_Instrumentos.AñadirPagina(pagina1);
        Controles_Instrumentos.AñadirPagina(pagina2);
        Controles_Instrumentos.CorreccionBaseDatos();
        }
    
    }
    

