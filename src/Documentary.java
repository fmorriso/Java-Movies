import java.util.Objects;

public class Documentary extends Movie {

    private Person narrator;

    public Documentary(String title, int year, Person director, Person narrator) {
        super(title, year, director);
        this.narrator = narrator;
    }

    public Person getNarrator() {return narrator;}
    public void setNarrator(Person narrator) {this.narrator = narrator;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Documentary{")
                .append(super.toString())
                .append(", narrator=").append(narrator)
                .append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Documentary)) return false;
        if (!super.equals(other)) return false;
        Documentary that = (Documentary) other;
        return this.narrator.equals(that.narrator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), narrator);
    }
}
