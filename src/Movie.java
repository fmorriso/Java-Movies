import java.util.ArrayList;

public class Movie {
    private String title;
    private int year;
    private Person director;
    private ArrayList<Person> cast = new ArrayList<>();

    public Movie(String title, int year, Person director) {
        this.title = title;
        this.year = year;
        this.director = director;
    }

    public String getTitle() {return title;}
    public int getYear() {return year;}
    public Person getDirector() {return director;}
    public ArrayList<Person> getCast() {return cast;}

    public void setTitle(String title) {this.title = title;}
    public void setYear(int year) {this.year = year;}
    public void setDirector(Person director) {this.director = director;}

    public void addCastMember(Person person) {
        if(!cast.contains(person)) cast.add(person);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) return true;
        if(!(other instanceof Movie)) return false;
        Movie that = (Movie) other;

        // make sure the casts of each movie are the same
        if(that.cast.size() != cast.size()) return false;
        for(Person person : cast) {
            if(!that.cast.contains(person)) return false;
        }

        // verify the other details of the two movies are the same
        return     this.title.equals(that.title)
                && this.year == that.year
                && this.director.equals(that.director);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("title='").append(title).append('\'');
        sb.append(", year=").append(year);
        sb.append(", director=").append(director);
        sb.append(", cast=").append(cast);
        sb.append('}');
        return sb.toString();
    }
}
