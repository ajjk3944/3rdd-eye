package com.instagram.common.viewpoint.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C02364o extends BroadcastReceiver {
    public final /* synthetic */ C02374p A00;

    public C02364o(C02374p c02374p) {
        this.A00 = c02374p;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iA00 = C02374p.A00(context);
        if (C5C.A02 >= 31 && iA00 == 5) {
            C02344m.A02(context, this.A00);
        } else {
            this.A00.A07(iA00);
        }
    }
}
