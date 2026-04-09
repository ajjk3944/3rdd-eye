package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4365h4 extends AbstractC4338e4 {

    /* renamed from: d, reason: collision with root package name */
    protected final byte[] f35239d;

    C4365h4(byte[] bArr) {
        super();
        bArr.getClass();
        this.f35239d = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.V3
    final void F(X3 x32) {
        x32.a(this.f35239d, K0(), S());
    }

    @Override // com.google.android.gms.internal.measurement.V3
    byte J(int i10) {
        return this.f35239d[i10];
    }

    protected int K0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.V3
    public int S() {
        return this.f35239d.length;
    }

    @Override // com.google.android.gms.internal.measurement.V3
    protected final int T(int i10, int i11, int i12) {
        return F4.a(i10, this.f35239d, K0(), i12);
    }

    @Override // com.google.android.gms.internal.measurement.V3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V3) || S() != ((V3) obj).S()) {
            return false;
        }
        if (S() == 0) {
            return true;
        }
        if (!(obj instanceof C4365h4)) {
            return obj.equals(this);
        }
        C4365h4 c4365h4 = (C4365h4) obj;
        int iJ = j();
        int iJ2 = c4365h4.j();
        if (iJ == 0 || iJ2 == 0 || iJ == iJ2) {
            return q0(c4365h4, 0, S());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.V3
    public byte g(int i10) {
        return this.f35239d[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4338e4
    final boolean q0(V3 v32, int i10, int i11) {
        if (i11 > v32.S()) {
            throw new IllegalArgumentException("Length too large: " + i11 + S());
        }
        if (i11 > v32.S()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i11 + ", " + v32.S());
        }
        if (!(v32 instanceof C4365h4)) {
            return v32.s(0, i11).equals(s(0, i11));
        }
        C4365h4 c4365h4 = (C4365h4) v32;
        byte[] bArr = this.f35239d;
        byte[] bArr2 = c4365h4.f35239d;
        int iK0 = K0() + i11;
        int iK02 = K0();
        int iK03 = c4365h4.K0();
        while (iK02 < iK0) {
            if (bArr[iK02] != bArr2[iK03]) {
                return false;
            }
            iK02++;
            iK03++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.V3
    public final V3 s(int i10, int i11) {
        int iO = V3.o(0, i11, S());
        return iO == 0 ? V3.f35128b : new C4302a4(this.f35239d, K0(), iO);
    }
}
