package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l8 implements j8 {

    /* renamed from: r, reason: collision with root package name */
    public static final double[] f13402r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f13403a;

    /* renamed from: b, reason: collision with root package name */
    public u2 f13404b;

    /* renamed from: c, reason: collision with root package name */
    public final e9 f13405c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13406d;

    /* renamed from: e, reason: collision with root package name */
    public final sk0 f13407e;

    /* renamed from: f, reason: collision with root package name */
    public final x8 f13408f;
    public final boolean[] g = new boolean[4];

    /* renamed from: h, reason: collision with root package name */
    public final k8 f13409h;

    /* renamed from: i, reason: collision with root package name */
    public long f13410i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13411k;

    /* renamed from: l, reason: collision with root package name */
    public long f13412l;

    /* renamed from: m, reason: collision with root package name */
    public long f13413m;

    /* renamed from: n, reason: collision with root package name */
    public long f13414n;

    /* renamed from: o, reason: collision with root package name */
    public long f13415o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13416p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13417q;

    public l8(e9 e9Var, String str) {
        sk0 sk0Var;
        this.f13405c = e9Var;
        this.f13406d = str;
        k8 k8Var = new k8();
        k8Var.f13080d = new byte[128];
        this.f13409h = k8Var;
        if (e9Var != null) {
            this.f13408f = new x8(178);
            sk0Var = new sk0();
        } else {
            sk0Var = null;
            this.f13408f = null;
        }
        this.f13407e = sk0Var;
        this.f13413m = -9223372036854775807L;
        this.f13415o = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void a(boolean z3) {
        u2 u2Var = this.f13404b;
        u2Var.getClass();
        if (z3) {
            boolean z10 = this.f13416p;
            long j = this.f13410i - this.f13414n;
            u2Var.d(this.f13415o, z10 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void b() {
        ls.S(this.g);
        k8 k8Var = this.f13409h;
        k8Var.f13077a = false;
        k8Var.f13078b = 0;
        k8Var.f13079c = 0;
        x8 x8Var = this.f13408f;
        if (x8Var != null) {
            x8Var.a();
        }
        this.f13410i = 0L;
        this.j = false;
        this.f13413m = -9223372036854775807L;
        this.f13415o = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void c(int i4, long j) {
        this.f13413m = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fc  */
    @Override // com.google.android.gms.internal.ads.j8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.sk0 r23) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l8.d(com.google.android.gms.internal.ads.sk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void e(z1 z1Var, h9 h9Var) {
        h9Var.a();
        h9Var.b();
        this.f13403a = h9Var.f11777e;
        h9Var.b();
        this.f13404b = z1Var.m(h9Var.f11776d, 2);
        e9 e9Var = this.f13405c;
        if (e9Var != null) {
            e9Var.a(z1Var, h9Var);
        }
    }
}
