package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fy0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f11289a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11290b;

    public fy0(Runnable runnable, long j) {
        this.f11289a = runnable;
        this.f11290b = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f11290b, ((fy0) obj).f11290b);
    }
}
