package persistenciadatos;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        //List es una interface 
        List lista1 = new ArrayList();
        lista1.add(5);
        lista1.add("Joselito");
        lista1.add(true);
        System.out.println(lista1);
        
        for(Object dato:lista1){
            System.out.println(dato);
        }
        //funcion lamda
        lista1.forEach(dato->{
            System.out.println(dato);
        });
        
        System.out.println(lista1.get(2));
        System.out.println(lista1.set(0, "Javier"));
        System.out.println(lista1);
        System.out.println(lista1.remove(0));
        
        System.out.println(lista1);
    }
    
}
