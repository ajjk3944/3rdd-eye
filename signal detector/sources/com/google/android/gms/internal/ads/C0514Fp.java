package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514Fp {

    /* renamed from: a, reason: collision with root package name */
    public long f8190a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f8191b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f8192c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f8193d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f8194e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8195f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final Object f8196g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final Object f8197h = new Object();
    public final Object i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final Object f8198j = new Object();

    public final synchronized void a(long j6) {
        synchronized (this.f8195f) {
            this.f8190a = j6;
        }
    }

    public final synchronized long b() {
        long j6;
        synchronized (this.f8195f) {
            j6 = this.f8190a;
        }
        return j6;
    }

    public final void c(int i) {
        synchronized (this.f8196g) {
            this.f8191b = i;
        }
    }

    public final int d() {
        int i;
        synchronized (this.f8196g) {
            i = this.f8191b;
        }
        return i;
    }

    public final synchronized long e() {
        long j6;
        synchronized (this.i) {
            j6 = this.f8193d;
        }
        return j6;
    }

    public final synchronized long f() {
        long j6;
        synchronized (this.f8198j) {
            j6 = this.f8194e;
        }
        return j6;
    }
}
