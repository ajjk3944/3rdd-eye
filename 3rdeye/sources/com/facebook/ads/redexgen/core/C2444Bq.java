package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2444Bq extends BroadcastReceiver {
    public final /* synthetic */ C2449Bv A00;

    public C2444Bq(C2449Bv c2449Bv) {
        this.A00 = c2449Bv;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.A00.A03();
    }
}
