
class Student1 {
  private int id;
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String n) {
    name = n;
  }

  public int getId() {
    return id;
  }

  public void setId(int i) {
    id = i;
  }
}

public class Student {
  public static void main(String[] args) {
    Student1 alex = new Student1();

    alex.setName("alex1");
    System.out.println(alex.getName());

    alex.setId(123);
    System.out.println(alex.getId());

  }
}