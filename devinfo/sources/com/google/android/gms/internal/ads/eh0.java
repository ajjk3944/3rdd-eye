package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class eh0 {

    /* renamed from: a, reason: collision with root package name */
    public long f10785a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f10786b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f10787c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f10788d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f10789e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10790f = new Object();
    public final Object g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final Object f10791h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final Object f10792i = new Object();
    public final Object j = new Object();

    public final synchronized void a(long j) {
        synchronized (this.f10790f) {
            this.f10785a = j;
        }
    }

    public final synchronized long b() {
        long j;
        synchronized (this.f10790f) {
            j = this.f10785a;
        }
        return j;
    }

    public final void c(int i4) {
        synchronized (this.g) {
            this.f10786b = i4;
        }
    }

    public final int d() {
        int i4;
        synchronized (this.g) {
            i4 = this.f10786b;
        }
        return i4;
    }

    public final synchronized long e() {
        long j;
        synchronized (this.f10792i) {
            j = this.f10788d;
        }
        return j;
    }

    public final synchronized long f() {
        long j;
        synchronized (this.j) {
            j = this.f10789e;
        }
        return j;
    }
}
