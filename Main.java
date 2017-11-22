public class Main {
    public static void main(String[] args) {
        Segment segment1=new Segment(1,1,2,2);
        Segment segment2=new Segment(-3,0,1,1);
        if (segment1.lenEqual(segment2.getLen())){
            System.out.println("отрезки равны");
        }
        else {
            System.out.println("Отрезки неравны");
        }
    }
}
