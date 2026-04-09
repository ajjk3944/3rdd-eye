package com.liuzh.deviceinfo.alive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cg.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class AliveReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        a.f2848b.g();
        CoreService.a(context);
    }
}
