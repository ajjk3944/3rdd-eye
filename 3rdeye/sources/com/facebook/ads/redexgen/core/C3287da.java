package com.facebook.ads.redexgen.core;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.da, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3287da extends ContentObserver {
    public final C2481Dc A00;

    public C3287da(Handler handler, C2481Dc c2481Dc) {
        super(handler);
        this.A00 = c2481Dc;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.A00.A0f();
    }
}
