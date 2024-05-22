package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Cat --> Referenztyp (Klasse aus dem das Objekt entsteht)
        // cat1 --> Referenzvariable (Adresse des Objekts im Ram)

         Cat cat1 = new Cat();  // Instanziierung >> Objekt
         System.out.println("Blick von aussen " + cat1);  // Adresse des Objekts
        cat1.sayHi();

        System.out.println("------------------------------");

         Cat cat2 = new Cat();
         System.out.println("Blick von aussen " + cat2);
        cat2.sayHi();

   }

   void output(String outputStr){
    System.out.println(outputStr);

   }

}

