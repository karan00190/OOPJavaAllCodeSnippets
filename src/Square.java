public class Square extends AbstractionExample implements Drawable,Movable {
    private double side;
    private int x, y;

    public Square(String color,double side,int x, int y)
    {
        super(color);
        this.side = side;
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculateArea()
    {
        return side* side;
    }
    @Override
    public double calculatePerimeter()
    {
        return 4 * side;
    }
    @Override
    public void draw()
    {
        System.out.println("Drawing a square at" + x+", +y");
    }
    @Override
    public void resize(double factor) {
        side *= factor;
        System.out.println("Resized square, new side: " + side);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Moved square to (" + x + ", " + y + ")");
    }

    @Override
    public int getX() { return x; }

    @Override
    public int getY() { return y; }
}
