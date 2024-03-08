public class Vehicle {
    private String trademark;
    private String color;

    public Vehicle() {

    }

    public Vehicle(String trademark, String color) {
        this.trademark = trademark;
        this.color = color;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "trademark='" + trademark + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void KhoiDong() {

    }

    public void TangToc() {

    }

    public void DungLai() {

    }
}

//Car, Motorcycle, Truck.
class Car extends Vehicle {
    public Car(String trademark, String color) {
        super(trademark, color);
    }

    @Override
    public void KhoiDong() {
        System.out.println("khỏi động động cơ xe ô tô:");
    }

    @Override
    public void TangToc() {
        System.out.println("xe đang tăng tốc:");
    }

    @Override
    public void DungLai() {
        System.out.println("xe dừng lại:");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String trademark, String color) {
        super(trademark, color);
    }

    @Override
    public void KhoiDong() {
        System.out.println("khỏi động động cơ xe ô tô:");
    }

    @Override
    public void TangToc() {
        System.out.println("xe đang tăng tốc:");
    }

    @Override
    public void DungLai() {
        System.out.println("xe dừng lại:");
    }
}

class Truck extends Vehicle {
    public Truck(String trademark, String color) {
        super(trademark, color);
    }

    @Override
    public void KhoiDong() {
        System.out.println("khỏi động động cơ xe ô tô:");
    }

    @Override
    public void TangToc() {
        System.out.println("xe đang tăng tốc:");
    }

    @Override
    public void DungLai() {
        System.out.println("xe dừng lại:");
    }
}

class tests{
    public static void main(String[] args) {
        Vehicle car = new Car("audi", "đen");
        System.out.println(car.toString());
        car.KhoiDong();
        car.TangToc();
        car.DungLai();

        Vehicle motorcycle  = new Car("honda", "đen");
        System.out.println(motorcycle.toString());
        car.KhoiDong();
        car.TangToc();
        car.DungLai();

        Vehicle truck = new Car("cua long", "đen");
        System.out.println(truck.toString());
        car.KhoiDong();
        car.TangToc();
        car.DungLai();
    }
}



