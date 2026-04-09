package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4302a4 extends C4365h4 {

    /* renamed from: e, reason: collision with root package name */
    private final int f35177e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35178f;

    C4302a4(byte[] bArr, int i10, int i11) {
        super(bArr);
        V3.o(i10, i10 + i11, bArr.length);
        this.f35177e = i10;
        this.f35178f = i11;
    }

    @Override // com.google.android.gms.internal.measurement.C4365h4, com.google.android.gms.internal.measurement.V3
    final byte J(int i10) {
        return this.f35239d[this.f35177e + i10];
    }

    @Override // com.google.android.gms.internal.measurement.C4365h4
    protected final int K0() {
        return this.f35177e;
    }

    @Override // com.google.android.gms.internal.measurement.C4365h4, com.google.android.gms.internal.measurement.V3
    public final int S() {
        return this.f35178f;
    }

    @Override // com.google.android.gms.internal.measurement.C4365h4, com.google.android.gms.internal.measurement.V3
    public final byte g(int i10) {
        int iS = S();
        if (((iS - (i10 + 1)) | i10) >= 0) {
            return this.f35239d[this.f35177e + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + iS);
    }
}
