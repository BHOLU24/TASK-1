abstract class Car {
  public abstract void Drive();

  public void playMusic() {

    System.out.println("play music");
  }
}

class Wagner extends Car {
  public void Drive() {
    System.out.println("Driving....");
  }
}

public class Abstract {
  public static void main(String[] args) {

    Car obj = new Wagner();
    obj.Drive();
    obj.playMusic();
  }

}
