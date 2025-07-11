package Day12;

//Program to demonstrate inter-thread communication

import Day13.Consumer;

public class InterThreadCommunicationDemo {
    public static void main(String[] args) {

        //Shared Resource
        Q obj=new Q();

        Consumer.Producer p1=new Consumer.Producer(obj); //Producer thread
        Consumer c1=new Consumer(obj); //Consumer thread

        try {
            p1.join();
            c1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}//Program to demonstrate inter-thread communication


