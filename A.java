public class A {
  public int add(int i, int j) {
    return i + j; // in write a return value.
  }

  public int add(short i, short j) {
    return i + j;
  }

  public long add(long i, long j) {
    return i + j;
  }

  public float add(float i, float j) {
    return i + j;
  }

  @Override // when i remove it i get compilation error
  public String toString() {
    return "add integer, short, float, and long.";
  }

  public static void main(String[] args) {
    A a = new A();
    System.out.println(a.toString());

    System.out.println("Sum of integer: " + a.add(10, 20));
    System.out.println("Sum of short: " + a.add((short) 5, (short) 15));
    System.out.println("Sum of long: " + a.add(15l, 25l));
    System.out.println("Sum of float: " + a.add(23.2f, 25.5f)); // compilation error When I found solution on Google
                                                                // there the solution is overloading.
  }
}
