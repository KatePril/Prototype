package app;

import app.shapes.Circle;
import app.shapes.Rectangle;
import app.shapes.Shape;

import java.util.ArrayList;

public class Application {
    public ArrayList<Shape> shapes = new ArrayList<>();

    public Application() {
        Circle circle = new Circle();
        circle.X = 10;
        circle.Y = 10;
        circle.radius = 20;
        shapes.add(circle);

        Circle anotherCircle = circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);

        Rectangle anotherRectangle = rectangle.clone();
        shapes.add(anotherRectangle);
    }

    public ArrayList<Shape> businessLogic() {
        ArrayList<Shape> shapesCopy = new ArrayList<>();

        shapesCopy.addAll(shapes);

        return shapesCopy;
    }
}
