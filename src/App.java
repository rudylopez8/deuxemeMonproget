public class App {
    public static void main(String[] args) throws Exception {
        Point p = new Point(0, 0);
        System.out.println(p);
        Cercle c = new Cercle(p, 1);
        System.out.println(c);
        long conpteurpoint = 0;
        long nbboucle = 200000000000l;
        for (long i = 0; i < nbboucle; i++) {
            Point z = new Point(2 * Math.random() - 1, 2 * Math.random() - 1);
            double d = Point.distance(z, c.centre);
            if (d < c.rayon)
                conpteurpoint++;
        }
        double resulta = (4.0 * conpteurpoint) / nbboucle;
        System.out.println(resulta);

    }
}