public class Main {

    public static void main(String[] args) {
    // this block of code uses a public method in Greetings class to display output
        Greeting g = new Greeting();
        g.setSender("Dave");
        g.setGreeting("Hello");
        String message = g.displayMessage(); //calling the metthod
        System.out.println(message); // this is a class variable created just above, its value is a method from another class

        Greeting g2 = new Greeting(); // the point is whenever you say ne the constructor will run in the class you are calling
                                        // in this case class is Greeting
        g2.setSender("Melissa");
        g2.setGreeting("Hello from Melissa");
        System.out.println(g2.getSender());
        System.out.println(g2.getGreeting());

        //creating the object and initializing it at the same time without using the getter and setter constructors
        Greeting g3 = new Greeting("Jennifer","I like Java");
        System.out.println(g3.displayMessage()); // calling a method outside class to display output
                                                //not we can not see what the method does in this class(thats what encapsulation is )
    }
}
