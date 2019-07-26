package strategy;

/**
 * ModelDuck
 */
public class ModelDuck extends Duck {

  public ModelDuck () {
    this.flyBehavior = new FlyNoWay();
    this.quackBehavior = new Quack();
  }
  
  public void display () {
    System.out.println("I am a plain. A plain model duck I am.");
  }
}
