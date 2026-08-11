import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager bookManager = new BookManager();
        StudyManager studyManager = new StudyManager();
        // Adding books
        bookManager.addBook(
            new Book(1, "Data Structures",
                     "Mark Allen", "Computer Science",
                     500, 4.8)
        );
        bookManager.addBook(
            new Book(2, "Java Programming",
                     "James Gosling", "Programming",
                     650, 4.7)
        );
        bookManager.addBook(
            new Book(3, "Operating Systems",
                     "Galvin", "Computer Science",
                     850, 4.6)
        );
        bookManager.addBook(
            new Book(4, "Database Systems",
                     "Raghu Ramakrishnan", "Database",
                     720, 4.5)
        );
        bookManager.addBook(
            new Book(5, "Computer Networks",
                     "Andrew Tanenbaum", "Networking",
                     600, 4.4)
        );
        int choice;
        do {
            System.out.println("\n================================");
            System.out.println("   BOOK & STUDY ANALYSIS");
            System.out.println("================================");

            System.out.println("1. Display Books");
            System.out.println("2. Search Book");
            System.out.println("3. Binary Search Book");
            System.out.println("4. Sort Books by Rating");
            System.out.println("5. Sort Books by Pages");
            System.out.println("6. Add Study Task");
            System.out.println("7. Complete Study Task");
            System.out.println("8. Add Study Record");
            System.out.println("9. Display Study Records");
            System.out.println("10. Show Recent Subject");
            System.out.println("11. Show Highest Study");
            System.out.println("12. Total Study Hours");
            System.out.println("0. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    bookManager.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    bookManager.searchByTitle(title);
                    break;
                case 3:
                    System.out.print(
                        "Enter book title for binary search: "
                    );
                    String searchTitle = sc.nextLine();
                    bookManager.binarySearch(searchTitle);
                    break;
                case 4:
                    bookManager.sortByRating();
                    break;
                case 5:
                    bookManager.sortByPages();
                    break;
                case 6:
                    System.out.print(
                        "Enter study task: "
                    );
                    String task = sc.nextLine();
                    studyManager.addTask(task);
                    break;
                case 7:
                    studyManager.completeTask();
                    break;
                case 8:
                    System.out.print("Enter subject: ");
                    String subject = sc.nextLine();
                    System.out.print("Enter study hours: ");
                    double hours = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter date: ");
                    String date = sc.nextLine();
                    StudyRecord record =
                        new StudyRecord(
                            subject,
                            hours,
                            date
                        );
                    studyManager.addStudyRecord(record);
                    System.out.println(
                        "Study record added successfully."
                    );
                    break;
                case 9:
                    studyManager.displayRecords();
                    break;
                case 10:
                    studyManager.showRecentSubject();
                    break;
                case 11:
                    studyManager.showHighestStudy();
                    break;
                case 12:
                    studyManager.totalStudyHours();
                    break;
                case 0:
                    System.out.println(
                        "Thank you for using the system!"
                    );
                    break;
                default:
                    System.out.println(
                        "Invalid choice!"
                    );
            }
        } while (choice != 0);

    }
}
