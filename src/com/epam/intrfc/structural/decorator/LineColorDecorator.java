package com.epam.intrfc.structural.decorator;

public class LineColorDecorator extends ShapeDecorator {
    protected Color color;

    public LineColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line Color: " + color);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with " + color + " color.";
    }

    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }
}
