package com.example.bijan.receiverintent1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver3 extends BroadcastReceiver {
    public MyReceiver3() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Receiver3", Toast.LENGTH_SHORT).show();
    }
}
