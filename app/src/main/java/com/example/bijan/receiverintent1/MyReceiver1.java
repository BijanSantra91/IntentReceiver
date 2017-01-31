package com.example.bijan.receiverintent1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver1 extends BroadcastReceiver {
    public MyReceiver1() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Receiver1", Toast.LENGTH_SHORT).show();
    }
}
