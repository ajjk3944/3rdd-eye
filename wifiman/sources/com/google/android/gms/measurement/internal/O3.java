package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class O3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f36145a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36146b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f36147c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ A3 f36148d;

    O3(A3 a32, String str, String str2, String str3) {
        this.f36145a = str;
        this.f36146b = str2;
        this.f36147c = str3;
        this.f36148d = a32;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f36148d.f35772a.K0();
        return this.f36148d.f35772a.v0().I0(this.f36145a, this.f36146b, this.f36147c);
    }
}
