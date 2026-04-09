package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f8 implements j8 {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f11034x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11035a;

    /* renamed from: d, reason: collision with root package name */
    public final String f11038d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11039e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11040f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public u2 f11041h;

    /* renamed from: i, reason: collision with root package name */
    public u2 f11042i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11045m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11046n;

    /* renamed from: q, reason: collision with root package name */
    public int f11049q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11050r;

    /* renamed from: t, reason: collision with root package name */
    public int f11052t;

    /* renamed from: v, reason: collision with root package name */
    public u2 f11054v;

    /* renamed from: w, reason: collision with root package name */
    public long f11055w;

    /* renamed from: b, reason: collision with root package name */
    public final hk0 f11036b = new hk0(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final sk0 f11037c = new sk0(Arrays.copyOf(f11034x, 10));

    /* renamed from: o, reason: collision with root package name */
    public int f11047o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f11048p = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f11051s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public long f11053u = -9223372036854775807L;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f11043k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f11044l = 256;

    public f8(String str, int i4, String str2, boolean z3) {
        this.f11035a = z3;
        this.f11038d = str;
        this.f11039e = i4;
        this.f11040f = str2;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void b() {
        this.f11053u = -9223372036854775807L;
        this.f11046n = false;
        this.j = 0;
        this.f11043k = 0;
        this.f11044l = 256;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void c(int i4, long j) {
        this.f11053u = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x029d, code lost:
    
        r20.f11049q = (r9 & 8) >> 3;
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a9, code lost:
    
        if (r5 == ((r9 & 1) ^ 1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ab, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ad, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ae, code lost:
    
        r20.f11045m = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b2, code lost:
    
        if (r20.f11046n != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b4, code lost:
    
        r20.j = r5;
        r20.f11043k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ba, code lost:
    
        r20.j = r16;
        r20.f11043k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c1, code lost:
    
        r21.E(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0221, code lost:
    
        r19 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0315 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.j8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.sk0 r21) throws com.google.android.gms.internal.ads.ua {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f8.d(com.google.android.gms.internal.ads.sk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void e(z1 z1Var, h9 h9Var) {
        h9Var.a();
        h9Var.b();
        this.g = h9Var.f11777e;
        h9Var.b();
        u2 u2VarM = z1Var.m(h9Var.f11776d, 1);
        this.f11041h = u2VarM;
        this.f11054v = u2VarM;
        if (!this.f11035a) {
            this.f11042i = new w1();
            return;
        }
        h9Var.a();
        h9Var.b();
        u2 u2VarM2 = z1Var.m(h9Var.f11776d, 5);
        this.f11042i = u2VarM2;
        lw1 lw1Var = new lw1();
        h9Var.b();
        lw1Var.f13652a = h9Var.f11777e;
        lw1Var.d(this.f11040f);
        lw1Var.e("application/id3");
        u2VarM2.f(new mx1(lw1Var));
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void a(boolean z3) {
    }
}
