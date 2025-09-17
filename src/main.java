public class main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 3, "cm");
        Rectangle rectangle2 = new Rectangle(4, 4, "inch");
        Rectangle unitrectangle = new Rectangle(7, 7);
        Rectangle square = new Rectangle(3, "m");
        Rectangle default_rect = new Rectangle();

        System.out.println("=== Rectangle Calculator Demo ===");
        System.out.println("Rectangle " + rectangle1.getId() + " created");
        System.out.println("Rectangle " + rectangle2.getId() + " created");
        System.out.println("Rectangle " + unitrectangle.getId() + " created");
        System.out.println("Rectangle " + square.getId() + " created");
        System.out.println("Rectangle " + default_rect.getId() + " created");

        System.out.println();

        System.out.println("Rectangle 1:" + rectangle1);
        System.out.println("Rectangle 2:" + rectangle2);
        System.out.println("Rectangle 3:" + unitrectangle);
        System.out.println("Rectangle 3:" + square);
        System.out.println("Rectangle 3:" + default_rect);

        System.out.println();
        System.out.println("=== Calculation Tests ===");

        System.out.println("Rectangle id :" + rectangle1.getId() + " (" + rectangle1.getLength() + " x " + rectangle1.getWidth() + "):");
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter());
        System.out.println("Diagonal: " + rectangle1.calculateDiagonal());
        System.out.println("Is square: "  + rectangle1.isSquare());

        System.out.println();

        System.out.println("Rectangle id :" + rectangle2.getId() + " (" + rectangle2.getLength() + " x " + rectangle2.getWidth() + "):");
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());
        System.out.println("Diagonal: " + rectangle2.calculateDiagonal());
        System.out.println("Is square: "  + rectangle2.isSquare());

        System.out.println();

        System.out.println("=== Comparison Tests ===");

        System.out.println("Is rectangle1 larger than rectangle2: " + rectangle1.isLargerThan(rectangle2));
        System.out.println("Are rectangle2 and rectangle3 the same size: " + rectangle2.isSamesize(unitrectangle));
        System.out.println("Rectangle1 is smaller then rectangle2: " + rectangle2.isLargerThan(rectangle1));

        System.out.println();

        System.out.println("=== Scaling Tests ===");
        System.out.println("Original rectangle: " + rectangle1);
        rectangle1.scale(2);
        System.out.println("New rectangle: " + rectangle1);
        System.out.println("Area: " + rectangle1.calculateArea());
    }
}
