package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w8 implements j8 {

    /* renamed from: e, reason: collision with root package name */
    public String f17931e;

    /* renamed from: f, reason: collision with root package name */
    public u2 f17932f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17934i;

    /* renamed from: k, reason: collision with root package name */
    public int f17935k;

    /* renamed from: l, reason: collision with root package name */
    public int f17936l;

    /* renamed from: n, reason: collision with root package name */
    public int f17938n;

    /* renamed from: o, reason: collision with root package name */
    public int f17939o;

    /* renamed from: s, reason: collision with root package name */
    public int f17943s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17945u;

    /* renamed from: d, reason: collision with root package name */
    public int f17930d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final sk0 f17927a = new sk0(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final hk0 f17928b = new hk0();

    /* renamed from: c, reason: collision with root package name */
    public final sk0 f17929c = new sk0();

    /* renamed from: p, reason: collision with root package name */
    public final e5 f17940p = new e5();

    /* renamed from: q, reason: collision with root package name */
    public int f17941q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f17942r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f17944t = -1;
    public boolean j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17937m = true;
    public double g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f17933h = -9.223372036854776E18d;

    @Override // com.google.android.gms.internal.ads.j8
    public final void b() {
        this.f17930d = 0;
        this.f17936l = 0;
        this.f17927a.y(2);
        this.f17938n = 0;
        this.f17939o = 0;
        this.f17941q = -2147483647;
        this.f17942r = -1;
        this.f17943s = 0;
        this.f17944t = -1L;
        this.f17945u = false;
        this.f17934i = false;
        this.f17937m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.f17933h = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void c(int i4, long j) {
        this.f17935k = i4;
        if (!this.j && (this.f17939o != 0 || !this.f17937m)) {
            this.f17934i = true;
        }
        if (j != -9223372036854775807L) {
            double d10 = j;
            if (this.f17934i) {
                this.f17933h = d10;
            } else {
                this.g = d10;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04be A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.j8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.sk0 r28) throws com.google.android.gms.internal.ads.ua {
        /*
            Method dump skipped, instructions count: 1404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w8.d(com.google.android.gms.internal.ads.sk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void e(z1 z1Var, h9 h9Var) {
        h9Var.a();
        h9Var.b();
        this.f17931e = h9Var.f11777e;
        h9Var.b();
        this.f17932f = z1Var.m(h9Var.f11776d, 1);
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void a(boolean z3) {
    }
}
