
import java.util.ArrayList;
public class dynamic_arrayclass {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(22);
        list.add(36);
        System.out.println("Elements: " + list);
        System.out.println("First Element: " + list.get(0));
        list.set(1, 50);
        System.out.println("Updated List: " + list);
        list.remove(2);
        System.out.println("After Removal: " + list);
        System.out.println("Size: " + list.size());
    }
}

