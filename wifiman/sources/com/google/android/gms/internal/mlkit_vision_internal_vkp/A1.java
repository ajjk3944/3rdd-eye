package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
class A1 extends AbstractC4789z1 {

    /* renamed from: c, reason: collision with root package name */
    protected final byte[] f35554c;

    A1(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f35554c = bArr;
    }

    protected int T() {
        return 0;
    }

    final boolean b0(B1 b12, int i10, int i11) {
        if (i11 > b12.m()) {
            throw new IllegalArgumentException("Length too large: " + i11 + m());
        }
        int i12 = i10 + i11;
        if (i12 > b12.m()) {
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + b12.m());
        }
        if (!(b12 instanceof A1)) {
            return b12.s(i10, i12).equals(s(0, i11));
        }
        A1 a12 = (A1) b12;
        byte[] bArr = this.f35554c;
        byte[] bArr2 = a12.f35554c;
        int iT = T() + i11;
        int iT2 = T();
        int iT3 = a12.T() + i10;
        while (iT2 < iT) {
            if (bArr[iT2] != bArr2[iT3]) {
                return false;
            }
            iT2++;
            iT3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.B1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B1) || m() != ((B1) obj).m()) {
            return false;
        }
        if (m() == 0) {
            return true;
        }
        if (!(obj instanceof A1)) {
            return obj.equals(this);
        }
        A1 a12 = (A1) obj;
        int iC = C();
        int iC2 = a12.C();
        if (iC == 0 || iC2 == 0 || iC == iC2) {
            return b0(a12, 0, m());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.B1
    public byte g(int i10) {
        return this.f35554c[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.B1
    byte j(int i10) {
        return this.f35554c[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.B1
    public int m() {
        return this.f35554c.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.B1
    protected final int o(int i10, int i11, int i12) {
        return AbstractC4593h2.b(i10, this.f35554c, T() + i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.B1
    public final B1 s(int i10, int i11) {
        int iY = B1.y(i10, i11, m());
        return iY == 0 ? B1.f35555b : new C4745v1(this.f35554c, T() + i10, iY);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.B1
    final void v(AbstractC4712s1 abstractC4712s1) {
        abstractC4712s1.a(this.f35554c, T(), m());
    }
}
