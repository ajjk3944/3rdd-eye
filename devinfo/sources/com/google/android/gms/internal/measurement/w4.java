package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w4 extends x4 {

    /* renamed from: d, reason: collision with root package name */
    public final int f20021d;

    public w4(byte[] bArr, int i4) {
        super(bArr);
        x4.g(0, i4, bArr.length);
        this.f20021d = i4;
    }

    @Override // com.google.android.gms.internal.measurement.x4
    public final byte a(int i4) {
        int i10 = this.f20021d;
        if (((i10 - (i4 + 1)) | i4) >= 0) {
            return this.f20033b[i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(d.h.q(i4, "Index < 0: ", new StringBuilder(String.valueOf(i4).length() + 11)));
        }
        throw new ArrayIndexOutOfBoundsException(je.u.q(i4, i10, "Index > length: ", ", ", new StringBuilder(String.valueOf(i4).length() + 18 + String.valueOf(i10).length())));
    }

    @Override // com.google.android.gms.internal.measurement.x4
    public final byte c(int i4) {
        return this.f20033b[i4];
    }

    @Override // com.google.android.gms.internal.measurement.x4
    public final int d() {
        return this.f20021d;
    }
}
