package com.example.sendmessage;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Socket_creation extends AsyncTask<String,Void,Void> {

    protected Void doInBackground(String... voids) {
        String message=voids[0];
        try {
            Socket sock = new Socket("192.168.1.9", 8000);
            while (true) {
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                writer.println(message);
                writer.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
