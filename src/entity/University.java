package entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ABDUL MOIZ
 */
public class University {

    public static ArrayList<Teacher> techr;
    public static ArrayList<Student> stud;
    public static ArrayList<Course> courses;
    public static ArrayList<Enrollment> enrollments;
    public static ArrayList<WorkLoad> workLoads;
    public static ArrayList<Attendance>  atend;
    static {
        courses = new ArrayList();
        techr = new ArrayList();
        stud = new ArrayList();
        enrollments = new ArrayList();
        workLoads = new ArrayList();
        atend=new ArrayList();
        dummyCourse();
        dummyworkLoad();
        dummyUsers();
        dummyEnrollment();
        dummyatendace();
       
    }

        
    public static ArrayList<Attendance> getAtend() {
        return atend;
    }

    public static void setAtend(ArrayList<Attendance> atend) {
        University.atend = atend;
    }

    public static void erorr(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static ArrayList<Course> getCourses() {
        return courses;
    }

    public static ArrayList<Enrollment> getEnrollments() {
        return enrollments;
    }

    public static ArrayList<WorkLoad> getWorkLoads() {
        return workLoads;
    }

    public static void addtecher(Teacher t) {
        if (t != null) {
            University.techr.add(t);
        erorr("Added Sucessfully");
        } else {
            erorr("Techer data is null");
        }
    }
    public static boolean ceckworkload(String name,String c,String sec){
        for(int i=0;i<University.workLoads.size();i++){
            if(workLoads.get(i).getTeacher().getName().equals(name) &&workLoads.get(i).getCourse().getName().equals(c)&&workLoads.get(i).getSec().getName().equals(sec))
                  return false;  
                }
        return true;
        
        
    }

    public static void addstudent(Student s) {
        if (s != null) {
            University.stud.add(s);
            erorr("Added Sucessfully");
        } else {
            erorr("Student data is null");
        }
    }

    public static ArrayList<Student> getStud() {
        return stud;
    }

    public static boolean createCourse(Course c) {
        if (c != null) {
            courses.add(c);
            return true;
        } else {
            return false;
        }
    }

    public static Course checkcourse(String course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getName().equals(course)) {
                return courses.get(i);
            }
        }
        return null;

    }
public static boolean checkenrol(String n,String c,String s){
    for(int i=0;i<enrollments.size();i++){
        if(enrollments.get(i).getStd().getName().equals(n)&&enrollments.get(i).getCourse().getName().equals(c)&&enrollments.get(i).getSec().getName().equals(s)){
            return false;
        }
    }
        return true;
}
    public static void dummyUsers() {
        //up-casting
        techr.add(new Teacher("Bilal Arif", "bilal93", "1122", "Your First Teacher Name?", "mudasir", "Admin"));
        stud.add(new Student(9110, "Irfan", "2778", "Moiz@gmailcom", (float) 3.2, "Moeez", "0326421432", "skp"));
        stud.add(new Student(9123, "Ali", "2258", "ewz@gmailcom", (float) 2.9, "Ali Ahamad", "03264212332", "skp"));
        stud.add(new Student(9124, "Ahmed", "2248", "ewz@gmailcom", (float) 2.3, "Junaid Sultan", "03264212332", "skp"));
        stud.add(new Student(9125, "junaid", "2238", "ewz@gmailcom", 4, "Ali Ahamad", "03264212332", "skp"));
//        stud.add(new Student(9126, "Irfan", "2228", "ewz@gmailcom", 3, "Aila Arshad", "03264212332", "skp"));
        techr.add(new Teacher("Raybal Akhtar", "raybal88", "7788", "Adnan", "Teacher", "1122"));
        techr.add(new Teacher("Abdullah Yousaf", "Abdullah44", "4433", "Your First Teacher Name?", "Amjad", "2211"));
         techr.add(new Teacher("Ali Ahamad", "Abdullah44", "4433", "Your First Teacher Name?", "Amjad", "2211"));
          techr.add(new Teacher("Junaid Sultan", "Abdullah44", "4433", "Your First Teacher Name?", "Amjad", "2211"));
techr.add(new Teacher("Aila Arshad", "Abdullah44", "4433", "Your First Teacher Name?", "Amjad", "2211"));

    }
   public static void dummyworkLoad() {
        //up-casting
       workLoads.add(new WorkLoad(new Teacher("BilalArif", "9110"), new Course("Programming Fundamental"), new Section("w1","Monday,Tuesday","11:00 to 12:00")));

        workLoads.add(new WorkLoad(new Teacher("Raybal Akhtar", "2178"), new Course("Object Oriented Programming"), new Section("W2","Friday,Tuesday","12:15 to   1:30")));
        workLoads.add(new WorkLoad(new Teacher("Abdullah Yousaf", "2758"), new Course("Mobile App Developmen"),  new Section("W4","Monday,Tuesday","2:30 to 3:30")));
        workLoads.add(new WorkLoad(new Teacher("ahmed", "2278"), new Course("Web App Development"),new Section("W3","Monday,Tuesday","1:30 to 2:30")));

    }
   public static void dummyCourse(){
       ArrayList<Section> S=new ArrayList();
       S.add(new Section("W1","Monday,Tuesday","11:00 to 12:00"));
        S.add(new Section("W2","Friday,Tuesday","12:15 to   1:30"));
         S.add(new Section("W3","Monday,Tuesday","1:30 to 2:30"));
          S.add(new Section("W4","Monday,Tuesday","2:30 to 3:30"));
           S.add(new Section("W5","Wednesday,Friday","11:00 to 12:00"));
            S.add(new Section("W6","Monday,Thuresday","1:00 to 2:30"));
        
       courses.add(new Course("Programming Fundamental","v123",S));
       courses.add(new Course("Object Oriented Programming","v123",S));
       courses.add(new Course("Mobile App Development","v123",S));
       courses.add(new Course("Web App Development","v123",S));
       courses.add(new Course("Machine Learning","v123",S));
       
   }
    public static void dummyEnrollment() {
        //up-casting
        enrollments.add(new Enrollment(new Student("Moeez", "2778"), new Course("Programming Fundamental"), "pending", new Section("W1","Monday,Tuesday","11:00 to 12:00")));

        enrollments.add(new Enrollment(new Student("junaid", "2178"), new Course("Object Oriented Programming"), "pending", new Section("W2","Friday,Tuesday","12:15 to   1:30")));
        enrollments.add(new Enrollment(new Student("Ali", "2758"), new Course("Mobile App Development"), "pending", new Section("W4","Monday,Tuesday","2:30 to 3:30")));
        enrollments.add(new Enrollment(new Student("ahmed", "2278"), new Course("Web App Development"), "pending", new Section("W4","Monday,Tuesday","2:30 to 3:30")));

    }
    
    public static void dummyatendace() {
        //up-casting
       ArrayList<Student> s =new ArrayList();
       s.add(new Student(9110, "Irfan", "2778", "Moiz@gmailcom", (float) 3.2, "Moeez", "0326421432", "skp"));
       s.add(new Student(9123, "Ali", "2258", "ewz@gmailcom", (float) 2.9, "Ali Ahamad", "03264212332", "skp"));
        s.add(new Student(9124, "Ahmed", "2248", "ewz@gmailcom", (float) 2.3, "Junaid Sultan", "03264212332", "skp"));
        s.add(new Student(9125, "junaid", "2238", "ewz@gmailcom", 4, "Ali Ahamad", "03264212332", "skp"));
         s.add(new Student(9125, "junaid", "2238", "ewz@gmailcom", 4, "Ali Ahamad", "03264212332", "skp"));
        atend.add(new Attendance(s , new Course("Programming Fundamental") , new Section("W1","Monday,Tuesday","11:00 to 12:00")));
       atend.add(new Attendance(s,new Course("Object Oriented Programming"),new Section("W1","Monday,Tuesday","11:00 to 12:00")));
       atend.add(new Attendance(s,new Course("Mobile App Development"),new Section("W1","Monday,Tuesday","11:00 to 12:00")));
       atend.add(new Attendance(s,new Course("Web App Development"),new Section("W1","Monday,Tuesday","11:00 to 12:00")));
       atend.add(new Attendance(s,new Course("Machine Learning"),new Section("W1","Monday,Tuesday","11:00 to 12:00")));
       atend.add(new Attendance(s , new Course("Programming Fundamental") , new Section("W2","Monday,Tuesday","11:00 to 12:00")));
       atend.add(new Attendance(s,new Course("Object Oriented Programming"),new Section("W2","Monday,Tuesday","11:00 to 12:00")));
        atend.add(new Attendance(s,new Course("Mobile App Development"),new Section("W2","Monday,Tuesday","11:00 to 12:00")));
        atend.add(new Attendance(s,new Course("Web App Development"),new Section("W2","Monday,Tuesday","11:00 to 12:00")));
        atend.add(new Attendance(s,new Course("Machine Learning"),new Section("W2","Monday,Tuesday","11:00 to 12:00")));
          atend.add(new Attendance(s,new Course("Web App Development"),new Section("W4","Monday,Tuesday","11:00 to 12:00")));
        atend.add(new Attendance(s,new Course("Mobile App Development"),new Section("W4","Monday,Tuesday","11:00 to 12:00")));
    }

 
    public static Teacher checkteacher(String n) {

        for (int i = 0; i < techr.size(); i++) {

            if (techr.get(i).getName().equalsIgnoreCase(n)) {

                return techr.get(i);

            }

        }
        return null;

    }
  public static Enrollment checkEnrol(String n) {

        for (int i = 0; i < enrollments.size(); i++) {

            if (enrollments.get(i).getStd().getName().equals(n)) {

                return enrollments.get(i);

            }

        }
        return null;

    }

    public static Student checkstdE(String name) {
        for (int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getName().equals(name)) {
                return stud.get(i);

            }
        }
        return null;

    }

    public static boolean check(String n, String p) {

        for (int i = 0; i < techr.size(); i++) {

            if (techr.get(i).getName().equalsIgnoreCase(n) && techr.get(i).getTpswd().equals(p)) {

                return true;

            }

        }

        return false;
    }

    public static boolean checkstd(String pswd, String name) {
        for (int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getName().equals(name) && stud.get(i).getPsvd().equals(pswd)) {
                return true;

            }
        }
        return false;
    }
  
    public static ArrayList<Teacher> getTechr() {
        return techr;
    }

}
