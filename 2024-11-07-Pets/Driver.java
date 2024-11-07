public class Driver{
  public static void main(String[] args){

    Animal human = new Animal("hi", 5, "bob");
    human.speak();

    Bird pigeon = new Bird("squawk", 3, "billy", 24.5, "white");
    pigeon.speak();
  }
}
