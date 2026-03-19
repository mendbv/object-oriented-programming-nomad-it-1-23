import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("=== Task 1 ===");
        runTask1();

        System.out.println("\n=== Task 2 ===");
        runTask2();

        System.out.println("\n=== Task 3 ===");
        runTask3();

        System.out.println("\n=== Task 4 ===");
        runTask4();
    }

    public static void runTask1() {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Buy milk");
        tasks.add("Wash Car");
        tasks.add("Learn Java");

        System.out.println("Size of list: " + tasks.size());

        tasks.remove(1);
        tasks.set(0, "Buy another milk");

        System.out.println("Final task list:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public static void runTask2() {
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grades (negative number = end):");

        while (true) {
            int grade = scanner.nextInt();
            if (grade < 0) {
                break;
            }
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades found");
            return;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        double average = (double) sum / grades.size();
        System.out.println("Average grade is " + average);

        int max = grades.get(0);
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }

        System.out.println("Maximum grade is " + max);
    }

    public static void runTask3() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(50) + 1;
            numbers.add(num);
        }

        System.out.println("Before changes:");
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
                i--;
            }
        }

        System.out.println("After changes:");
        System.out.println(numbers);
    }

    public static void runTask4() {
        ArrayList<String> contactsInPhone = new ArrayList<>();
        contactsInPhone.add("Yasuo");
        contactsInPhone.add("Sekiro");
        contactsInPhone.add("Akali");

        ArrayList<String> contactsInSim = new ArrayList<>();
        contactsInSim.add("Acheron");
        contactsInSim.add("Yone");
        contactsInSim.add("Archer");

        ArrayList<String> allContacts = new ArrayList<>();

        for (String contact : contactsInPhone) {
            if (!allContacts.contains(contact)) {
                allContacts.add(contact);
            }
        }

        for (String contact : contactsInSim) {
            if (!allContacts.contains(contact)) {
                allContacts.add(contact);
            }
        }

        Collections.sort(allContacts);

        System.out.println("All contacts:");
        for (String contact : allContacts) {
            System.out.println(contact);
        }
    }
}