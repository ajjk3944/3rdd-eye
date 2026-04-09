package com.wifihacker.detector.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.util.Log;
import com.wifihacker.detector.task.ScanNoticeService;
import g8.k;

/* loaded from: classes3.dex */
public class WiFiReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if (intent.getAction().equals("android.net.wifi.STATE_CHANGE") && ((NetworkInfo) intent.getParcelableExtra("networkInfo")).getState().equals(NetworkInfo.State.CONNECTED)) {
                context.startService(new Intent(context, (Class<?>) ScanNoticeService.class));
            }
        } catch (Exception e10) {
            k.b(Log.getStackTraceString(e10));
        }
    }
}
