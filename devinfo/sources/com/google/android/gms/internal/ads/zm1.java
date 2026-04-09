package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zm1 extends ym1 {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f19124c;

    public zm1(byte[] bArr) {
        bArr.getClass();
        this.f19124c = bArr;
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final byte f(int i4) {
        return this.f19124c[i4];
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final byte g(int i4) {
        return this.f19124c[i4];
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int i() {
        return this.f19124c.length;
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final bn1 j(int i4, int i10) {
        byte[] bArr = this.f19124c;
        int iC = bn1.c(i4, i10, bArr.length);
        return iC == 0 ? bn1.f9729b : new xm1(bArr, i4, iC);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void k(int i4, byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f19124c, i4, bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final ByteBuffer l() {
        return ByteBuffer.wrap(this.f19124c).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void m(hn1 hn1Var) {
        byte[] bArr = this.f19124c;
        hn1Var.j(0, bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final boolean o(bn1 bn1Var) {
        boolean z3 = bn1Var instanceof zm1;
        byte[] bArr = this.f19124c;
        return z3 ? Arrays.equals(bArr, ((zm1) bn1Var).f19124c) : bn1Var instanceof xm1 ? z(bn1Var, 0, bArr.length) : bn1Var.o(this);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int q(int i4, int i10, int i11) {
        return yn1.a(i4, this.f19124c, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final en1 r() {
        byte[] bArr = this.f19124c;
        return en1.d(0, bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.ads.ym1
    public final boolean z(bn1 bn1Var, int i4, int i10) {
        int i11 = bn1Var.i();
        byte[] bArr = this.f19124c;
        if (i10 > i11) {
            int length = String.valueOf(i10).length();
            int length2 = bArr.length;
            StringBuilder sb2 = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb2.append("Length too large: ");
            sb2.append(i10);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i12 = i4 + i10;
        if (i12 <= bn1Var.i()) {
            if (bn1Var instanceof zm1) {
                return bn1.d(bArr, 0, ((zm1) bn1Var).f19124c, i4, i10);
            }
            if (!(bn1Var instanceof xm1)) {
                return bn1Var.j(i4, i12).equals(j(0, i10));
            }
            xm1 xm1Var = (xm1) bn1Var;
            return bn1.d(bArr, 0, xm1Var.f18429c, xm1Var.f18430d + i4, i10);
        }
        int i13 = bn1Var.i();
        int length3 = String.valueOf(i4).length();
        StringBuilder sb3 = new StringBuilder(length3 + 24 + String.valueOf(i10).length() + 2 + String.valueOf(i13).length());
        r5.c.q(i4, i10, "Ran off end of other: ", ", ", sb3);
        throw new IllegalArgumentException(d.h.q(i13, ", ", sb3));
    }
}
