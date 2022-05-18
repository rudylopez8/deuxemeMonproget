public class Cercle {
    public Point centre;
    public double rayon;
    
//        public Cercle(Point a,double b) {
//            this.centre=a;
//            this.rayon=b;
//        }
@Override    
        public String toString() {
            return "centre : " + this.centre + " rayon : " + this.rayon;
        }

        public Cercle(Point centre, double rayon) {
            this.centre = centre;
            this.rayon = rayon;
        }
        public Cercle(double x, double y, double rayon) {
            this.centre=new Point(x,y);
            this.rayon=rayon;
        }
    
    }

