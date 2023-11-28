import java.util.LinkedList;

// this is an exmaple of linked list 
class Main {
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();

    // add test hardcoded elements in the LinkedList
    languages.add("Python");
    languages.add("Java");
    languages.add("JavaScript");

    // print before 
    System.out.println("LinkedList: " + languages);

    // get the element from the LinkedList
    String str = languages.get(1);
    System.out.print("Element at index 1: " + str);
  }
}
