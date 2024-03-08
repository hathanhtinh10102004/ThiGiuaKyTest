public class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Move() {
    }


    public void Say() {
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Say() {
        System.out.println("gau gau");
    }

    @Override
    public void Move() {
        System.out.println("chay, nhảy , múa...");
    }
}

class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void Say(){
        System.out.println("meo meo");
    }

    @Override
    public void Move(){
        System.out.println("nhay , múa , đi , chạy");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void Say() {
        System.out.println("hot");
    }

    @Override
    public void Move() {
        System.out.println("bay , nhảy , múa...");
    }
}

class test {
    public static void main(String[] args) {
        Animal dog = new Dog("mun", 10);
        System.out.println(dog.toString());
        dog.Say();
        dog.Move();

        Animal cat = new Cat("xuka", 24);
        System.out.println(cat.toString());
        cat.Say();
        cat.Move();

        Animal bird = new Bird("sao", 12);
        System.out.println(bird.toString());
        bird.Say();
        bird.Move();
    }
}


