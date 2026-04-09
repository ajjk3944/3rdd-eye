package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t6 implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final u2 f16711a;

    /* renamed from: b, reason: collision with root package name */
    public final r6 f16712b;
    public s6 g;

    /* renamed from: h, reason: collision with root package name */
    public mx1 f16717h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16718i;

    /* renamed from: d, reason: collision with root package name */
    public int f16714d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f16715e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f16716f = bq0.f9769b;

    /* renamed from: c, reason: collision with root package name */
    public final sk0 f16713c = new sk0();

    public t6(u2 u2Var, r6 r6Var) {
        this.f16711a = u2Var;
        this.f16712b = r6Var;
    }

    public final void a(int i4) {
        int length = this.f16716f.length;
        int i10 = this.f16715e;
        if (length - i10 >= i4) {
            return;
        }
        int i11 = i10 - this.f16714d;
        int iMax = Math.max(i11 + i11, i4 + i11);
        byte[] bArr = this.f16716f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f16714d, bArr2, 0, i11);
        this.f16714d = 0;
        this.f16715e = i11;
        this.f16716f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void b(int i4, sk0 sk0Var) {
        c(sk0Var, i4, 0);
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void c(sk0 sk0Var, int i4, int i10) {
        if (this.g == null) {
            this.f16711a.c(sk0Var, i4, i10);
            return;
        }
        a(i4);
        sk0Var.H(this.f16715e, i4, this.f16716f);
        this.f16715e += i4;
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void d(long j, int i4, int i10, int i11, t2 t2Var) {
        if (this.g == null) {
            this.f16711a.d(j, i4, i10, i11, t2Var);
            return;
        }
        mq0.y("DRM on subtitles is not supported", t2Var == null);
        int i12 = (this.f16715e - i11) - i10;
        try {
            this.g.d(this.f16716f, i12, i10, new ca.c(this, j, i4));
        } catch (RuntimeException e2) {
            if (!this.f16718i) {
                throw e2;
            }
            ls.y("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e2);
        }
        int i13 = i12 + i10;
        this.f16714d = i13;
        if (i13 == this.f16715e) {
            this.f16714d = 0;
            this.f16715e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final int e(vs1 vs1Var, int i4, boolean z3) throws EOFException {
        if (this.g == null) {
            return this.f16711a.e(vs1Var, i4, z3);
        }
        a(i4);
        int iD = vs1Var.d(this.f16715e, i4, this.f16716f);
        if (iD != -1) {
            this.f16715e += iD;
            return iD;
        }
        if (z3) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void f(mx1 mx1Var) {
        String str = mx1Var.f14052m;
        str.getClass();
        mq0.m(ia.f(str) == 3);
        boolean zEquals = mx1Var.equals(this.f16717h);
        r6 r6Var = this.f16712b;
        if (!zEquals) {
            this.f16717h = mx1Var;
            this.g = r6Var.j(mx1Var) ? r6Var.n(mx1Var) : null;
        }
        s6 s6Var = this.g;
        u2 u2Var = this.f16711a;
        if (s6Var == null) {
            u2Var.f(mx1Var);
            return;
        }
        lw1 lw1Var = new lw1(mx1Var);
        lw1Var.e("application/x-media3-cues");
        lw1Var.f13659i = str;
        lw1Var.f13666q = Long.MAX_VALUE;
        lw1Var.J = r6Var.l(mx1Var);
        u2Var.f(new mx1(lw1Var));
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final int g(vs1 vs1Var, int i4, boolean z3) {
        return e(vs1Var, i4, z3);
    }
}
