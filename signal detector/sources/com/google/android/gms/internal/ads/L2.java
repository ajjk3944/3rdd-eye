package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class L2 {

    /* renamed from: b, reason: collision with root package name */
    public T0 f9599b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2100x0 f9600c;

    /* renamed from: d, reason: collision with root package name */
    public J2 f9601d;

    /* renamed from: e, reason: collision with root package name */
    public long f9602e;

    /* renamed from: f, reason: collision with root package name */
    public long f9603f;

    /* renamed from: g, reason: collision with root package name */
    public long f9604g;

    /* renamed from: h, reason: collision with root package name */
    public int f9605h;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public long f9607k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9608l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9609m;

    /* renamed from: a, reason: collision with root package name */
    public final H2 f9598a = new H2();

    /* renamed from: j, reason: collision with root package name */
    public C0697Ql f9606j = new C0697Ql();

    public void a(boolean z6) {
        int i;
        if (z6) {
            this.f9606j = new C0697Ql();
            this.f9603f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.f9605h = i;
        this.f9602e = -1L;
        this.f9604g = 0L;
    }

    public abstract long b(C2036vr c2036vr);

    public abstract boolean c(C2036vr c2036vr, long j6, C0697Ql c0697Ql);

    public void d(long j6) {
        this.f9604g = j6;
    }
}
