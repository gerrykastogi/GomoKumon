package main;

import util.Response;

/**
 * Created by elvan_owen on 11/26/15.
 */
public class Listener implements Runnable {
    private Thread t;
    private String name;
    private Response response;

    public Listener(String name){
        this.name = name;

        System.out.println("Created " + name);
        this.start();
    }

    public void run() {
        response = new Response();

        gomokumon.Gomokumon.response = this.response;
        response.listen();

        System.out.println(name + " exiting.");
    }

    public void start ()
    {
        System.out.println(name + " starting");
        if (t == null) {
            t = new Thread (this, name);
            t.start ();
        }
    }
}
