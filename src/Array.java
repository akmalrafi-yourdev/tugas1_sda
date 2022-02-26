import java.util.ArrayList;

// ref:
// https://www.w3schools.com/java/java_arraylist.asp

// Link Github: https://github.com/akmalrafi-yourdev/tugas1_sda
public class Array {
    public static void main(String[] args) throws Exception {
        ArrayList<String> myName = new ArrayList<String>();

        myName.add("b");
        myName.add("a");
        myName.add("n");
        myName.add("i");

        System.out.println("\n====== Tugas 1 - Array ======\n");
        System.out.println("====== Print semua data ======\n");
        for (int i = 0; i < myName.size(); i++) {
            System.out.println(myName.get(i));
        }

        // isEmpty
        System.out.println("====== Case isEmpty ======\n");
        System.out.println(myName.get(2).isEmpty());

        // size
        System.out.println("====== Case size ======\n");
        System.out.println("Size dari array myName: " + myName.size());

        // get
        System.out.println("====== Case get ======\n");

        try {
            System.out.println("Get dari beberapa index 0 array myName: " + myName.get(0));
            System.out.println("Get dari beberapa index 2 array myName: " + myName.get(2));
            System.out.println("Get dari beberapa index 6 array myName: " + myName.get(6));
            System.out.println("Get dari beberapa index -3 array myName: " + myName.get(-3));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        // indexOf
        System.out.println("====== Case indexOf ======\n");
        System.out.println("Index dari a: " + myName.indexOf("a"));
        System.out.println("Index dari c: " + myName.indexOf("c"));
        System.out.println("Index dari q: " + myName.indexOf("q"));

        // remove
        try {
            System.out.println("====== Case remove ======\n");
            System.out.println("Remove index ke 0: " + myName.remove(0));
            System.out.println("Remove index ke 3: " + myName.remove(3));
            System.out.println("Remove index ke 2: " + myName.remove(2));
        } catch (Exception e) {
            System.out.println(e);
        }

        // add
        try {
            System.out.println("====== Case add ======\n");
            System.out.println("Add index ke 0: ");
            myName.add(0, "e");
            System.out.println("Add index ke 2: ");
            myName.add(2, "f");
            System.out.println("Add index ke 3: ");
            myName.add(3, "g");
            System.out.println("Add index ke 4: ");
            myName.add(4, "h");
            System.out.println("Add index ke 6: ");
            myName.add(6, "h");
            System.out.println("Add index ke -3: ");
            myName.add(-3, "j");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n====== Print semua data setelah diubah dan ditambahkan ======\n");
        for (int i = 0; i < myName.size(); i++) {
            System.out.println(myName.get(i));
        }

    }
}
