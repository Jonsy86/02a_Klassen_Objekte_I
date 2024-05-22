package com.cc.java;

public class App {
    
    public static void main(String[] args) {


        // Cat --> Referenztyp (Klasse aus dem das Objekt entsteht)
        // cat1 --> Referenzvariable (Adresse des Objekts im Ram)

         Cat cat1 = new Cat();  // Instanziierung >> Objekt
         System.out.println(cat1);  // Adresse des Objekts
        cat1.sayHi();

         Cat cat2 = new Cat();
         System.out.println(cat2);
        cat1.sayHi();






        
         // zwei Objekte erzeugen, keine Kommunikation
        // System.out.println(new Cat());
       // System.out.println(new Cat());
        
        
       



    }

   

}

