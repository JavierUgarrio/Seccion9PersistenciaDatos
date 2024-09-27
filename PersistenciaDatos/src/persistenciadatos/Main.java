package persistenciadatos;
import java.util.*;
import static persistenciadatos.ManejoArchivos.*;
public class Main {
    public static void main(String[] args) {
      
          //ruta relativa
          //crearArchivo("archivos\\Hola Archivo.txt");
          crearArchivo("archivos\\Segundo Archivo.txt");
          
          escribirArchivo("archivos\\Hola Archivo.txt", "Hola Mundo desde Java");
          escribirArchivo("archivos\\Hola Archivo.txt", "Hola Mundo desde Java");
          
          leerArchivo("archivos\\Hola Archivo.txt");
//        //List es una interface 
//        List lista1 = new ArrayList();
//        lista1.add(5);
//        lista1.add("Joselito");
//        lista1.add(true);
//        System.out.println(lista1);
//        
//        for(Object dato:lista1){
//            System.out.println(dato);
//        }
////        //funcion lamda
//        lista1.forEach(dato->{
//            System.out.println(dato);
//        });
//        
//        System.out.println(lista1.get(2));
//        System.out.println(lista1.set(0, "Javier"));
//        System.out.println(lista1);
//        System.out.println(lista1.remove(0));
//        
//        System.out.println(lista1);
//        //elimina toda la lista el metodo clear
//        lista1.clear();
//        System.out.println(lista1);
//
////SET te devuelve en un orden aleatorio, no se puede repetir el mismo dato dos veces
//
//        Set dias = new HashSet();
//        dias.add("lunes");
//        dias.add("martes");
//        dias.add("miercoles");
//        dias.add("jueves");
//        
//        dias.forEach(dia ->
//        System.out.println(dia));
//        
////        //hay que indicar el nombre de elemento para eliminarlo
//        dias.remove("jueves");
//        System.out.println(dias);
//        dias.clear();
//        System.out.println(dias);
//
////Map
//
//        Map numeros = new HashMap();
//        numeros.put(0, "uno");
//        numeros.put(1,15);
//        numeros.put(2, 4);
//        numeros.put(3,"cinco");
//        
//        System.out.println(numeros);
//        System.out.println(numeros.get(2));
//        
//        //Se puede iterar utilizando keySet que es el indice o values que son los valores
//        for(Object valores: numeros.values()){
//            System.out.println(valores);
//        }
//        
//        numeros.remove(1);
//        System.out.println(numeros);
    }
    
}
