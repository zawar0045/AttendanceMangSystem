package entity;

public class Enrollment {
    private Student std;
    private Course course;
    private Section sec;
    private String status;
    public Enrollment() {
        
    }

    public Enrollment(Student std, Course course,String status,Section sec) {
        this.std = std;
        this.course = course;        
        this.status=status;
        this.sec=sec;
    }

    public Section getSec() {
        return sec;
    }

    public void setSec(Section sec) {
        this.sec = sec;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
    public Student getStd() {
        return std;
    }

    public void setStd(Student std) {
        this.std = std;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
}
