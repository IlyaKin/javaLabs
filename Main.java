package ru.gb.jtwo.chat.client;

public class Main extends Thread {

    static volatile char letter = 'A';
    static Object obj = new Object();

    static class WaitNotifyClass implements Runnable {
        private char currentLetter;
        private char nextLetter;

        public WaitNotifyClass(char currentLetter, char nextLetter) {
            this.currentLetter = currentLetter;
            this.nextLetter = nextLetter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (obj) {
                    try {
                        while (letter != currentLetter)
                            obj.wait();
                        System.out.print(currentLetter);
                        letter = nextLetter;
                        obj.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        new Thread(new WaitNotifyClass('A', 'B')).start();
        new Thread(new WaitNotifyClass('B', 'C')).start();
        new Thread(new WaitNotifyClass('C', 'A')).start();
    }
}

