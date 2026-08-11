import java.util.*;

public class StudyManager {
    // Queue for study tasks
    private Queue<String> studyQueue;
    // Stack for recently studied subjects
    private Stack<String> recentSubjects;
    // Store study records
    private ArrayList<StudyRecord> records;
    // PriorityQueue for highest study hours
    private PriorityQueue<StudyRecord> priorityQueue;
    public StudyManager() {
        studyQueue = new LinkedList<>();
        recentSubjects = new Stack<>();
        records = new ArrayList<>();
        priorityQueue = new PriorityQueue<>(
            (a, b) -> Double.compare(b.getHours(), a.getHours())
        );
    }
    // Add study task
    public void addTask(String task) {
        studyQueue.add(task);
        System.out.println("Task added: " + task);
    }    // Complete task
    public void completeTask() {
        if (studyQueue.isEmpty()) {
            System.out.println("No study tasks.");
        } else {
            System.out.println("Completed: " + studyQueue.poll());
        }
    }
    // Add study record
    public void addStudyRecord(StudyRecord record) {
        records.add(record);
        priorityQueue.add(record);
        recentSubjects.push(record.getSubject());
    }    // Display study records
    public void displayRecords() {
        if (records.isEmpty()) {
            System.out.println("No study records.");
            return;
        }
        for (StudyRecord record : records) {
            System.out.println(record);
        }
    }    // Recently studied subject
    public void showRecentSubject() {
        if (recentSubjects.isEmpty()) {
            System.out.println("No recent subject.");
        } else {
            System.out.println("Recently studied: " +recentSubjects.peek() );
        }
    }
    // Highest study hours
    public void showHighestStudy() {
        if (priorityQueue.isEmpty()) {
            System.out.println("No study data.");
        } else {
            System.out.println("Highest study record:");
            System.out.println(priorityQueue.peek());
        }
    }
    // Calculate total study hours
    public void totalStudyHours() {
        double total = 0;
        for (StudyRecord record : records) {
            total += record.getHours();
        }
        System.out.println("Total Study Hours: " + total);
    }
}
