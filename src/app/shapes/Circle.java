package app.shapes;

import static java.lang.String.format;

public class Circle extends Shape{
    public int radius;

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public String describe() {
        return format("""
                It is circle.
                Radius is %d.
                """, radius);
    }
}
