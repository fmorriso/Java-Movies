public class Main {
    public static void main(String[] args) {
        Movie wonderfulLife = new Movie("It's a Wonderful life", 1946, new Person("Copra", "Frank"));
        System.out.println(wonderfulLife);

        Documentary shackletonSurvival = new Documentary("Shackleton: The Greatest Story of Survival", 2022,
                new Person("Hansel","Bobbi"), new Person("Whenham","David"));
        System.out.println(shackletonSurvival);

        Comedy royalIsh = new Comedy("Royal-ish", 2021, new Person("Bobb","Roger"), "Romantic Comedy");
        royalIsh.addCastMember(new Person("Sakura","Nichole"));
        royalIsh.addCastMember(new Person("Dempsey","Brendan"));
        System.out.println(royalIsh);

        Comedy exactDuplicate = new Comedy("Royal-ish", 2021, new Person("Bobb","Roger"), "Romantic Comedy");
        exactDuplicate.addCastMember(new Person("Sakura","Nichole"));
        exactDuplicate.addCastMember(new Person("Dempsey","Brendan"));
        System.out.println(royalIsh.equals(exactDuplicate));

        Comedy almostTheSame = new Comedy("Royal-ish", 2021, new Person("Bobb","Roger"), "Romantic Comedy");
        royalIsh.addCastMember(new Person("Sakura","Nichole"));
        // royalIsh.addCastMember(new Person("Dempsey","Brendan"));
        System.out.println(royalIsh.equals(almostTheSame));

    }
}