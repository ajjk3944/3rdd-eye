package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class U4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f36225a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36226b;

    U4(C4945r4 c4945r4, long j10) {
        this.f36225a = j10;
        this.f36226b = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36226b.N0(this.f36225a);
        this.f36226b.q().R(new AtomicReference());
    }
}
