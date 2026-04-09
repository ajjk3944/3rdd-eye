package com.instagram.common.viewpoint.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06144o extends BroadcastReceiver {
    public final /* synthetic */ C06154p A00;

    public C06144o(C06154p c06154p) {
        this.A00 = c06154p;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iA00 = C06154p.A00(context);
        if (C5C.A02 >= 31 && iA00 == 5) {
            C06124m.A02(context, this.A00);
        } else {
            this.A00.A07(iA00);
        }
    }
}
