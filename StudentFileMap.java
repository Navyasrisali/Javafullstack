import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StudentFileMap {
    public static void main(String[] args) {
        // File to store student data
        String filename = "students.txt";

        // Create HashMap and add data
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue());
                writer.newLine();
            }
            System.out.println("Data written to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from file into a new HashMap
        HashMap<Integer, String> readMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                readMap.put(id, name);
            }
            System.out.println("\nData read from file:");
            for (Map.Entry<Integer, String> entry : readMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
