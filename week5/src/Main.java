public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        String s1 = new String("a");
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);


        Point p2 = new Point(3,4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);

        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);

        int sideA;
        Rectangle r1 = new Rectangle(
                p3,
                sideA:4,
                sideB:5
        );

        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft());
        System.out.println(r1.getTopLeft().xCoord);
        System.out.println(r1.getTopLeft().yCoord);

        System.out.println(r1.perimeter());
        System.out.println(r1.area());



    }
}