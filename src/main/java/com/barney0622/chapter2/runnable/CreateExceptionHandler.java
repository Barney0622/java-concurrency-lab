package com.barney0622.chapter2.runnable;

public class CreateExceptionHandler {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            throw new RuntimeException("Intentional Exception");
        });

        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A critical error happened in thread " + t.getName()
                        + " the error is " + e.getMessage());
            }
        });

        thread.start();
    }
}
