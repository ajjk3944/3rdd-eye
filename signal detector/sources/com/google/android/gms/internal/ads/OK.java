package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class OK extends NK {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10176c;

    public OK(byte[] bArr) {
        bArr.getClass();
        this.f10176c = bArr;
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final byte d(int i) {
        return this.f10176c[i];
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final byte e(int i) {
        return this.f10176c[i];
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final int f() {
        return this.f10176c.length;
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final QK g(int i, int i3) {
        byte[] bArr = this.f10176c;
        int iB = QK.b(i, i3, bArr.length);
        return iB == 0 ? QK.f10609b : new MK(i, iB, bArr);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final void h(int i, byte[] bArr, int i3, int i6) {
        System.arraycopy(this.f10176c, i, bArr, i3, i6);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final ByteBuffer i() {
        return ByteBuffer.wrap(this.f10176c).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final void j(VK vk) {
        byte[] bArr = this.f10176c;
        vk.j(0, bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final boolean k(QK qk) {
        boolean z6 = qk instanceof OK;
        byte[] bArr = this.f10176c;
        return z6 ? Arrays.equals(bArr, ((OK) qk).f10176c) : qk instanceof MK ? v(qk, 0, bArr.length) : qk.k(this);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final int m(int i, int i3, int i6) {
        return AbstractC1528mL.a(i, this.f10176c, i3, i6);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final D5.b n() {
        byte[] bArr = this.f10176c;
        return D5.b.i(0, bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.ads.NK
    public final boolean v(QK qk, int i, int i3) {
        int iF = qk.f();
        byte[] bArr = this.f10176c;
        if (i3 > iF) {
            int length = String.valueOf(i3).length();
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i6 = i + i3;
        if (i6 <= qk.f()) {
            if (qk instanceof OK) {
                return QK.c(bArr, 0, ((OK) qk).f10176c, i, i3);
            }
            if (!(qk instanceof MK)) {
                return qk.g(i, i6).equals(g(0, i3));
            }
            MK mk = (MK) qk;
            return QK.c(bArr, 0, mk.f9866c, mk.f9867d + i, i3);
        }
        int iF2 = qk.f();
        int length3 = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length3 + 24 + String.valueOf(i3).length() + 2 + String.valueOf(iF2).length());
        AbstractC2763b.h(sb2, "Ran off end of other: ", i, ", ", i3);
        throw new IllegalArgumentException(A.f.i(iF2, ", ", sb2));
    }
}
