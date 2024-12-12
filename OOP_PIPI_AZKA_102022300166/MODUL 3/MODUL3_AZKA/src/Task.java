import java.time.LocalDate;

public class Task {
    // TO DO: Lengkapi atribut-atribut private kelas Task
    private final String title;
    private final String priority;
    private final LocalDate dueDate;
    private final String status;

    // TO DO: Buat constructor untuk kelas Task

    public Task(String title, String priority, LocalDate dueDate, String status) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = status;
    }
    // TO DO: Buat getter untuk title
    public String getTitle() {
        return title;
    }
    // TO DO: Buat getter untuk priority
    public String getPriority() {
        return priority;
    }

    // TO DO: Buat getter untuk dueDate
    public LocalDate getDueDate() {
        return dueDate;
    }
    // TO DO: Buat getter untuk status
    
    public String getStatus() {
        return status;
    }
    // TO DO: Buat setter untuk status
    
}
