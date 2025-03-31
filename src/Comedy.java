import java.util.Objects;

public class Comedy extends Movie {
    private String genre;

    public Comedy(String title, int year, Person director, String genre) {
        super(title, year, director);
        this.genre = genre;
    }

    public String getGenre() {return genre;}
    public void setGenre(String genre) {this.genre = genre;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Comedy{")
                .append(super.toString())
                .append(", genre='").append(genre).append('\'')
                .append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Comedy)) return false;
        if (!super.equals(other)) return false;
        Comedy that = (Comedy) other;
        return this.genre.equals(that.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), genre);
    }
}
