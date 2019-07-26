package strategy;

/**
 * MallardDuck
 */
public class MallardDuck extends Duck {
  public MallardDuck () {
    this.quackBehavior = new Quack();
    this.flyBehavior= new FlyWithWings();
  }

  public void display() {
    System.out.println("Mallard the Duck, at your service");
  }
}
