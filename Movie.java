public class Movie {

    String title = "Inglourious Basterds";
    String director = "Quentin Tarantino";
    int rel_year = 2000;
    int run_time = 0;
    int buget = 0;
    int box_office = 0;

    static boolean watched = false;
    static boolean want_to_watch = false;

    public static void watch() {
        watched = true;
    }
    public static void add_to_list() {
        want_to_watch = true;
    }

    public void printBuget() {
        System.out.println("Buget: " + buget);
        }


}