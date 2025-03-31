import java.util.Objects;

public class Comedy extends Movie {
    private String genre;

    public Comedy(String title, int year, Person director, String genre) {
        super(title, year, director);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        String sb = "Comedy{" + super.toString() +
                ", genre='" + genre + '\'' +
                '}';
        return sb;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Comedy that)) return false;
        if (!super.equals(other)) return false;
        return this.genre.equals(that.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), genre);
    }
}
