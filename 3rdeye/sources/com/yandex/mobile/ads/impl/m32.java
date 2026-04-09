package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class m32 implements dp {
    @Override // com.yandex.mobile.ads.impl.dp
    public final long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.yandex.mobile.ads.impl.dp
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.yandex.mobile.ads.impl.dp
    public final bf0 a(Looper looper, Handler.Callback callback) {
        return new o32(new Handler(looper, callback));
    }
}
