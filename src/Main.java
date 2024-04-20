import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pc pc1 = new Pc(123, "Core i7", "16 GB", "512 SSD", "HP", true);
        Pc pc2 = new Pc(321, "Core i5", "14 GB", "453 SSD", "Dell", true);
        Pc pc3 = new Pc(456, "Ryzen 7", "32 GB", "1 TB SSD", "Asus", true);
        Pc pc4 = new Pc(789, "Core i9", "32 GB", "1 TB NVMe SSD", "Acer", true);
        Pc pc5 = new Pc(1000, "Ryzen 5", "16 GB", "512 SSD", "Lenovo", true);
        Pc pc6 = new Pc(1213, "Core i5", "8 GB", "256 SSD", "MSI", true);
        Pc pc7 = new Pc(1415, "Core i7", "16 GB", "512 SSD", "Apple", true);
        Pc pc8 = new Pc(1617, "Core i3", "8 GB", "256 SSD", "Samsung", false);
        Pc pc9 = new Pc(1819, "Ryzen 9", "64 GB", "2 TB SSD", "Alienware", true);
        Pc pc10 = new Pc(2021, "Core i7", "16 GB", "1 TB SSD", "Microsoft", true);

        List<Pc> list = new ArrayList<>();
        Collections.addAll(list, pc1, pc2, pc3, pc4, pc5, pc6, pc7, pc8, pc9, pc10);

        // Printing the initial list
        System.out.println("Initial list:");
        for (Pc pc : list) {
            System.out.println(pc);
        }
        System.out.println("Size of the list: " + list.size());

        // Adding a PC at index 2
        Pc newPc = new Pc(100, "Ryzen 3", "8 GB", "256 SSD", "HP", false);
        list.add(2, newPc);
        System.out.println("\nList after adding a PC at index 2:");
        for (Pc pc : list) {
            System.out.println(pc);
        }
        System.out.println("Size of the list: " + list.size());

        // Deleting the PC at index 5
        list.remove(5);
        System.out.println("\nList after removing a PC at index 5:");
        for (Pc pc : list) {
            System.out.println(pc);
        }
        System.out.println("Size of the list: " + list.size());

        // Setting the PC at index 0 to pc1
        list.set(0, pc1);
        System.out.println("\nList after setting PC at index 0 to pc1:");
        for (Pc pc : list) {
            System.out.println(pc);
        }

        // Adding 2 to the ID of each PC
        for (Pc pc : list) {
            pc.setId(pc.getId() + 2);
        }
        System.out.println("\nList after adding 2 to each PC's ID:");
        for (Pc pc : list) {
            System.out.println(pc);
        }

        // Sorting the list by ID
        Collections.sort(list);
        System.out.println("\nList after sorting by ID:");
        for (Pc pc : list) {
            System.out.println(pc);
        }

        // Reversing the list
        Collections.reverse(list);
        System.out.println("\nList after reversing:");
        for (Pc pc : list) {
            System.out.println(pc);
        }
    }
}
