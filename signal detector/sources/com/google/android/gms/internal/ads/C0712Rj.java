package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.Rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712Rj {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f11035a;

    public C0712Rj(Xt xt) {
        AtomicLong atomicLong = new AtomicLong();
        this.f11035a = atomicLong;
        atomicLong.set(((C0960bu) xt.f12509a.f10110b).f13498u.get());
    }

    public final void a(long j6) {
        this.f11035a.set(j6);
    }
}
