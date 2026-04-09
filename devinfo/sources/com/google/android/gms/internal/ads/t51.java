package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t51 extends h41 {

    /* renamed from: e, reason: collision with root package name */
    public final ne0 f16707e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f16708f;
    public byte[] g;

    /* renamed from: h, reason: collision with root package name */
    public int f16709h;

    /* renamed from: i, reason: collision with root package name */
    public int f16710i;
    public boolean j;

    public t51(byte[] bArr) {
        ne0 ne0Var = new ne0(22, bArr);
        super(false);
        this.f16707e = ne0Var;
        mq0.m(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final long a(gb1 gb1Var) throws x91 {
        c(gb1Var);
        this.f16708f = gb1Var.f11479a;
        byte[] bArr = (byte[]) this.f16707e.f14280b;
        this.g = bArr;
        long j = gb1Var.f11481c;
        int length = bArr.length;
        if (j > length) {
            throw new x91();
        }
        int i4 = (int) j;
        this.f16709h = i4;
        int i10 = length - i4;
        this.f16710i = i10;
        long j8 = gb1Var.f11482d;
        if (j8 != -1) {
            this.f16710i = (int) Math.min(i10, j8);
        }
        this.j = true;
        e(gb1Var);
        return j8 != -1 ? j8 : this.f16710i;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f16710i;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.g;
        bArr2.getClass();
        System.arraycopy(bArr2, this.f16709h, bArr, i4, iMin);
        this.f16709h += iMin;
        this.f16710i -= iMin;
        g(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() {
        if (this.j) {
            this.j = false;
            h();
        }
        this.f16708f = null;
        this.g = null;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        return this.f16708f;
    }
}
