class Hi extends Thread {
    public void run() {
        for (int index = 0; index < 5; index++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }

    }
}

class Hello extends Thread {
    public void run() {
        for (int index = 0; index < 5; index++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class MultiThread {

    public static void main(String[] args) {

        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        obj2.start();

    }

}
