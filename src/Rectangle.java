public class Rectangle {
    private double length;
    private double width;
    private String id;
    private String units;

    {
        int numId = (int) ((Math.random() * (9999 - 1000 + 1)) + 1000);
        id = String.valueOf(numId);
    }
    public Rectangle(double length, double width, String units) {
        if (length < 0){
            System.out.println("Invalid length");
        }
        if (width < 0){
            System.out.println("Invalid width");
        }

        this.length = length;
        this.width = width;
        this.units = units;
    }
    public Rectangle(double length, double width) {
        if (length < 0){
            System.out.println("Invalid length");
        }
        if (width < 0){
            System.out.println("Invalid width");
        }
        this.length = length;
        this.width = width;
        this.units = "units";
    }
    public Rectangle(double sideLength, String units) {
        if (length < 0){
            System.out.println("Invalid length");
        }
        if (width < 0){
            System.out.println("Invalid width");
        }
        this.length = sideLength;
        this.width = sideLength;
        this.units = units;
    }
    public Rectangle() {
        if (length < 0){
            System.out.println("Invalid length");
        }
        if (width < 0){
            System.out.println("Invalid width");
        }
        this.length = 1;
        this.width = 1;
        this.units = "units";
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }else  {
            System.out.println("length is invalid");
            System.out.println("Length is not set");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }else   {
            System.out.println("width is invalid");
            System.out.println("Width is not set");
        }
    }

    public String getId() {
        return id;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        if  (units != null && !units.isEmpty()) {
            this.units = units;
        }else  {
            System.out.println("units is invalid");
            System.out.println("units is not set");
        }
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }
    public double calculateDiagonal() {
        return Math.sqrt(length * length + width * width);
    }
    public boolean isSquare() {
        return length == width;
    }
    public boolean isLargerThan(Rectangle other) {
        double thisArea = calculateArea();
        double otherArea = other.calculateArea();
        return thisArea > otherArea;
    }
    public boolean isSamesize(Rectangle other) {
        double thisArea = calculateArea();
        double otherArea = other.calculateArea();
        return thisArea == otherArea;
    }
    public void scale(double factor){
        this.length *= factor;
        this.width *= factor;
    }

    public String getinfo(){
        return "Length: " + length + ", width: " + width + ", id: " + id + ", units: " + units + ", Area " + calculateArea() +
                ", Perimeter: " + calculatePerimeter() + ", Diagonal: " + calculateDiagonal() + ", Is Square: " + isSquare();
    }

    public String toString() {
        return "Rectangle{width=" + width + ", length=" + length + ", id=" + id + ", units=" + units + "}";
    }

}
