public class Main {
    public static void main(String[] args) {

        Point originOne = new Point(12, 69);
        Rectangle rectOne = new Rectangle();
        Rectangle rectTwo = new Rectangle();
      /*  Rectangle rectOne = new Rectangle(originOne, 200, 300);
        Rectangle rectTwo = new Rectangle(50, 100);*/

        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: "+ rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());

        rectTwo.origin = originOne;

        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo:" + rectTwo.origin.y);

        /*rectTwo.move(59, 32);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);*/
    }
}
