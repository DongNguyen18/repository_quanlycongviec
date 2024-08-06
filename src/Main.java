import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Job> jobList = new ArrayList<>();
    static List<User> userList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Job");
            System.out.println("2. Add User");
            System.out.println("3. Display Jobs");
            System.out.println("4. Display Users");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addJob(scanner);
                    break;
                case 2:
                    addUser(scanner);
                    break;
                case 3:
                    displayJobs();
                    break;
                case 4:
                    displayUsers();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void addJob(Scanner scanner) {
        System.out.print("Enter job title: ");
        String title = scanner.nextLine();
        System.out.print("Enter company name: ");
        String company = scanner.nextLine();
        System.out.print("Enter job location: ");
        String location = scanner.nextLine();

        Job job = new Job(title, company, location);
        jobList.add(job);
        System.out.println("Job added successfully.");
    }

    public static void addUser(Scanner scanner) {
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter date of birth (yyyy-mm-dd): ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Enter sex: ");
        String sex = scanner.nextLine();

        User user = new User(name, dateOfBirth, sex);
        userList.add(user);
        System.out.println("User added successfully.");
    }

    public static void displayJobs() {
        if (jobList.isEmpty()) {
            System.out.println("No jobs available.");
            return;
        }
        System.out.println("Jobs:");
        for (Job job : jobList) {
            System.out.println(job);
        }
    }

    public static void displayUsers() {
        if (userList.isEmpty()) {
            System.out.println("No users available.");
            return;
        }
        System.out.println("Users:");
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
