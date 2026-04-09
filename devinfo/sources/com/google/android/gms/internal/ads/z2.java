package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z2 implements x1 {

    /* renamed from: d, reason: collision with root package name */
    public final w5 f18966d;

    /* renamed from: e, reason: collision with root package name */
    public int f18967e;
    public a3 g;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public c3 f18971k;

    /* renamed from: o, reason: collision with root package name */
    public int f18975o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18976p;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18965c = true;

    /* renamed from: a, reason: collision with root package name */
    public final sk0 f18963a = new sk0(12);

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.z0 f18964b = new androidx.recyclerview.widget.z0();

    /* renamed from: f, reason: collision with root package name */
    public z1 f18968f = new w5(16);

    /* renamed from: i, reason: collision with root package name */
    public c3[] f18970i = new c3[0];

    /* renamed from: m, reason: collision with root package name */
    public long f18973m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f18974n = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f18972l = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f18969h = -9223372036854775807L;

    public z2(w5 w5Var) {
        this.f18966d = w5Var;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) {
        sk0 sk0Var = this.f18963a;
        y1Var.M1(0, 12, sk0Var.f16446a);
        sk0Var.E(0);
        if (sk0Var.c() != 1179011410) {
            return false;
        }
        sk0Var.G(4);
        return sk0Var.c() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        this.f18967e = 0;
        if (this.f18965c) {
            z1Var = new b5.i0(z1Var, this.f18966d);
        }
        this.f18968f = z1Var;
        this.j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        this.j = -1L;
        this.f18971k = null;
        for (c3 c3Var : this.f18970i) {
            if (c3Var.f9950k == 0) {
                c3Var.f9949i = 0;
            } else {
                c3Var.f9949i = c3Var.f9953n[bq0.q(c3Var.f9952m, j, true)];
            }
        }
        if (j == 0) {
            this.f18967e = this.f18970i.length != 0 ? 3 : 0;
        } else {
            this.f18967e = 6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x03bf  */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.y1 r31, com.google.android.gms.internal.ads.c2 r32) throws java.io.EOFException, java.io.InterruptedIOException, com.google.android.gms.internal.ads.ua {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z2.g(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.c2):int");
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
