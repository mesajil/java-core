interface Computer {
  void code();
}

class Laptop implements Computer {
    @Override
    public void code() {
        System.out.println("Coding on a laptop...");
    }
}

class Developer {
    void devApp(Computer pc) {
        pc.code();
    }
}

public class Hiring {
    public static void main(String[] args) {
        Developer dev = new Developer();
        Laptop lap = new Laptop();
        Computer desktop = () -> System.out.println("Coding on a desktop...");
        dev.devApp(lap);
        dev.devApp(desktop);
    }
}
