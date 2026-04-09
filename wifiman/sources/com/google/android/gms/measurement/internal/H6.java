package com.google.android.gms.measurement.internal;

import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class H6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.d f35922a;

    /* renamed from: b, reason: collision with root package name */
    private long f35923b;

    public H6(com.google.android.gms.common.util.d dVar) {
        AbstractC7901p.l(dVar);
        this.f35922a = dVar;
    }

    public final void a() {
        this.f35923b = 0L;
    }

    public final boolean b(long j10) {
        return this.f35923b == 0 || this.f35922a.c() - this.f35923b >= 3600000;
    }

    public final void c() {
        this.f35923b = this.f35922a.c();
    }
}
