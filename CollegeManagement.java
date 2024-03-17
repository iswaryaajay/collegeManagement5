/*
 *
 * College Management
 * Student data
 * Student Details
 *
 */
package college;
import java.util.Scanner;
public class CollegeManagement
{

    public static void main(String[] args){
        final StudentView studentView = new StudentView();
        final Student student = studentView.getStudentDetails();
        System.out.println("Student details");
        System.out.println(student.getName());
        System.out.println(student.getDateOfBirth());
        System.out.println(student.getPhone());
        System.out.println(student.getDepartment());
    }
}
class StudentView{

    private static final Scanner SCANNER = new Scanner(System.in);
    public Student getStudentDetails() {
        final String name = getName();
        final String dateOfBirth = getDateOfBirth();
        final Long mobile = getPhone();
        final String department = getdepartment();
        return new Student(name, dateOfBirth, mobile, department);
    }

    private String getdepartment(){
        System.out.println("Enter a Department");

        return SCANNER.nextLine();
    }

    private String getName() {
        System.out.println("Enter your name");

        return SCANNER.nextLine();
    }

    private String getDateOfBirth() {
        System.out.println("Enter your date of birth");

        return SCANNER.nextLine();
    }

    private Long getPhone() {
        System.out.println("Enter your phone");

        return SCANNER.nextLong();
    }
}

class Student{
    enum Department {
        BIOMEDICAL("biomedical"), BIOTECH("biotech"), CIVIL("civil"), COUMPUTERSCIENCE("computerscience"), MECHANICAL("mech");

        private String departmentname;
        Department( String departmentname) {
            this.departmentname = departmentname;
        }
        public static String data(String Department){
            switch(Department){
                case "civil":
                    return "Department Of Civil";

                case "mechanical":
                    return "Department Of Mechanical";

                case "biomedical":
                    return "Department Of Biomedical";

                case "biotech":
                    return "Department Of Biotechnology";

                case "computerscience":
                    return "Department Of Computer Science";

                default:
                    return "your choosing department is unavailable.choose a another department";

            }
        }
    }
     private Department department;
     private String name;
     private String dateOfBirth;
     private Long phone;

    Student(final String name, final String dateOfBirth, final Long phone,final String department){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(final Long phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

