package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o8 implements j8 {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f14601l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final e9 f14602a;

    /* renamed from: b, reason: collision with root package name */
    public final sk0 f14603b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f14604c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final m8 f14605d;

    /* renamed from: e, reason: collision with root package name */
    public final x8 f14606e;

    /* renamed from: f, reason: collision with root package name */
    public n8 f14607f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public String f14608h;

    /* renamed from: i, reason: collision with root package name */
    public u2 f14609i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f14610k;

    public o8(e9 e9Var) {
        this.f14602a = e9Var;
        m8 m8Var = new m8();
        m8Var.f13799e = new byte[128];
        this.f14605d = m8Var;
        this.f14610k = -9223372036854775807L;
        this.f14606e = new x8(178);
        this.f14603b = new sk0();
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void a(boolean z3) {
        n8 n8Var = this.f14607f;
        n8Var.getClass();
        if (z3) {
            n8Var.b(this.g, 0, this.j);
            n8 n8Var2 = this.f14607f;
            n8Var2.f14174b = false;
            n8Var2.f14175c = false;
            n8Var2.f14176d = false;
            n8Var2.f14177e = -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void b() {
        ls.S(this.f14604c);
        m8 m8Var = this.f14605d;
        m8Var.f13795a = false;
        m8Var.f13797c = 0;
        m8Var.f13796b = 0;
        n8 n8Var = this.f14607f;
        if (n8Var != null) {
            n8Var.f14174b = false;
            n8Var.f14175c = false;
            n8Var.f14176d = false;
            n8Var.f14177e = -1;
        }
        this.f14606e.a();
        this.g = 0L;
        this.f14610k = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void c(int i4, long j) {
        this.f14610k = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    @Override // com.google.android.gms.internal.ads.j8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.sk0 r20) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o8.d(com.google.android.gms.internal.ads.sk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void e(z1 z1Var, h9 h9Var) {
        h9Var.a();
        h9Var.b();
        this.f14608h = h9Var.f11777e;
        h9Var.b();
        u2 u2VarM = z1Var.m(h9Var.f11776d, 2);
        this.f14609i = u2VarM;
        this.f14607f = new n8(u2VarM);
        this.f14602a.a(z1Var, h9Var);
    }
}
