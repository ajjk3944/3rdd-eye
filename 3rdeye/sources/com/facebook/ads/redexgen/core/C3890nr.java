package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.nr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3890nr implements C3T {
    @Override // com.facebook.ads.redexgen.core.C3T
    public final C3888np A5H(Looper looper, Handler.Callback callback) {
        return new C3888np(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.core.C3T
    public final long A6B() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.core.C3T
    public final long AJt() {
        return SystemClock.uptimeMillis();
    }
}
