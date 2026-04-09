package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class U2 implements T0 {

    /* renamed from: a, reason: collision with root package name */
    public final T0 f11590a;

    /* renamed from: b, reason: collision with root package name */
    public final R2 f11591b;

    /* renamed from: g, reason: collision with root package name */
    public S2 f11596g;

    /* renamed from: h, reason: collision with root package name */
    public TP f11597h;
    public boolean i;

    /* renamed from: d, reason: collision with root package name */
    public int f11593d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f11594e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f11595f = Vt.f12097b;

    /* renamed from: c, reason: collision with root package name */
    public final C2036vr f11592c = new C2036vr();

    public U2(T0 t02, R2 r22) {
        this.f11590a = t02;
        this.f11591b = r22;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void a(int i, C2036vr c2036vr) {
        b(c2036vr, i, 0);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void b(C2036vr c2036vr, int i, int i3) {
        if (this.f11596g == null) {
            this.f11590a.b(c2036vr, i, i3);
            return;
        }
        g(i);
        c2036vr.H(this.f11594e, i, this.f11595f);
        this.f11594e += i;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void c(long j6, int i, int i3, int i6, S0 s02) {
        if (this.f11596g == null) {
            this.f11590a.c(j6, i, i3, i6, s02);
            return;
        }
        AbstractC0582Jp.y("DRM on subtitles is not supported", s02 == null);
        int i7 = (this.f11594e - i6) - i3;
        try {
            this.f11596g.h(this.f11595f, i7, i3, new T2(this, j6, i));
        } catch (RuntimeException e6) {
            if (!this.i) {
                throw e6;
            }
            AbstractC2022vd.z("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e6);
        }
        int i8 = i7 + i3;
        this.f11593d = i8;
        if (i8 == this.f11594e) {
            this.f11593d = 0;
            this.f11594e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final int d(IN in, int i, boolean z6) throws EOFException {
        if (this.f11596g == null) {
            return this.f11590a.d(in, i, z6);
        }
        g(i);
        int iD = in.d(this.f11594e, i, this.f11595f);
        if (iD != -1) {
            this.f11594e += iD;
            return iD;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void e(TP tp) {
        String str = tp.f11397m;
        str.getClass();
        AbstractC0582Jp.m(D4.f(str) == 3);
        boolean zEquals = tp.equals(this.f11597h);
        R2 r22 = this.f11591b;
        if (!zEquals) {
            this.f11597h = tp;
            this.f11596g = r22.h(tp) ? r22.l(tp) : null;
        }
        S2 s22 = this.f11596g;
        T0 t02 = this.f11590a;
        if (s22 == null) {
            t02.e(tp);
            return;
        }
        C1855sP c1855sP = new C1855sP(tp);
        c1855sP.e("application/x-media3-cues");
        c1855sP.i = str;
        c1855sP.f16737q = Long.MAX_VALUE;
        c1855sP.f16720J = r22.j(tp);
        t02.e(new TP(c1855sP));
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final int f(IN in, int i, boolean z6) {
        return d(in, i, z6);
    }

    public final void g(int i) {
        int length = this.f11595f.length;
        int i3 = this.f11594e;
        if (length - i3 >= i) {
            return;
        }
        int i6 = i3 - this.f11593d;
        int iMax = Math.max(i6 + i6, i + i6);
        byte[] bArr = this.f11595f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f11593d, bArr2, 0, i6);
        this.f11593d = 0;
        this.f11594e = i6;
        this.f11595f = bArr2;
    }
}
