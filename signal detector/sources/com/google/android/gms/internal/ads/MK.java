package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class MK extends NK {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9866c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9867d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9868e;

    public MK(int i, int i3, byte[] bArr) {
        QK.b(i, i + i3, bArr.length);
        this.f9866c = bArr;
        this.f9867d = i;
        this.f9868e = i3;
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final byte d(int i) {
        QK.a(i, this.f9868e);
        return this.f9866c[this.f9867d + i];
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final byte e(int i) {
        return this.f9866c[this.f9867d + i];
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final int f() {
        return this.f9868e;
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final QK g(int i, int i3) {
        int iB = QK.b(i, i3, this.f9868e);
        return iB == 0 ? QK.f10609b : new MK(this.f9867d + i, iB, this.f9866c);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final void h(int i, byte[] bArr, int i3, int i6) {
        System.arraycopy(this.f9866c, this.f9867d + i, bArr, i3, i6);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final ByteBuffer i() {
        return ByteBuffer.wrap(this.f9866c, this.f9867d, this.f9868e).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final void j(VK vk) {
        vk.j(this.f9867d, this.f9868e, this.f9866c);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final boolean k(QK qk) {
        return ((qk instanceof OK) || (qk instanceof MK)) ? v(qk, 0, this.f9868e) : qk.k(this);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final int m(int i, int i3, int i6) {
        return AbstractC1528mL.a(i, this.f9866c, this.f9867d + i3, i6);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final D5.b n() {
        return D5.b.i(this.f9867d, this.f9868e, this.f9866c);
    }

    @Override // com.google.android.gms.internal.ads.NK
    public final boolean v(QK qk, int i, int i3) {
        if (i3 > qk.f()) {
            int length = String.valueOf(i3).length();
            int i6 = this.f9868e;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(i6).length());
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(i6);
            throw new IllegalArgumentException(sb.toString());
        }
        int i7 = i + i3;
        if (i7 > qk.f()) {
            int iF = qk.f();
            int length2 = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length2 + 24 + String.valueOf(i3).length() + 2 + String.valueOf(iF).length());
            AbstractC2763b.h(sb2, "Ran off end of other: ", i, ", ", i3);
            throw new IllegalArgumentException(A.f.i(iF, ", ", sb2));
        }
        boolean z6 = qk instanceof OK;
        byte[] bArr = this.f9866c;
        int i8 = this.f9867d;
        if (z6) {
            return QK.c(bArr, i8, ((OK) qk).f10176c, i, i3);
        }
        if (!(qk instanceof MK)) {
            return qk.g(i, i7).equals(g(i8, i3 + i8));
        }
        MK mk = (MK) qk;
        return QK.c(bArr, i8, mk.f9866c, mk.f9867d + i, i3);
    }
}
