import java.util.LinkedList;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        LinkedList<String> animals= new LinkedList<>();

        // Add elements in LinkedList
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        // Creating an object of Iterator
        Iterator<String> iterate = animals.iterator();
        System.out.print("LinkedList: ");

        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
