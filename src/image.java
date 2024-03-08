public abstract class image {
    protected String color;

    public image(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static class Rectangle extends image {
        protected double width;
        protected double height;

        public Rectangle(String color, double width, double height) {
            super(color);
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (width + height);
        }

        public static class Circle extends image {
            protected double radius;

            public Circle(String color, double radius) {
                super(color);
                this.radius = radius;
            }

            public double getRadius() {
                return radius;
            }

            public void setRadius(double radius) {
                this.radius = radius;
            }

            @Override
            public double calculateArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public double calculatePerimeter() {
                return 2 * Math.PI * radius;
            }

            public static class Triangle extends image {
                protected double side1;
                protected double side2;
                protected double side3;

                public Triangle(String color, double side1, double side2, double side3) {
                    super(color);
                    this.side1 = side1;
                    this.side2 = side2;
                    this.side3 = side3;
                }

                public double getSide1() {
                    return side1;
                }

                public void setSide1(double side1) {
                    this.side1 = side1;
                }

                public double getSide2() {
                    return side2;
                }

                public void setSide2(double side2) {
                    this.side2 = side2;
                }

                public double getSide3() {
                    return side3;
                }

                public void setSide3(double side3) {
                    this.side3 = side3;
                }

                @Override
                public double calculateArea() {
                    double s = (side1 + side2 + side3) / 2;
                    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
                }

                @Override
                public double calculatePerimeter() {
                    return side1 + side2 + side3;
                }
            }
        }
    }
}

class main {
    public static void main(String[] args) {
        image.Rectangle rectangle = new image.Rectangle("Blue", 5.0, 5.0);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}


