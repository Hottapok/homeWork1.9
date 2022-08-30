import java.util.Objects;

public class Authore {
    private String firstName;
    private String familyName;

    public Authore(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    @Override
    public String toString() {
        return firstName + " " + familyName;
    }

    @Override
    public boolean equals(Object object) {
        if (this.getClass()!=object.getClass()){
            return false;}
        Authore authore= (Authore) object;
        return familyName.equals(authore.familyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(familyName);
    }
}
