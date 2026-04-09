package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class l6 {

    /* renamed from: b, reason: collision with root package name */
    public u2 f13384b;

    /* renamed from: c, reason: collision with root package name */
    public z1 f13385c;

    /* renamed from: d, reason: collision with root package name */
    public j6 f13386d;

    /* renamed from: e, reason: collision with root package name */
    public long f13387e;

    /* renamed from: f, reason: collision with root package name */
    public long f13388f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public int f13389h;

    /* renamed from: i, reason: collision with root package name */
    public int f13390i;

    /* renamed from: k, reason: collision with root package name */
    public long f13391k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13392l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13393m;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.o f13383a = new androidx.recyclerview.widget.o();
    public ce1 j = new ce1(2);

    public void a(boolean z3) {
        int i4;
        if (z3) {
            this.j = new ce1(2);
            this.f13388f = 0L;
            i4 = 0;
        } else {
            i4 = 1;
        }
        this.f13389h = i4;
        this.f13387e = -1L;
        this.g = 0L;
    }

    public abstract long b(sk0 sk0Var);

    public abstract boolean c(sk0 sk0Var, long j, ce1 ce1Var);

    public void d(long j) {
        this.g = j;
    }
}
