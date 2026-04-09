package com.google.android.gms.common.util;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class g implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final g f34875a = new g();

    private g() {
    }

    public static d d() {
        return f34875a;
    }

    @Override // com.google.android.gms.common.util.d
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.d
    public final long b() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.d
    public final long c() {
        return SystemClock.elapsedRealtime();
    }
}
