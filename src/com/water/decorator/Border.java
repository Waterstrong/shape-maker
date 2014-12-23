package com.water.decorator;

import com.water.shape.Shape;

/**
 * Created by water on 14-12-21.
 */
public class Border extends ShapeDecorator {
    public Border(Shape shape) {
        super(shape);
    }

    public void draw() {
        super.draw();
        System.out.println("with border");
    }
}
