package com.water.main;


import com.water.decorator.Border;
import com.water.decorator.Red;
import com.water.shape.Circle;
import com.water.shape.Rectangle;
import com.water.shape.Shape;

/**
 * Created by water on 14-12-21.
 */
public class ShapeMaker {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape redRectangle = new Red(new Rectangle());
        redRectangle.draw();

        Shape redCircle = new Red(new Circle());
        redCircle.draw();

        Shape borderRectangle = new Border(new Rectangle());
        borderRectangle.draw();

        Shape borderCircle = new Border(new Circle());
        borderCircle.draw();


    }
}
