package classroomexamples.studentportal;

public class Student {
    private String name;
    private String surname;
    private String phone;
    private String course;

    public Student(String name, String surname, String phone, String course) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.course = course;
    }

    public Student() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
