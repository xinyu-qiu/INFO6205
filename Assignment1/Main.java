public class Main {
  public static void main(String[] args) {
    // Create bag with type integer
    Bag<Integer> intBag = new Bag<>();

    // Add some elements to bag
    intBag.add(0);
    intBag.add(1);
    intBag.add(2);

    System.out.println("Is bag empty? " + intBag.isEmpty());
    System.out.println("Random element: " + intBag.grab());
    System.out.println("Bag contains 0? " + intBag.contains(0));
    System.out.println("Bag's size: " + intBag.size());
    System.out.println("Bag to string: " + intBag.toString());

    Object[] array = intBag.toArray();
    System.out.print("Bag to array: [");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");

    // Remove one element from bag
    boolean removeStatus = intBag.remove(0);
    System.out.println("Remove element 0 from Bag? " + removeStatus);
    System.out.println("Bag contains 0? " + intBag.contains(0));
    System.out.println("Bag's size: " + intBag.size());

    // Clear bag
    intBag.clear();
    System.out.println("Bag cleared. Is bag empty? " + intBag.isEmpty());
  }
}
