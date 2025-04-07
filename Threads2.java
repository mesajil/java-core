import java.util.concurrent.atomic.AtomicInteger;

public class Threads2 {
  private static AtomicInteger num = new AtomicInteger(0);

  public static void count() {
    num.incrementAndGet();
  }

  public static void main(String[] args) {
    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 9999; i++) {
        count();
      }
    });

    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 9999; i++) {
        count();
      }
    });

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(Thread.currentThread().getName() + " - Count: " + num);
  }
}
