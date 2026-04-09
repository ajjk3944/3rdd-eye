package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xm1 extends ym1 {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f18429c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18430d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18431e;

    public xm1(byte[] bArr, int i4, int i10) {
        bn1.c(i4, i4 + i10, bArr.length);
        this.f18429c = bArr;
        this.f18430d = i4;
        this.f18431e = i10;
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final byte f(int i4) {
        bn1.a(i4, this.f18431e);
        return this.f18429c[this.f18430d + i4];
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final byte g(int i4) {
        return this.f18429c[this.f18430d + i4];
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int i() {
        return this.f18431e;
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final bn1 j(int i4, int i10) {
        int iC = bn1.c(i4, i10, this.f18431e);
        if (iC == 0) {
            return bn1.f9729b;
        }
        return new xm1(this.f18429c, this.f18430d + i4, iC);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void k(int i4, byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f18429c, this.f18430d + i4, bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final ByteBuffer l() {
        return ByteBuffer.wrap(this.f18429c, this.f18430d, this.f18431e).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void m(hn1 hn1Var) {
        hn1Var.j(this.f18430d, this.f18431e, this.f18429c);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final boolean o(bn1 bn1Var) {
        return ((bn1Var instanceof zm1) || (bn1Var instanceof xm1)) ? z(bn1Var, 0, this.f18431e) : bn1Var.o(this);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int q(int i4, int i10, int i11) {
        return yn1.a(i4, this.f18429c, this.f18430d + i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final en1 r() {
        return en1.d(this.f18430d, this.f18431e, this.f18429c);
    }

    @Override // com.google.android.gms.internal.ads.ym1
    public final boolean z(bn1 bn1Var, int i4, int i10) {
        if (i10 > bn1Var.i()) {
            int length = String.valueOf(i10).length();
            int i11 = this.f18431e;
            StringBuilder sb2 = new StringBuilder(length + 18 + String.valueOf(i11).length());
            sb2.append("Length too large: ");
            sb2.append(i10);
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i12 = i4 + i10;
        if (i12 > bn1Var.i()) {
            int i13 = bn1Var.i();
            int length2 = String.valueOf(i4).length();
            StringBuilder sb3 = new StringBuilder(length2 + 24 + String.valueOf(i10).length() + 2 + String.valueOf(i13).length());
            r5.c.q(i4, i10, "Ran off end of other: ", ", ", sb3);
            throw new IllegalArgumentException(d.h.q(i13, ", ", sb3));
        }
        boolean z3 = bn1Var instanceof zm1;
        byte[] bArr = this.f18429c;
        int i14 = this.f18430d;
        if (z3) {
            return bn1.d(bArr, i14, ((zm1) bn1Var).f19124c, i4, i10);
        }
        if (!(bn1Var instanceof xm1)) {
            return bn1Var.j(i4, i12).equals(j(i14, i10 + i14));
        }
        xm1 xm1Var = (xm1) bn1Var;
        return bn1.d(bArr, i14, xm1Var.f18429c, xm1Var.f18430d + i4, i10);
    }
}
