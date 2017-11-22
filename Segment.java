public class Segment {
   private double x1;
   private double y1;
   private double x2;
   private double y2;
   private double len;

    public Segment(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        len=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    public double getLen() {
        return len;
    }

    public boolean lenEqual(Double length){
        if (length.equals(len)){
            return true;
        }
        return false;
    }
}
