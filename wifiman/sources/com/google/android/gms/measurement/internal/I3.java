package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class I3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f35931a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f35932b;

    I3(A3 a32, String str) {
        this.f35931a = str;
        this.f35932b = a32;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f35932b.f35772a.K0();
        return this.f35932b.f35772a.v0().d1(this.f35931a);
    }
}
