package com.example.bijan.receiverintent1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver2 extends BroadcastReceiver {
    public MyReceiver2() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Receiver2", Toast.LENGTH_SHORT).show();
        abortBroadcast();
    }
}
