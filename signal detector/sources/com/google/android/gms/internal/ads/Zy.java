package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Zy {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f12997a;

    public Zy(byte[] bArr, int i) {
        switch (i) {
            case 1:
                this.f12997a = bArr;
                break;
            default:
                this.f12997a = new byte[256];
                for (int i3 = 0; i3 < 256; i3++) {
                    this.f12997a[i3] = (byte) i3;
                }
                int i6 = 0;
                for (int i7 = 0; i7 < 256; i7++) {
                    byte[] bArr2 = this.f12997a;
                    byte b5 = bArr2[i7];
                    i6 = (i6 + b5 + bArr[i7 % bArr.length]) & 255;
                    bArr2[i7] = bArr2[i6];
                    bArr2[i6] = b5;
                }
                break;
        }
    }
}
