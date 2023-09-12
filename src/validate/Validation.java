package validate;

public class Validation {
    public boolean check_course_code(String courseCode) {
        if (courseCode.length() == 5
                && courseCode.substring(0, 1).equals("FW")
                && Character.isDigit(courseCode.substring(2, 4).charAt(2))
                && Character.isDigit(courseCode.substring(2, 4).charAt(3))
                && Character.isDigit(courseCode.substring(2, 4).charAt(4))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean check_status(String status) {
        if (status.equalsIgnoreCase("active") || status.equalsIgnoreCase("in-active")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean check_flag(String flag) {
        if (flag.equalsIgnoreCase("optional") || flag.equalsIgnoreCase("mandatory") || flag.equalsIgnoreCase("N/A")) {
            return true;
        } else {
            return false;
        }
    }
}
