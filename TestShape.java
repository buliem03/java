public class TestShape {
    public static void main(String[] args) {
        Circle      s1 = new Circle(5);
        Rectangle   s2 = new Rectangle(1, 9);
        Square      s3 = new Square(12);
        System.out.println(s1);
        System.out.println("Circle Area is "+s1.getArea()+"\nCircle perimeter is "+s1.getPerimeter());
        System.out.println(s2);
        System.out.println("Rectangle Area is "+s2.getArea()+"\nRectangle perimeter is "+s2.getPerimeter());
        System.out.println(s3);
        System.out.println("Square Area is "+s3.getArea()+"\nSquare perimeter is "+s3.getPerimeter());
        System.out.println(); 
    }
}
