import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bag<T> {
  private List<T> items;

  public Bag() {
    // Initialize bag as an empty ArrayList
    items = new ArrayList<>();
  }

  // Add one element to bag
  public void add(T item) {
    items.add(item);
  }

  // Clear all contents of the bag
  public void clear() {
    items.clear();
  }

  // Check if an element is in the bag
  public boolean contains(T item) {
    return items.contains(item);
  }

  // Return a random element from the bag
  public T grab() {
    if (isEmpty()) {
      return null;
    }
    Random rand = new Random();
    int randomIndex = rand.nextInt(items.size());
    return items.get(randomIndex);
  }

  // Check if the bag is empty
  public boolean isEmpty() {
    return items.isEmpty();
  }

  // Remove one item from the bag
  public boolean remove(T item) {
    return items.remove(item);
  }

  // Get the number of elements in the bag
  public int size() {
    return items.size();
  }

  // Convert the bag to an array
  public Object[] toArray() {
    return items.toArray();
  }

  // Convert the bag to a string
  @Override
  public String toString() {
    return items.toString();
  }
}
