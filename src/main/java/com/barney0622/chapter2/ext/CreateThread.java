package com.barney0622.chapter2.ext;

public class CreateThread {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
    }

    private static class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from " + this.getName());
        }
    }
}
