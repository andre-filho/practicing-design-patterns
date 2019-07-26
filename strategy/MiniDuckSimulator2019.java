package strategy;

/**
 * MiniDuckSimulator2019
 */
public class MiniDuckSimulator2019 {

  public static void main(String[] args) {
    Duck mallardDuck = new MallardDuck();
    
    mallardDuck.performQuack();
    mallardDuck.performFly();
  }
}
