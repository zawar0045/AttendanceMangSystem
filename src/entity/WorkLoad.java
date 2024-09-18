package entity;

public class WorkLoad {
    private Teacher teacher;
    private Course course;
  private Section sec;
    public WorkLoad() {
    }

    public WorkLoad(Teacher teacher, Course course, Section sec) {
        this.teacher = teacher;
        this.course = course;
        this.sec = sec;
    }

    public WorkLoad(Teacher teacher, Course course) {
        this.teacher = teacher;
        this.course = course;
    }

    public WorkLoad(Teacher teacher) {
        this.teacher = teacher;
    }

    public Section getSec() {
        return sec;
    }

    public void setSec(Section sec) {
        this.sec = sec;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
}
