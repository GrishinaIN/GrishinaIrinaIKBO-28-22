import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        String genderString;
        if (gender == 'M') {
            genderString = "m";
        } else if (gender == 'F') {
            genderString = "ms";
        } else {
            genderString = "unknown";
        }
        return name + " (" + genderString + ") at " + email;
    }
}