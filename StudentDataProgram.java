
/**
Author: Rapheephat Aeiphingchai 672115041
*/

import java.io.*;
import java.util.*;

// Student class for creating student instances
class Student {
    private final String SID;
    private final String firstName;
    private final String lastName;

    public Student(String SID, String firstName, String lastName) {
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getSID() {
        return SID;
    }

    public String getFirst() {
        return firstName;
    }

    public String getLast() {
        return lastName;
    }

    public String toString() { // Output string format
        return this.SID + " " + this.firstName + " " + this.lastName;
    }
}

public class StudentDataProgram {
    public static void main(String[] args) throws IOException {

        if (args.length < 2) { // Check if the input argument is less than 1 or not
            System.out.println("Insufficient argument were given. Please try again later.");
            System.out.println("The program has ended successfully.");
            return;
        }

        String operationChoice = args[0].toLowerCase(); // Convert operation to lowercase
        String filePath = args[1];
        File file = new File(filePath);

        Scanner reader = new Scanner(file); // Use File as input for Scanner
        Vector<Student> student = new Vector<Student>();

        // Skip first 7 lines of unnecessary information
        for (int i = 0; i < 7; i++) {
            reader.nextLine();
        }

        // Read student data
        while (reader.hasNextLine()) {
            String dataLine = reader.nextLine();
            StringTokenizer stu = new StringTokenizer(dataLine.trim(), ",");
            stu.nextToken(); // Skip the first token, which is number order
            student.addElement(new Student(stu.nextToken(), stu.nextToken(), stu.nextToken()));
            // Create new Student element in array
        }

        reader.close(); // Close the reader

        if (args.length == 2) { // Check if the length of argument is 2
            switch (operationChoice) {
                case "-n":
                    student.sort(Comparator.comparing(Student::getSID)); // Sort array by SID
                    System.out.println("[Sort by SID successfully.]\n");
                    for (Student i : student) {

                        System.out.println(i.toString()); // Print each SID-sorted Student elements

                    }
                    break;

                case "-f":
                    student.sort(Comparator.comparing(Student::getFirst)); // Sort array by first name
                    System.out.println("[Sort by first name successfully.]\n");
                    for (Student i : student) {

                        System.out.println(i.toString()); // Print each First-sorted Student elements

                    }
                    break;

                case "-l":
                    student.sort(Comparator.comparing(Student::getLast)); // Sort array by last name
                    System.out.println("[Sort by last name successfully.]\n");
                    for (Student i : student) {

                        System.out.println(i.toString()); // Print each Last-sorted Student elements

                    }
                    break;

                default:
                    System.out.println("Invalid operation or incorrect argument format. Please try again later.");
                    break;
            }
        } else if (args.length == 3) { // Check if the length of argument is 3, then performing linear search
            String nameSearch = args[2].toLowerCase();
            // Needed to put here because it will cause index out of bounds
            // Also needed .toLowerCase() because either mixed cases or all-capitalized doesn't work properly
            boolean nameFound = false; // Boolean to check if the name was found

            // Iterate over the list and display index
            for (int i = 0; i < student.size(); i++) {

                Student s = student.get(i); // Get the student at index i

                if (s.getFirst().toLowerCase().contains(nameSearch)) {
                // Search by first name(case insensitive comparison)
                    System.out.println("Found at index " + (i + 1) + ": " + s.toString());
                    nameFound = true; // Change nameFound to true so it doesn't go through the code below
                }

            }

            if (nameFound == false) { // If no matching student is found, means the boolean never changed to true
                System.out.println("No student was found");
            }
        } else {
            System.out.println("Invalid argument. Please try again later.");
        }
        System.out.println("\nThe program has ended successfully.");
    }
}