package app.shapes;

import static java.lang.String.format;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    @Override
    public String describe() {
        return format("""
                It is rectangle.
                Width is %d.
                Height is %d.
                """, width, height);
    }
}
