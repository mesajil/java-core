public class Threads {
  private static int num = 0;

  public static synchronized void count() {
    num++;
    
  }

  public static void main(String[] args) {
    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        count();
      }
    }, "Thread-1");

    // Thread thread2 = new Thread(() -> {
    //   for (int i = 0; i < 100; i < 100; i++) {
    //     count();
    //   }
    // }, "Thread-2");

    thread1.start();
    // thread2.start();
    System.out.println(Thread.currentThread().getName() + " - Count: " + num);
  }
}
