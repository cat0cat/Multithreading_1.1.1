public class Main {

    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        System.out.println("Создаю потоки...");
        final Thread thread1 = new MyThread(mainGroup, "поток 1");
        final Thread thread2 = new MyThread(mainGroup, "поток 2");
        final Thread thread3 = new MyThread(mainGroup, "поток 3");
        final Thread thread4 = new MyThread(mainGroup, "поток 4");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();
    }


}