package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class x4 extends y4 {

    /* renamed from: r, reason: collision with root package name */
    public final int f5258r;

    public x4(int i10, byte[] bArr) {
        super(bArr);
        y4.e(0, i10, bArr.length);
        this.f5258r = i10;
    }

    @Override // com.google.android.gms.internal.measurement.y4
    public final byte a(int i10) {
        int i11 = this.f5258r;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f5270d[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(c7.a.l(i10, "Index < 0: ", new StringBuilder(String.valueOf(i10).length() + 11)));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
        sb2.append("Index > length: ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.y4
    public final byte b(int i10) {
        return this.f5270d[i10];
    }

    @Override // com.google.android.gms.internal.measurement.y4
    public final int c() {
        return this.f5258r;
    }
}
