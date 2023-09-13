package fa.training.main;

import fa.training.entities.Course;

import java.util.Scanner;

public class CourseManagement {

    public static Scanner sc = new Scanner(System.in);

    public static void find(String type, Course[] data) {
        switch (type) {
            case "Code":
                System.out.println("Enter course code you want to search:");
                String course_code = sc.nextLine();
                for (int i = 0; i < data.length; i++) {
                    if (course_code.equalsIgnoreCase(data[i].getCourseID())) {
                        System.out.println(data[i].toString());
                    }
                }
            case "Name":
                System.out.println("Enter course name you want to search:");
                String course_name = sc.nextLine();
                for (int i = 0; i < data.length; i++) {
                    if (course_name.equalsIgnoreCase(data[i].getCourseName())) {
                        System.out.println(data[i].toString());
                    }
                }
            case "Duration":
                System.out.println("Enter course name you want to search:");
                double course_duration = sc.nextDouble();
                for (int i = 0; i < data.length; i++) {
                    if (course_duration == data[i].getDuration()) {
                        System.out.println(data[i].toString());
                    }
                }
            case "Status":
                System.out.println("Enter course name you want to search:");
                String course_status = sc.nextLine();
                for (int i = 0; i < data.length; i++) {
                    if (course_status.equalsIgnoreCase(data[i].getStatus())) {
                        System.out.println(data[i].toString());
                    }
                }
            case "Flag":
                System.out.println("Enter course name you want to search:");
                String course_flag = sc.nextLine();
                for (int i = 0; i < data.length; i++) {
                    if (course_flag.equalsIgnoreCase(data[i].getFlag())) {
                        System.out.println(data[i].toString());
                    }
                }
            default:
                System.out.println("Attribute not available");
        }
    }

    public static void display_course_isMandatory(Course[] courses) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getFlag().equalsIgnoreCase("Mandatory")) {
                System.out.println(courses[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        Course[] courses = new Course[10];
        courses[0] = new Course("fw123", "hun", 123.2, "active", "optional");
        courses[1] = new Course("fw124", "hug", 125.2, "in-active", "mandatory");
        courses[2] = new Course("fw125", "tuy", 223.2, "active", "N/A");
        courses[3] = new Course("fw126", "tuy", 233.2, "active", "mandatory");

        int choice = 0;
        while (true) {
            try {
                System.out.println("1.Input 10 courses");
                System.out.println("2.Search");
                System.out.println("3.Display ");
                System.out.println("4.exit ");
                System.out.println("Enter your choice:");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        Course course = new Course();
                        course.input();
                        break;
                    case 2:
                        System.out.println("Enter attribute you want to find");
                        String attribute = sc.next();
                        find(attribute, courses);
                        break;
                    case 3:
                        display_course_isMandatory(courses);
                        break;
                    case 4:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.printf("Invalid choice.");
            }
        }
    }
}
