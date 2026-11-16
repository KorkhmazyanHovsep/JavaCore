package classroomexamples.studentportal.model;

import java.util.Date;
import java.util.Objects;

public class Course {
    private String name;
    private String teacherName;
    private double price;
    private Date startDate;

    public Course() {
    }

    public Course(String name, String teacherName, double price, Date startDate) {
        this.name = name;
        this.teacherName = teacherName;
        this.price = price;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Double.compare(price, course.price) == 0 && Objects.equals(name, course.name) && Objects.equals(teacherName, course.teacherName) && Objects.equals(startDate, course.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teacherName, price, startDate);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", price=" + price +
                ", startDate=" + startDate +
                '}';
    }
}
