package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bm1 extends zl1 {

    /* renamed from: a, reason: collision with root package name */
    public final km1 f9723a = new km1();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof bm1) && ((bm1) obj).f9723a.equals(this.f9723a);
        }
        return true;
    }

    public final zl1 f(String str) {
        return (zl1) this.f9723a.get(str);
    }

    public final int hashCode() {
        return this.f9723a.hashCode();
    }
}
