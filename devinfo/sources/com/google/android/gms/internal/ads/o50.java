package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o50 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f14565a;

    public o50(dq0 dq0Var) {
        AtomicLong atomicLong = new AtomicLong();
        this.f14565a = atomicLong;
        atomicLong.set(((hq0) dq0Var.f10543a.f15651b).f11959u.get());
    }

    public final void a(long j) {
        this.f14565a.set(j);
    }
}
