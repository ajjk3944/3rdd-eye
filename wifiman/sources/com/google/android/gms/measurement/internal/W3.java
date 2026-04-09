package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class W3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ L f36246a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36247b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ A3 f36248c;

    W3(A3 a32, L l10, String str) {
        this.f36246a = l10;
        this.f36247b = str;
        this.f36248c = a32;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f36248c.f35772a.K0();
        return this.f36248c.f35772a.E0().u(this.f36246a, this.f36247b);
    }
}
