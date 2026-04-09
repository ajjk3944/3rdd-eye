package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f1 extends g1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f20117d;

    public f1(byte[] bArr, int i4) {
        super(bArr);
        g1.f(0, i4, bArr.length);
        this.f20117d = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final byte a(int i4) {
        int i10 = this.f20117d;
        if (((i10 - (i4 + 1)) | i4) >= 0) {
            return this.f20133b[i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(je.u.r(i4, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a0.g.i(i4, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final byte c(int i4) {
        return this.f20133b[i4];
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final int d() {
        return this.f20117d;
    }
}
