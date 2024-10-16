public class MainCricle {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        Cricle c1 = new Cricle();
        System.out.println(c1);
        Cricle c2 = new Cricle();
        System.out.println(c2);

        System.out.println("Area: "+c1.Area());
        System.out.println("circumference: "+c1.Circumference());
        System.out.println("radius is: "+c1.getRadius());

    }


}
