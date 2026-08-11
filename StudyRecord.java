public class StudyRecord {
    private String subject;
    private double hours;
    private String date;
    public StudyRecord(String subject, double hours, String date) {
        this.subject = subject;
        this.hours = hours;
        this.date = date;
    }
    public String getSubject() {
        return subject;
    }
    public double getHours() {
        return hours;
    }
    public String getDate() {
        return date;
    }
    @Override
    public String toString() {
        return "Subject: " + subject +
               " | Hours: " + hours +
               " | Date: " + date;
    }
}
