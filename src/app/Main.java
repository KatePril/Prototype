package app;

import app.shapes.Shape;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Application application = new Application();
        ArrayList<Shape> shapes = application.businessLogic();

        for (Shape shape : shapes) {
            System.out.println(shape.describe());
        }
    }
}
