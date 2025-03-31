import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

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

    /**
     * {@return a hash code value for this object} This method is
     * supported for the benefit of hash tables such as those provided by
     * {@link HashMap}.
     * <p>
     * The general contract of {@code hashCode} is:
     * <ul>
     * <li>Whenever it is invoked on the same object more than once during
     *     an execution of a Java application, the {@code hashCode} method
     *     must consistently return the same integer, provided no information
     *     used in {@code equals} comparisons on the object is modified.
     *     This integer need not remain consistent from one execution of an
     *     application to another execution of the same application.
     * <li>If two objects are equal according to the {@link
     *     #equals(Object) equals} method, then calling the {@code
     *     hashCode} method on each of the two objects must produce the
     *     same integer result.
     * <li>It is <em>not</em> required that if two objects are unequal
     *     according to the {@link #equals(Object) equals} method, then
     *     calling the {@code hashCode} method on each of the two objects
     *     must produce distinct integer results.  However, the programmer
     *     should be aware that producing distinct integer results for
     *     unequal objects may improve the performance of hash tables.
     * </ul>
     *
     * @implSpec As far as is reasonably practical, the {@code hashCode} method defined
     * by class {@code Object} returns distinct integers for distinct objects.
     * @apiNote The {@link Objects#hash(Object...) hash} and {@link
     * Objects#hashCode(Object) hashCode} methods of {@link
     * Objects} can be used to help construct simple hash codes.
     * @see Object#equals(Object)
     * @see System#identityHashCode
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) return true;
        if(!(other instanceof Movie)) return false;
        Movie that = (Movie) other;
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
