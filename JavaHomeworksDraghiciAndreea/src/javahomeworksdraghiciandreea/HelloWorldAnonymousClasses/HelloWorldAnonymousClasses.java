/*
 * anonymous classes replaced them with normal classes
 */
package javahomeworksdraghiciandreea.HelloWorldAnonymousClasses;

/**
 *
 * @author Andreea
 */
public class HelloWorldAnonymousClasses {
    
      //Inner interface HelloWorld

    interface HelloWorld {
        public void greet();


        public void greetSomeone(String someone);


    }

    // Method sayHello prints

    public void sayHello() {


        // Local class EnglishGreetings implemented in the method sayHello()
        
        class EnglishGreeting implements HelloWorld {

            String name = "world";


            @Override
            public void greet() {

                greetSomeone("world");

            }


            @Override
            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Hello, " + name + "!");

            }

        }         
        
        
        // Local class FrenchGreeting implemented in the method sayHello()
        
        class FrenchGreeting implements HelloWorld {

            String name = "tout le monde";
            

            @Override
            public void greet() {

                greetSomeone("tout le monde");

            }


            @Override
            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Salut, " + name);

            }
            
        }
        
        
        // Local class SpanishGreeting implemented in the method sayHello()

        class SpanishGreeting implements HelloWorld {

            String name = "mundo";
            

            @Override
            public void greet() {

                greetSomeone("mundo");

            }

            @Override
            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Hola, " + name + "!");

            } 

        }
        
               
        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new FrenchGreeting();
        HelloWorld spanishGreeting =  new SpanishGreeting();
        
        
        englishGreeting.greet();

        frenchGreeting.greetSomeone("Fred!");

        spanishGreeting.greet();

    }        




    
    public static void main(String[] args) {

        HelloWorldAnonymousClasses myApp =

            new HelloWorldAnonymousClasses();

        myApp.sayHello();

    }           
}

