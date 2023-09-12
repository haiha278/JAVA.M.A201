package model;

import validate.Validation;

import java.util.Scanner;

public class Course {
    private String courseID;
    private String courseName;
    private double duration;
    private String status;
    private String flag;
    Scanner sc = new Scanner(System.in);

    public Course() {
    }

    public Course(String courseID, String courseName, double duration, String status, String flag) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
        this.status = status;
        this.flag = flag;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }

    public void input() {
        Validation validation = new Validation();
        while (true) {
            Course course = new Course();
            while (true) {
                System.out.println("Enter course code: ");
                String course_code = sc.nextLine();
                if (validation.check_course_code(course_code) == false) {
                    System.out.println("Enter wrong course code, please enter again!");
                    continue;
                }
                course.setCourseID(course_code);
                break;
            }
            System.out.println("Enter course name: ");
            String course_name = sc.nextLine();
            System.out.println("Enter duration: ");
            double duration = sc.nextDouble();
            System.out.println("Enter status: ");
            String status = sc.nextLine();
            System.out.println("Enter flag: ");
            String flag = sc.nextLine();
        }

    }
}
